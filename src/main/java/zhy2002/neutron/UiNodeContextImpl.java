package zhy2002.neutron;

import java.util.HashMap;
import java.util.Map;

/**
 * There is one context per node tree.
 */
public abstract class UiNodeContextImpl<R extends UiNode<VoidUiNode>> implements UiNodeContext<R> {

    private R root;
    private final FactoryRegistry factoryRegistry;
    private final Map<Class<?>, ChildNodeFactory<?, ?>> childNodeFactoryMap = new HashMap<>();
    private final SequentialUniqueIdGenerator uniqueIdGenerator = new SequentialUniqueIdGenerator();
    private final UiNodeChangeEngineImpl changeEngine = new UiNodeChangeEngineImpl();

    protected UiNodeContextImpl(FactoryRegistry factoryRegistry) {
        this.factoryRegistry = new ImmutableFactoryRegistry(factoryRegistry);
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

    @Override
    public <T> T getFactory(Class<T> factoryClass) {
        return factoryRegistry.get(factoryClass);
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
}
