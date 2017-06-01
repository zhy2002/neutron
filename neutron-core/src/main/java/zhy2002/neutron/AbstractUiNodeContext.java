package zhy2002.neutron;

import jsinterop.annotations.JsMethod;
import zhy2002.neutron.config.Configuration;
import zhy2002.neutron.data.NodeDataStore;
import zhy2002.neutron.data.NodeIdentity;
import zhy2002.neutron.event.EventRegistry;
import zhy2002.neutron.exception.UiNodeEventException;
import zhy2002.neutron.node.VoidUiNode;
import zhy2002.neutron.util.NeutronConstants;
import zhy2002.neutron.util.RandomUniqueIdGenerator;
import zhy2002.neutron.util.ValueUtil;

import javax.inject.Inject;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * There is one context per node hierarchy.
 */
public abstract class AbstractUiNodeContext<R extends RootUiNode<VoidUiNode>> implements UiNodeContext<R> {

    private R root;
    private boolean dirtyCheckEnabled;
    private String contextId;
    /**
     * If re-creating an existing application,
     * this is the node identity of the root node.
     * In construction phase this can be nodeIdentity of any node or null.
     * Afterwards this is always null.
     */
    private NodeIdentity nodeIdentity;
    private String nameOfNodeBeingCreated;
    private Configuration configuration;
    private Deque<ChangeUiNodeEvent> changeUiNodeEvents = new ArrayDeque<>();

    @Inject
    EventRegistry eventRegistry;
    @Inject
    UiNodeChangeEngine changeEngine;
    @Inject
    NodeFinder nodeFinder;
    @Inject
    NodeReferenceRegistry nodeReferenceRegistry;

    @Inject
    protected void injectConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }

    @Inject
    void injectNodeDataStore(NodeDataStore nodeDataStore) {
        this.nodeIdentity = nodeDataStore.getNodeIdentity();
        contextId = ValueUtil.ifNull(nodeDataStore.getContextId(), RandomUniqueIdGenerator.Instance.next());
    }

    @JsMethod
    public String getContextId() {
        return contextId;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public final <T> StateChangeEvent<T> createStateChangeEvent(UiNode<?> origin, String key, Class<T> valueClass, T oldValue, T newValue) {
        StateChangeEventFactory<T> factory = eventRegistry.getStateChangeEventFactory(valueClass);
        return factory.create(origin, key, oldValue, newValue);
    }

    @Override
    public void setNodeIdentity(NodeIdentity nodeIdentity) {
        this.nodeIdentity = nodeIdentity;
    }

    @Override
    public NodeIdentity getNodeIdentity() {
        return nodeIdentity;
    }

    @Override
    public NodeFinder getNodeFinder() {
        return nodeFinder;
    }

    public NodeReferenceRegistry getNodeReferenceRegistry() {
        return nodeReferenceRegistry;
    }

    @Override
    public boolean isDirtyCheckEnabled() {
        return dirtyCheckEnabled;
    }

    @Override
    public void setDirtyCheckEnabled(boolean enabled) {
        dirtyCheckEnabled = enabled;
    }

    @JsMethod
    public final void resetDirty() {
        getRootNode().refreshWithReason(NeutronConstants.RESET_DIRTY_REFRESH_REASON);
    }

    @Override
    public Configuration getConfiguration() {
        return configuration;
    }

    //region node construction

    /**
     * Returns a unique id system wide (all nodes in all contexts ever created).
     *
     * @return a unique string value.
     */
    @Override
    public final String generateNodeId() {
        String newId = null;
        while (newId == null) {
            newId = contextId + "-" + RandomUniqueIdGenerator.Instance.nextShort();
            if (nodeFinder.findNodeById(newId) != null) {
                newId = null;
            }
        }
        return newId;
    }

    public final String generateNodeId(String localId) {
        return contextId + "-" + localId;
    }

    /**
     * Get the root node. If the root node has not been created this will createProperty and addToOwner the root node.
     * Use lazy loading so that when we createProperty the root node this context instance is fully initialized.
     *
     * @return the root node.
     */
    @JsMethod
    @Override
    public final R getRootNode() {
        if (root == null) {
            root = createRootNode();
            root.addToParent();
            root.setLoading(true);
            root.load();
            flushPendingChanges();
            root.setLoading(false);
        }
        return this.root;
    }

    @Override
    public boolean isLoaded() {
        return changeUiNodeEvents == null;
    }

    private void flushPendingChanges() {
        //load all the items
        beginSession();
        while (!changeUiNodeEvents.isEmpty()) {
            processEvent(changeUiNodeEvents.pollFirst());
        }
        commitSession();
        //load all the values
        loadPendingValues(root);
        //refresh and done
        getRootNode().refreshWithReason(NeutronConstants.NODE_LOADED_REFRESH_REASON);
        changeUiNodeEvents = null;
    }

    private void loadPendingValues(UiNode<?> node) {
        if (node instanceof ParentUiNode) {
            for (UiNode<?> child : ((ParentUiNode<?>) node).getChildren()) {
                loadPendingValues(child);
            }
        }
        node.clearNodeIdentity();
    }

    /**
     * Create the root node.
     * Execution of this function should not change the context in any way.
     *
     * @return the root node to be added to this context instance.
     */
    protected abstract R createRootNode();

    //endregion

    //region change engine facade

    @JsMethod
    @Override
    public CycleModeEnum getCycleMode() {
        return changeEngine.getCycleMode();
    }

    @JsMethod
    public final void setCycleMode(CycleModeEnum mode) {
        changeEngine.setCycleMode(mode);
    }

    @Override
    public final void processEvent(UiNodeEvent event) {
        changeEngine.processEvent(event);
    }

    @Override
    public final void flush() {
        changeEngine.flush();
    }

    @Override
    public final void beginSession() {
        changeEngine.beginSession();
    }

    @Override
    public final void rollbackSession() {
        changeEngine.rollbackSession();
    }

    @Override
    public final void commitSession() {
        changeEngine.commitSession();
    }

    @Override
    public final boolean undo() {
        return changeEngine.undo();
    }

    @Override
    public final boolean redo() {
        return changeEngine.redo();
    }

    @Override
    public final boolean canUndo() {
        return changeEngine.canUndo();
    }

    @Override
    public final boolean canRedo() {
        return changeEngine.canRedo();
    }

    @Override
    public final boolean isInSession() {
        return changeEngine.isInSession();
    }

    @Override
    public final boolean isInCycle() {
        return changeEngine.isInCycle();
    }

    @Override
    public final EngineEventModeEnum getEventMode() {
        return changeEngine.getEventMode();
    }

    @Override
    public final void setEventMode(EngineEventModeEnum mode) {
        changeEngine.setEventMode(mode);
    }

    @Override
    public final void addPendingChangeEvent(ChangeUiNodeEvent event) {
        if (changeUiNodeEvents == null) {
            if (getRootNode().getNodeStatus() == NodeStatusEnum.Unloaded) {
                changeUiNodeEvents = new ArrayDeque<>();
            } else {
                throw new UiNodeEventException("Can only call this method before root is loaded.");
            }
        }

        changeUiNodeEvents.addLast(event);
    }

    //endregion

    //region cycle status

    @Override
    public final CycleStatus getCurrentCycleStatus() {
        return changeEngine.getCurrentCycleStatus();
    }

    @Override
    public final TickPhase getCurrentPhase() {
        CycleStatus cycleStatus = getCurrentCycleStatus();
        return cycleStatus == null ? null : cycleStatus.getCurrentPhase();
    }

    @Override
    public final BindingActivation getCurrentActivation() {
        CycleStatus cycleStatus = getCurrentCycleStatus();
        return cycleStatus == null ? null : cycleStatus.getCurrentActivation();
    }

    @Override
    public final CycleStateEnum getCurrentStatus() {
        CycleStatus cycleStatus = getCurrentCycleStatus();
        return cycleStatus == null ? null : cycleStatus.getCurrentStatus();
    }

    @Override
    public final ChangeUiNodeEvent getCurrentChangeEvent() {
        CycleStatus cycleStatus = getCurrentCycleStatus();
        return cycleStatus == null ? null : cycleStatus.getCurrentChangeEvent();
    }

    //endregion

}
