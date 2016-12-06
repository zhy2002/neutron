package zhy2002.neutron;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/**
 * The default implementation.
 */
public class UiNodeChangeEngineImpl implements UiNodeChangeEngine {

    private CycleModeEnum cycleMode = CycleModeEnum.Auto;

    private boolean inSession;
    private boolean inCycle;
    private TickPhase currentPhase;
    private UiNodeRuleActivation currentActivation;
    private final Deque<UiNodeEvent> eventDeque = new ArrayDeque<>();
    private final Deque<Cycle> cycleDeque = new ArrayDeque<>();//a queue of cycles in session.
    private final UiNodeRuleAgendaImpl agenda = new UiNodeRuleAgendaImpl();
    private final TickPhase[] phases = {PredefinedPhases.Pre, PredefinedPhases.Post, PredefinedPhases.Validate, PredefinedPhases.CleanUp};


    //region change management

    @Override
    public CycleModeEnum getCycleMode() {
        return cycleMode;
    }

    public UiNodeRuleActivation getCurrentActivation() {
        return currentActivation;
    }

    @Override
    public TickPhase getCurrentPhase() {
        return currentPhase;
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
        Iterator<Cycle> iterator = cycleDeque.descendingIterator();
        while (iterator.hasNext()) {
            Cycle cycle = iterator.next();
            if (cycle.isApplied()) {
                cycle.revert();
            }
        }
        cycleDeque.clear();
        clearCycleState();
    }

    @Override
    public boolean isInSession() {
        return inSession;
    }

    //todo canUndo and canRedo methods

    private void clearCycleState() {
        currentActivation = null;
        currentPhase = null;
        agenda.clear();
        inCycle = false;
        eventDeque.clear();
    }

    @Override
    public boolean undo() {
        clearCycleState();
        Iterator<Cycle> iterator = cycleDeque.descendingIterator();
        while (iterator.hasNext()) {
            Cycle cycle = iterator.next();
            if (cycle.isApplied()) {
                cycle.revert();
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean redo() {
        Iterator<Cycle> iterator = cycleDeque.iterator();
        while (iterator.hasNext()) {
            Cycle cycle = iterator.next();
            if (!cycle.isApplied()) {
                cycle.apply();
                return true;
            }
        }
        return false;
    }

    @Override
    public void processEvent(UiNodeEvent event) {
        boolean autoCommit = false;
        if (!isInSession()) {
            beginSessionInternal();
            autoCommit = true;
        }

        try {
            processEventInternal(event);
        } catch (UiNodeEventException ex) {
            if (autoCommit) {
                rollbackSession();
            }
            throw ex;
        }

        if (autoCommit) {
            commitSessionInternal();
        }
    }

    private void processEventInternal(UiNodeEvent event) {
        queueEvent(event);
        if (getCycleMode() == CycleModeEnum.Auto) {
            try {
                processCycle();
            } catch (UiNodeEventException ex) {
                undo();
                throw ex;
            }
        }
    }

    /**
     * Process all enqueued (root) events.
     * Root event is created by client via API calls
     * rather than the change engine.
     */
    private void processCycle() {
        if (inCycle) //leave to outer cycle to process
            return;

        if (eventDeque.isEmpty())
            return;

        inCycle = true;
        Cycle currentCycle = new Cycle();
        cycleDeque.add(currentCycle);
        do {
            processTick(currentCycle);
        } while (!eventDeque.isEmpty());
        inCycle = false;
        currentCycle.notifyChanges();
    }

    /**
     * Fire all rules activated by the events in the event queue
     * when this method is called.
     *
     * @param cycle the current cycle object.
     */
    private void processTick(Cycle cycle) {
        while (!eventDeque.isEmpty()) {
            UiNodeEvent event = eventDeque.poll();
            agenda.addActivations(event);
            cycle.add(event);
        }
        boolean changesApplied = false;
        for (TickPhase phase : phases) {
            currentPhase = phase;
            if (!changesApplied && phase.PostChanges()) {
                applyChanges();
                changesApplied = true;
            }
            processPhase(phase);
        }
        agenda.clear();
        currentPhase = null;
        if (!changesApplied) {
            applyChanges();
        }
    }

    private void applyChanges() {
        if (!cycleDeque.isEmpty()) {
            cycleDeque.peekLast().apply();
        }
    }

    protected void processPhase(TickPhase phase) {
        while (!agenda.isEmpty(phase)) {
            UiNodeRuleActivation activation = agenda.getNextActivation(phase);
            currentActivation = activation;
            activation.fire();
            currentActivation = null;
        }
    }

    private void queueEvent(UiNodeEvent event) {
        eventDeque.add(event);
    }

    //endregion
}
