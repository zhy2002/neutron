package zhy2002.neutron;

/**
 * There is one context per node tree.
 */
public abstract class AbstractUiNodeContext<R extends UiNode<VoidUiNode>> implements UiNodeContext<R>, UiNodeChangeEngine {

    private R root;
    private final ClassRegistry classRegistry;
    private final SequentialUniqueIdGenerator uniqueIdGenerator;
    private final UiNodeChangeEngineImpl changeEngine;

    protected AbstractUiNodeContext(ClassRegistryImpl factoryRegistry) {
        classRegistry = new ImmutableClassRegistry(factoryRegistry);
        changeEngine = new UiNodeChangeEngineImpl();
        uniqueIdGenerator = new SequentialUniqueIdGenerator();
    }

    //region node construction

    /**
     * Returns a unique uniqueIdSequenceNumber in this context.
     *
     * @return a unique string value.
     */
    @Override
    public String getUniqueId() {
        return uniqueIdGenerator.next();
    }

    protected abstract Class<R> getRootClass();

    /**
     * Get the root node. If the root node has not been created this will create and addToOwner the root node.
     * Use lazy loading so that when we create the root node this context instance is fully initialized.
     *
     * @return the root node.
     */
    @Override
    public R getRootNode() {
        if (root == null) {
            root = createRootNode();
            root.addToParent();
            loadNode(getRootClass(), root);
        }
        return this.root;
    }

    /**
     * Create the root node.
     * This function should not change the context in any way.
     *
     * @return the root node to be added to this context instance.
     */
    protected abstract R createRootNode();

    @Override
    public <N extends UiNode<P>, P extends ParentUiNode<?>> N createChildNode(Class<N> childNodeClass, P parent, String name) {
        ChildNodeFactory<N, P> factory = classRegistry.getChildNodeFactory(childNodeClass);
        N node = factory.create(parent, name);
        UiNodeConfig<N> config = classRegistry.getUiNodeConfig(childNodeClass, name);
        if (config != null) {
            node.setStatusListener(new ConfigBindingNodeStatusListener<>(node, config));
        }
        return node;
    }

    @Override
    public <U extends UiNodeRule<?, N>, N extends UiNode<?>> U createUiNodeRule(Class<U> ruleClass, N owner) {
        UiNodeRuleFactory<U, N> factory = classRegistry.getUiNodeRuleFactory(ruleClass);
        return factory.create(owner);
    }

    @Override
    public <T> StateChangeEvent<T> createStateChangeEvent(UiNode<?> target, String key, Class<T> valueClass, T oldValue, T newValue) {
        StateChangeEventFactory<T> factory = classRegistry.getStateChangeEventFactory(valueClass);
        return factory.create(target, key, oldValue, newValue);
    }

    @Override
    public <N extends UiNode<S>, S extends ListUiNode<?, S, N>> NodeAddEvent<N> createNodeAddEvent(Class<N> itemClass, N item) {
        NodeAddEventFactory<N> factory = classRegistry.getNodeAddEventFactory(itemClass);
        return factory.create(item);
    }

    @Override
    public <N extends UiNode<S>, S extends ListUiNode<?, S, N>> NodeRemoveEvent<N> createNodeRemoveEvent(Class<N> itemClass, N item) {
        NodeRemoveEventFactory<N> factory = classRegistry.getNodeRemoveEventFactory(itemClass);
        return factory.create(item);
    }

    @Override
    public <N extends UiNode<?>> NodeLoadEvent<N> createNodeLoadEvent(Class<N> nodeClass, N node) {
        NodeLoadEventFactory<N> factory = classRegistry.getNodeLoadEventFactory(nodeClass);
        return factory.create(node);
    }

    @Override
    public <N extends UiNode<?>> NodeUnloadEvent<N> createNodeUnloadEvent(Class<N> nodeClass, N node) {
        NodeUnloadEventFactory<N> factory = classRegistry.getNodeUnloadEventFactory(nodeClass);
        return factory.create(node);
    }

    @Override
    public <N extends UiNode<?>> void loadNode(Class<N> nodeClass, N node) {
        NodeLoadEvent<N> event = createNodeLoadEvent(nodeClass, node);
        processEvent(event);
    }

    @Override
    public <N extends UiNode<?>> void unLoadNode(Class<N> nodeClass, N node) {
        NodeUnloadEvent<N> event = createNodeUnloadEvent(nodeClass, node);
        processEvent(event);
    }

    //endregion

    //region change engine facade

    public void setCycleMode(CycleModeEnum mode) {
        changeEngine.setCycleMode(mode);
    }

    @Override
    public void processEvent(UiNodeEvent event) {
        changeEngine.processEvent(event);
    }

    public void flush() {
        changeEngine.processCycle();
    }

    @Override
    public void beginSession() {
        changeEngine.beginSession();
    }

    @Override
    public void rollbackSession() {
        changeEngine.rollbackSession();
    }

    @Override
    public void commitSession() {
        changeEngine.commitSession();
    }

    @Override
    public boolean undo() {
        return changeEngine.undo();
    }

    @Override
    public boolean redo() {
        return changeEngine.redo();
    }

    @Override
    public boolean canUndo() {
        return changeEngine.canUndo();
    }

    @Override
    public boolean canRedo() {
        return changeEngine.canRedo();
    }

    @Override
    public boolean isInSession() {
        return changeEngine.isInSession();
    }

    @Override
    public boolean isInCycle() {
        return changeEngine.isInCycle();
    }

    //endregion

    //region cycle status

    @Override
    public CycleStatus getCurrentCycleStatus() {
        return changeEngine.getCurrentCycleStatus();
    }

    @Override
    public TickPhase getCurrentPhase() {
        CycleStatus cycleStatus = getCurrentCycleStatus();
        return cycleStatus == null ? null : cycleStatus.getCurrentPhase();
    }

    @Override
    public UiNodeRuleActivation getCurrentActivation() {
        CycleStatus cycleStatus = getCurrentCycleStatus();
        return cycleStatus == null ? null : cycleStatus.getCurrentActivation();
    }

    @Override
    public CycleStatusEnum getCurrentStatus() {
        CycleStatus cycleStatus = getCurrentCycleStatus();
        return cycleStatus == null ? null : cycleStatus.getCurrentStatus();
    }

    @Override
    public ChangeUiNodeEvent getCurrentChangeEvent() {
        CycleStatus cycleStatus = getCurrentCycleStatus();
        return cycleStatus == null ? null : cycleStatus.getCurrentChangeEvent();
    }

    //endregion
}
