package zhy2002.neutron;

import zhy2002.neutron.event.DefaultPhases;
import zhy2002.neutron.event.TickPhase;
import zhy2002.neutron.event.UiNodeEvent;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by john.zhang on 16/11/2016.
 */
public class UiNodeChangeEngine {

    private SessionModeEnum sessionMode = SessionModeEnum.Auto;
    private CycleModeEnum cycleMode = CycleModeEnum.Auto;

    private boolean inSession = false;
    private final Deque<UiNodeEvent> eventDeque = new ArrayDeque<>();
    private final Deque<UiNodeEvent> pendingChangesQueue = new ArrayDeque<>();
    private final UiNodeRuleAgenda agenda = new UiNodeRuleAgenda();
    private TickPhase[] phases = {DefaultPhases.Pre, DefaultPhases.Post, DefaultPhases.Validate, DefaultPhases.CleanUp};
    private TickPhase currentPhase;

    //region change management

    public SessionModeEnum getSessionMode() {
        return sessionMode;
    }

    public void setCommitMode(SessionModeEnum commitMode) {
        if (this.sessionMode != SessionModeEnum.Auto && commitMode == SessionModeEnum.Auto) {
            commitSession();
            this.sessionMode = commitMode;
        }
    }

    public CycleModeEnum getCycleMode() {
        return cycleMode;
    }

    public void beginSession() {
        if (sessionMode == SessionModeEnum.Auto)
            return;

        beginSessionInternal();
    }

    protected void beginSessionInternal() {
        inSession = true;
    }

    public void commitSession() {
        if (sessionMode == SessionModeEnum.Auto)
            return;

        commitSessionInternal();
    }

    protected void commitSessionInternal() {

        //todo clear temp data
        inSession = false;
    }

    public void rollbackSession() {
        if (sessionMode == SessionModeEnum.Auto)
            return;

        //todo implement

        inSession = false;
    }

    public boolean isInSession() {
        return inSession;
    }

    public void processEvent(UiNodeEvent event) {
        if (!isInSession()) {
            beginSessionInternal();
        }

        try {
            processEventInternal(event);
        } catch (UiNodeEventException ex) {
            if (getSessionMode() == SessionModeEnum.Auto) {
                rollbackSession();
            }
            throw ex;
        }

        if (getSessionMode() == SessionModeEnum.Auto) {
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
        //todo undo the last cycle
        return false;
    }

    public boolean redo() {
        //todo redo the last undid cycle
        return false;
    }

    private void processCycle() {
        while (!eventDeque.isEmpty()) {
            processTick();
        }
    }

    private void processTick() {
        while (!eventDeque.isEmpty()) {
            UiNodeEvent event = eventDeque.poll();
            agenda.addActivations(event);
            pendingChangesQueue.add(event);
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
        while (!pendingChangesQueue.isEmpty()) {
            pendingChangesQueue.poll().apply();
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
