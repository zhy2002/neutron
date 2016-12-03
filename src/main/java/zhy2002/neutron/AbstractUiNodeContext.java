package zhy2002.neutron;

/**
 * There is one context per node tree.
 */
public abstract class AbstractUiNodeContext<R extends UiNode<VoidUiNode>> implements UiNodeContext<R> {

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
            root.load();
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
    public <F> F getInstance(Class<F> clazz) {
        return classRegistry.getInstance(clazz);
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
    public <N extends UiNode<P>, P extends ParentUiNode<?>> N createChildNode(Class<N> childNodeClass, P parent, String name) {
        ChildNodeFactory<N, P> factory = classRegistry.getChildNodeFactory(childNodeClass);
        return factory.create(parent, name);
    }

    //endregion

    @Override
    public void processEvent(UiNodeEvent event) {
        changeEngine.processEvent(event);
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
    public UiNodeRuleActivation getCurrentActivation() {
        return changeEngine.getCurrentActivation();
    }

    @Override
    public TickPhase getCurrentPhase() {
        return changeEngine.getCurrentPhase();
    }
}
