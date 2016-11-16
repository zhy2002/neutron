package zhy2002.neutron;

import zhy2002.neutron.event.DefaultPhases;
import zhy2002.neutron.event.TickPhase;
import zhy2002.neutron.event.UiNodeEvent;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/**
 * Created by john.zhang on 16/11/2016.
 */
public class UiNodeChangeEngine {

    //private SessionModeEnum sessionMode = SessionModeEnum.Auto;
    private CycleModeEnum cycleMode = CycleModeEnum.Auto;

    private boolean inSession = false;
    private final Deque<UiNodeEvent> eventDeque = new ArrayDeque<>();
    private final Deque<Cycle> cycleDeque = new ArrayDeque<>();//a queue of cycles in session.
    private final UiNodeRuleAgenda agenda = new UiNodeRuleAgenda();
    private TickPhase[] phases = {DefaultPhases.Pre, DefaultPhases.Post, DefaultPhases.Validate, DefaultPhases.CleanUp};
    private TickPhase currentPhase;

    //region change management

//    public SessionModeEnum getSessionMode() {
//        return sessionMode;
//    }
//
//    public void setCommitMode(SessionModeEnum commitMode) {
//        if (this.sessionMode != SessionModeEnum.Auto && commitMode == SessionModeEnum.Auto) {
//            commitSession();
//            this.sessionMode = commitMode;
//        }
//    }

    public CycleModeEnum getCycleMode() {
        return cycleMode;
    }

    public void beginSession() {
        if (inSession)
            return;

        beginSessionInternal();
    }

    protected void beginSessionInternal() {
        inSession = true;
    }

    public void commitSession() {
        if (!inSession)
            return;

        commitSessionInternal();
    }

    protected void commitSessionInternal() {
        cycleDeque.clear();
        inSession = false;
    }

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

    public boolean isInSession() {
        return inSession;
    }

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
        if(!eventDeque.isEmpty()) {
            cycleDeque.add(new Cycle());
        }
        while (!eventDeque.isEmpty()) {
            processTick(cycleDeque.peekLast());
        }
        inCycle = false;
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
            activation.fire();
        }
    }

    private void queueEvent(UiNodeEvent event) {
        eventDeque.add(event);
    }

    //endregion
}
