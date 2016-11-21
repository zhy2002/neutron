package zhy2002.neutron;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/**
 * The default implementation.
 */
public class UiNodeChangeEngineImpl implements UiNodeChangeEngine {

    private CycleModeEnum cycleMode = CycleModeEnum.Auto;

    private boolean inSession = false;
    private final Deque<UiNodeEvent> eventDeque = new ArrayDeque<>();
    private final Deque<Cycle> cycleDeque = new ArrayDeque<>();//a queue of cycles in session.
    private final UiNodeRuleAgendaImpl agenda = new UiNodeRuleAgendaImpl();
    private final TickPhase[] phases = {DefaultPhases.Pre, DefaultPhases.Post, DefaultPhases.Validate, DefaultPhases.CleanUp};
    private TickPhase currentPhase;
    private UiNodeRuleActivation currentActivation;

    //region change management

    @Override
    public CycleModeEnum getCycleMode() {
        return cycleMode;
    }

    @Override
    public void beginSession() {
        if (inSession)
            return;

        beginSessionInternal();
    }

    protected void beginSessionInternal() {
        inSession = true;
    }

    @Override
    public void commitSession() {
        if (!inSession)
            return;

        commitSessionInternal();
    }

    protected void commitSessionInternal() {
        cycleDeque.clear();
        inSession = false;
    }

    @Override
    public void rollbackSession() {
        if (!inSession)
            return;

        rollbackSessionInternal();
    }

    protected void rollbackSessionInternal() {
        if(!cycleDeque.isEmpty()) {
            Cycle first = cycleDeque.poll();
            first.revert();
            cycleDeque.clear();
        }

        inSession = false;
    }

    @Override
    public boolean isInSession() {
        return inSession;
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

    @Override
    public TickPhase getCurrentPhase() {
        return currentPhase;
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

    //todo canUndo and canRedo methods

    @Override
    public boolean undo() {
        Iterator<Cycle> iterator = cycleDeque.descendingIterator();
        while (iterator.hasNext()) {
            Cycle cycle = iterator.next();
            if(cycle.isApplied()) {
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
            if(!cycle.isApplied()) {
                cycle.apply();
                return true;
            }
        }
        return false;
    }

    private boolean inCycle;

    private void processCycle() {
        if(inCycle)
            return;

        inCycle = true;
        Cycle currentCycle = new Cycle();
        if(!eventDeque.isEmpty()) {
            cycleDeque.add(currentCycle);
        }
        while (!eventDeque.isEmpty()) {
            processTick(currentCycle);
        }
        inCycle = false;
        currentCycle.notifyChanges();
    }

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
        if(!cycleDeque.isEmpty()) {
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

    public UiNodeRuleActivation getCurrentActivation() {
        return currentActivation;
    }

    //endregion
}
