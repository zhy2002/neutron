package zhy2002.neutron;

import zhy2002.neutron.event.DefaultPhases;
import zhy2002.neutron.event.TickPhase;
import zhy2002.neutron.event.UiNodeEvent;
import zhy2002.neutron.node.ChildNodeFactory;
import zhy2002.neutron.node.ParentUiNode;
import zhy2002.neutron.node.UiNode;
import zhy2002.neutron.node.VoidUiNode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/**
 * There is one context per node tree.
 */
public abstract class UiNodeContext<R extends UiNode<VoidUiNode>> {

    private R root;
    private Map<Class<?>, ChildNodeFactory<?, ?>> childNodeFactoryMap = new HashMap<>();
    private SessionModeEnum sessionMode = SessionModeEnum.Auto;
    private CycleModeEnum cycleMode = CycleModeEnum.Auto;
    private int uniqueIdSequenceNumber = 0;
    private boolean inSession = false;
    private final Deque<UiNodeEvent> eventDeque = new ArrayDeque<>();
    private final Deque<UiNodeEvent> pendingChangesQueue = new ArrayDeque<>();
    private final UiNodeRuleAgenda agenda = new UiNodeRuleAgenda();
    private TickPhase[] phases = {DefaultPhases.Pre, DefaultPhases.Post, DefaultPhases.Validate, DefaultPhases.CleanUp};
    private TickPhase currentPhase;

    //region node construction

    /**
     * Returns a unique uniqueIdSequenceNumber in this context.
     *
     * @return a unique string value.
     */
    public String getUniqueId() {
        return "n" + String.valueOf(uniqueIdSequenceNumber++); //todo change to a more robust implementation
    }

    /**
     * Get the root node. If the root node has not been created this will create and load the root node.
     *
     * @return the root node.
     */
    public R getRootNode() {
        if (root == null) {
            root = createRootNode();
            root.addToParent();
            root.load();
        }
        return this.root;
    }

    /**
     * Create the root node.
     * This function should not change the context in any way.
     *
     * @return the root node.
     */
    protected abstract R createRootNode();

    @SuppressWarnings("unchecked")
    public <N extends UiNode<P>, P extends ParentUiNode<?>> ChildNodeFactory<N, P> getChildNodeFactory(Class<? extends N> nodeClass) {
        return (ChildNodeFactory<N, P>) childNodeFactoryMap.get(nodeClass);
    }

    public <N extends UiNode<P>, P extends ParentUiNode<?>> void setChildNodeFactory(Class<N> nodeClass, ChildNodeFactory<N, P> factory) {
        childNodeFactoryMap.put(nodeClass, factory);
    }

    //endregion

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
