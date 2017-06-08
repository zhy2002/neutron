package zhy2002.neutron;

import zhy2002.neutron.exception.UiNodeEventException;
import zhy2002.neutron.exception.UiNodeException;

import javax.inject.Inject;
import javax.validation.constraints.NotNull;
import java.util.*;

/**
 * The default implementation.
 */
public class UiNodeChangeEngineImpl implements UiNodeChangeEngine {

    /**
     * Whether cycle is automatically started or not.
     */
    private CycleModeEnum cycleMode = CycleModeEnum.Auto;
    /**
     * True if a session has started by not rolled back or committed.
     */
    private boolean inSession;
    /**
     * True if is processing a cycle.
     */
    private boolean inCycle;

    private boolean commitOnFlush;
    /**
     * Event mode.
     */
    private EngineEventModeEnum eventMode = EngineEventModeEnum.Send;
    /**
     * A queue of events not yet put into a Cycle.
     */
    private final Deque<UiNodeEvent> eventDeque = new ArrayDeque<>();
    /**
     * A queue of cycles in current session.
     */
    private final Deque<Cycle> cycleDeque = new ArrayDeque<>();

    @Inject
    public UiNodeChangeEngineImpl() {
    }

    @Override
    public CycleModeEnum getCycleMode() {
        return cycleMode;
    }

    @Override
    public void setCycleMode(@NotNull CycleModeEnum cycleMode) {
        if (isInCycle() && cycleMode != this.cycleMode)
            throw new UiNodeException("Cannot change cycle mode in a cycle.");
        this.cycleMode = cycleMode;
    }

    @Override
    public void beginSession() {
        if (inSession)
            return;

        beginSessionInternal();
    }

    private void beginSessionInternal() {
        inSession = true;
    }

    @Override
    public void commitSession() {
        if (!inSession)
            return;

        commitSessionInternal();
    }

    private void commitSessionInternal() {
        if (isInCycle())
            throw new UiNodeException("Cannot commit during a cycle.");

        processCycle();
        cycleDeque.clear();
        inSession = false;
        commitOnFlush = false;
    }

    @Override
    public void flush() {
        if (commitOnFlush) {
            try {
                commitSessionInternal();
            } catch (RuntimeException ex) {
                rollbackSession();
                throw ex;
            }
        } else {
            processCycle();
        }
    }

    @Override
    public void rollbackSession() {
        if (!inSession)
            return;

        rollbackSessionInternal();
    }

    private void rollbackSessionInternal() {
        if (getCycleMode() == CycleModeEnum.Debouncing) {
            clearTemporaryChanges();
        }

        if (isInCycle())
            throw new UiNodeException("Cannot rollback during a cycle.");

        Iterator<Cycle> iterator = cycleDeque.descendingIterator();
        while (iterator.hasNext()) {
            Cycle cycle = iterator.next();
            if (cycle.canRevert()) {
                cycle.revert();
            }
        }
        cycleDeque.clear();
        inSession = false;
    }

    @Override
    public boolean undo() {
        if (getCycleMode() == CycleModeEnum.Debouncing) {
            clearTemporaryChanges();
        }
        eventDeque.clear();

        if (isInCycle())
            throw new UiNodeException("Cannot undo during a cycle.");

        Cycle cycle = findLastRevertibleCycle();
        if (cycle != null) {
            cycle.revert();
            return true;
        }
        return false;
    }

    private Cycle findLastRevertibleCycle() {
        Iterator<Cycle> iterator = cycleDeque.descendingIterator();
        while (iterator.hasNext()) {
            Cycle cycle = iterator.next();
            if (cycle.canRevert()) {
                return cycle;
            }
        }
        return null;
    }

    @Override
    public boolean redo() {
        if (isInCycle())
            throw new UiNodeException("Cannot redo during a cycle.");

        Cycle cycle = findFirstApplicableCycle();
        if (cycle != null) {
            if (getCycleMode() == CycleModeEnum.Debouncing) {
                clearTemporaryChanges();
            }
            eventDeque.clear();

            cycle.apply();
            return true;
        }
        return false;
    }

    private Cycle findFirstApplicableCycle() {
        Iterator<Cycle> iterator = cycleDeque.iterator();
        while (iterator.hasNext()) {
            Cycle cycle = iterator.next();
            if (cycle.canApply()) {
                return cycle;
            }
        }
        return null;
    }

    @Override
    public boolean isInSession() {
        return inSession;
    }

    @Override
    public boolean canUndo() {
        return findLastRevertibleCycle() != null;
    }

    @Override
    public boolean canRedo() {
        return findFirstApplicableCycle() != null;
    }

    /**
     * @return true if currently processing a cycle.
     */
    @Override
    public boolean isInCycle() {
        return inCycle;
    }

    @Override
    public EngineEventModeEnum getEventMode() {
        return eventMode;
    }

    @Override
    public void setEventMode(EngineEventModeEnum mode) {
        if (mode == null) {
            mode = EngineEventModeEnum.Send;
        }
        this.eventMode = mode;
    }

    @Override
    public CycleStatus getCurrentCycleStatus() {
        return isInCycle() ? cycleDeque.getLast() : null;
    }

    @Override
    public void processEvent(UiNodeEvent event) {
        boolean autoCommit = !isInSession();
        if (autoCommit) {
            beginSessionInternal();
        }

        try {
            processEventInternal(event);
        } catch (UiNodeEventException ex) {
            if (autoCommit) {
                rollbackSessionInternal();
            }
            throw ex;
        }

        if (autoCommit) {
            if (getCycleMode() == CycleModeEnum.Debouncing) {
                commitOnFlush = true;
            } else {
                commitSessionInternal();
            }
        }
    }

    private void processEventInternal(UiNodeEvent event) {

        if (getCycleMode() == CycleModeEnum.Debouncing) {
            if (!isInCycle()) {
                if (event instanceof StateChangeEvent) {
                    StateChangeEvent<?> previousEvent = ((StateChangeEvent<?>) event).passThrough();
                    if (previousEvent != null) {
                        eventDeque.remove(previousEvent);
                    }
                }
            }
            eventDeque.add(event);
        } else {
            //only pop undone cycles at the bottom of stack
            if (!isInCycle()) {
                popUndoneCycles();
            }
            eventDeque.add(event);
            if (getCycleMode() == CycleModeEnum.Auto) {
                processCycle();
            }
        }
    }

    private void popUndoneCycles() {
        clearTemporaryChanges();
        while (!cycleDeque.isEmpty()) {
            if (cycleDeque.peekLast().canApply()) {
                cycleDeque.pollLast();
            } else {
                break;
            }
        }
    }

    private void clearTemporaryChanges() {
        for (UiNodeEvent event : eventDeque) {
            if (event instanceof StateChangeEvent) {
                event.getOrigin().clearTemporary();
            }
        }
        commitOnFlush = false;
    }

    /**
     * Process all enqueued (root) events.
     * Root event is created by client via API calls
     * rather than the change engine.
     * When this method exists eventDeque is empty.
     */
    public void processCycle() {
        if (getCycleMode() == CycleModeEnum.Debouncing) {
            clearTemporaryChanges();
        }

        if (eventDeque.isEmpty())
            return; //nothing to process

        if (isInCycle()) {
            if (eventMode == EngineEventModeEnum.Post)
                return; //leave it to the outer processCycle

            //parse event if in Send event mode
            Cycle onGoingCycle = cycleDeque.peekLast();
            onGoingCycle.pollAll(eventDeque);
            onGoingCycle.resetTick();
            return;
        }

        Cycle currentCycle = new Cycle();
        cycleDeque.add(currentCycle);
        inCycle = true;
        //process all ticks of the cycle
        try {
            do {
                currentCycle.pollAll(eventDeque);
                currentCycle.processTick();
            } while (!eventDeque.isEmpty());
            currentCycle.queueChangeNotifications();
            inCycle = false;
        } catch (UiNodeException ex) {
            //revert to the state when last cycle is complete
            inCycle = false;
            cycleDeque.peekLast().revert();
            cycleDeque.pollLast();
            eventDeque.clear();
            throw ex;
        }


        currentCycle.sendNotifications();
    }

    @Override
    public void queueNotification(UiNodeNotification uiNodeNotification) {
        if (!isInCycle())
            throw new UiNodeException("Cannot queue notification outside of a cycle.");

        cycleDeque.peekLast().queueNotification(uiNodeNotification);
    }
}
