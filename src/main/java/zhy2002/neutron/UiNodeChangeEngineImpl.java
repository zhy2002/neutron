package zhy2002.neutron;

import javax.validation.constraints.NotNull;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

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
    /**
     * A queue of events not yet put into a Cycle.
     */
    private final Deque<UiNodeEvent> eventDeque = new ArrayDeque<>();
    /**
     * A queue of cycles in current session.
     */
    private final Deque<Cycle> cycleDeque = new ArrayDeque<>();

    public UiNodeChangeEngineImpl() {
    }

    public CycleModeEnum getCycleMode() {
        return cycleMode;
    }

    public void setCycleMode(@NotNull CycleModeEnum cycleMode) {
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
    }

    @Override
    public void rollbackSession() {
        if (!inSession)
            return;

        rollbackSessionInternal();
    }

    private void rollbackSessionInternal() {
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
        //    clearCycleState();
    }

    @Override
    public boolean undo() {
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
    public boolean isInCycle() {
        return inCycle;
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
            commitSessionInternal();
        }
    }

    private void processEventInternal(UiNodeEvent event) {
        popUndoneCycles();
        eventDeque.add(event);
        if (getCycleMode() == CycleModeEnum.Auto) {
            processCycle();
        }
    }

    private void popUndoneCycles() {
        while (!cycleDeque.isEmpty()) {
            if(cycleDeque.peekLast().canApply()) {
                cycleDeque.pollLast();
            } else {
                break;
            }
        }
    }

    /**
     * Process all enqueued (root) events.
     * Root event is created by client via API calls
     * rather than the change engine.
     * When this method exists eventDeque is empty.
     */
    public void processCycle() {
        if (inCycle) //leave to outer cycle to process
            return;

        if (eventDeque.isEmpty()) //nothing to process
            return;

        //create a new cycle
        Cycle currentCycle = new Cycle();
        cycleDeque.add(currentCycle);
        inCycle = true;

        try {
            do { //process all ticks of the cycle
                currentCycle.pollAll(eventDeque);
                currentCycle.processTick();
            } while (!eventDeque.isEmpty());
            inCycle = false;
        } catch (UiNodeException ex) {
            //revert to the state when last cycle is complete
            inCycle = false;
            cycleDeque.peekLast().revert();
            cycleDeque.pollLast();
            eventDeque.clear();
            throw ex;
        }

        currentCycle.notifyChanges();
    }

}