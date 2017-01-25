package zhy2002.neutron;

import jsinterop.annotations.JsMethod;
import zhy2002.neutron.node.VoidUiNode;
import zhy2002.neutron.util.RandomUniqueIdGenerator;
import zhy2002.neutron.util.SequentialUniqueIdGenerator;

/**
 * There is one context per node tree.
 */
public abstract class AbstractUiNodeContext<R extends UiNode<VoidUiNode>> implements UiNodeContext<R> {

    private R root;
    private final ClassRegistry classRegistry;
    private final String contextId;
    private final UniqueIdGenerator nodeIdGenerator;
    private final UiNodeChangeEngineImpl changeEngine;

    /**
     * Construct the context.
     *
     * @param registries an array of ClassRegistry.
     *                   The latter will override the former.
     */
    protected AbstractUiNodeContext(ClassRegistryImpl... registries) {
        classRegistry = new ImmutableClassRegistry(registries);
        changeEngine = new UiNodeChangeEngineImpl();
        contextId = RandomUniqueIdGenerator.Instance.next();
        nodeIdGenerator = new SequentialUniqueIdGenerator();
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
     * Get the root node. If the root node has not been created this will create and addToOwner the root node.
     * Use lazy loading so that when we create the root node this context instance is fully initialized.
     *
     * @return the root node.
     */
    @Override
    public final R getRootNode() {
        if (root == null) {
            root = createRootNode();
            root.addToParent();
            loadNode(getRootClass(), root);
        }
        return this.root;
    }


    @Override
    public final <N extends UiNode<P>, P extends ParentUiNode<?>> N createChildNode(Class<N> childNodeClass, P parent, String name) {
        ChildNodeFactory<N, P> factory = classRegistry.getChildNodeFactory(childNodeClass);
        N node = factory.create(parent, name);
        UiNodeConfig<N> config = classRegistry.getUiNodeConfig(childNodeClass, name);
        if (config != null) {
            node.setStatusListener(new ConfigBindingNodeStatusListener<>(node, config));
        }
        return node;
    }

    @Override
    public final <U extends UiNodeRule<N>, N extends UiNode<?>> U createUiNodeRule(Class<U> ruleClass, N owner) {
        UiNodeRuleFactory<U, N> factory = classRegistry.getUiNodeRuleFactory(ruleClass);
        return factory.create(owner);
    }

    @Override
    public final <T> StateChangeEvent<T> createStateChangeEvent(UiNode<?> target, String key, Class<T> valueClass, T oldValue, T newValue) {
        StateChangeEventFactory<T> factory = classRegistry.getStateChangeEventFactory(valueClass);
        return factory.create(target, key, oldValue, newValue);
    }

    @Override
    public final <N extends UiNode<S>, S extends ListUiNode<?, S, N>> NodeAddEvent<N> createNodeAddEvent(Class<N> itemClass, N item) {
        NodeAddEventFactory<N> factory = classRegistry.getNodeAddEventFactory(itemClass);
        return factory.create(item);
    }

    @Override
    public final <N extends UiNode<S>, S extends ListUiNode<?, S, N>> NodeRemoveEvent<N> createNodeRemoveEvent(Class<N> itemClass, N item) {
        NodeRemoveEventFactory<N> factory = classRegistry.getNodeRemoveEventFactory(itemClass);
        return factory.create(item);
    }

    @Override
    public final <N extends UiNode<?>> NodeLoadEvent<N> createNodeLoadEvent(Class<N> nodeClass, N node) {
        NodeLoadEventFactory<N> factory = classRegistry.getNodeLoadEventFactory(nodeClass);
        return factory.create(node);
    }

    @Override
    public final <N extends UiNode<?>> NodeUnloadEvent<N> createNodeUnloadEvent(Class<N> nodeClass, N node) {
        NodeUnloadEventFactory<N> factory = classRegistry.getNodeUnloadEventFactory(nodeClass);
        return factory.create(node);
    }

    @Override
    public final <N extends UiNode<?>> void loadNode(Class<N> nodeClass, N node) {
        NodeLoadEvent<N> event = createNodeLoadEvent(nodeClass, node);
        processEvent(event);
    }

    @Override
    public final <N extends UiNode<?>> void unLoadNode(Class<N> nodeClass, N node) {
        NodeUnloadEvent<N> event = createNodeUnloadEvent(nodeClass, node);
        processEvent(event);
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

    public final void flush() {
        changeEngine.processCycle();
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
}
