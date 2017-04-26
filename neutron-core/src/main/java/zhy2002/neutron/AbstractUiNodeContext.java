package zhy2002.neutron;

import jsinterop.annotations.JsMethod;
import zhy2002.neutron.event.EventRegistry;
import zhy2002.neutron.event.EventRegistryImpl;
import zhy2002.neutron.event.ImmutableEventRegistry;
import zhy2002.neutron.node.VoidUiNode;
import zhy2002.neutron.util.NeutronEventSubjects;

import javax.inject.Inject;

/**
 * There is one context per node hierarchy.
 */
public abstract class AbstractUiNodeContext<R extends RootUiNode<VoidUiNode>> implements UiNodeContext<R> {

    private R root;
    private final EventRegistry eventRegistry;
    private final String contextId;
    private final UniqueIdGenerator nodeIdGenerator;
    private final UiNodeChangeEngine changeEngine;
    @Inject
    NodeFinder nodeFinder;
    @Inject
    NodeReferenceRegistry nodeReferenceRegistry;
    private boolean dirtyCheckEnabled;


    /**
     * Construct the context.
     *
     * @param registries an array of EventRegistry.
     *                   The latter will override the former.
     */
    protected AbstractUiNodeContext(
            String contextId,
            UiNodeChangeEngine changeEngine,
            UniqueIdGenerator nodeIdGenerator,
            EventRegistryImpl... registries) {

        this.contextId = contextId;
        this.changeEngine = changeEngine;
        this.nodeIdGenerator = nodeIdGenerator;
        this.eventRegistry = new ImmutableEventRegistry(registries);
    }

    /**
     * @return class object of the root node.
     */
    protected abstract Class<R> getRootClass();

    /**
     * Create the root node.
     * This function should not change the context in any way.
     *
     * @return the root node to be added to this context instance.
     */
    protected abstract R createRootNode();

    //region node construction

    /**
     * Returns a unique id system wide (all nodes in all contexts ever created).
     *
     * @return a unique string value.
     */
    @Override
    public final String getUniqueId() {
        return 'n' + contextId + nodeIdGenerator.next();
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
            root.load();
        }
        return this.root;
    }

    @Override
    public final <T> StateChangeEvent<T> createStateChangeEvent(UiNode<?> target, String key, Class<T> valueClass, T oldValue, T newValue) {
        StateChangeEventFactory<T> factory = eventRegistry.getStateChangeEventFactory(valueClass);
        return factory.create(target, key, oldValue, newValue);
    }

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
    public final CycleStatusEnum getCurrentStatus() {
        CycleStatus cycleStatus = getCurrentCycleStatus();
        return cycleStatus == null ? null : cycleStatus.getCurrentStatus();
    }

    @Override
    public final ChangeUiNodeEvent getCurrentChangeEvent() {
        CycleStatus cycleStatus = getCurrentCycleStatus();
        return cycleStatus == null ? null : cycleStatus.getCurrentChangeEvent();
    }

    //endregion

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
        getRootNode().refreshWithReason(NeutronEventSubjects.RESET_DIRTY_REFRESH_REASON);
    }

    @Override
    public void setContentLevel(int level) {}
}
