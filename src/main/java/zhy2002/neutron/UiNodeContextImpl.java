package zhy2002.neutron;

import java.util.HashMap;
import java.util.Map;

/**
 * There is one context per node tree.
 */
public abstract class UiNodeContextImpl<R extends UiNode<VoidUiNode>> implements UiNodeContext<R> {

    private R root;
    private final ClassRegistry classRegistry;
    private final SequentialUniqueIdGenerator uniqueIdGenerator = new SequentialUniqueIdGenerator();
    private final UiNodeChangeEngineImpl changeEngine = new UiNodeChangeEngineImpl();

    protected UiNodeContextImpl(ClassRegistryImpl factoryRegistry) {
        this.classRegistry = new ImmutableClassRegistry(factoryRegistry);
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

    @Override
    public <F> F getInstance(Class<F> clazz) {
        return classRegistry.getInstance(clazz);
    }

    @Override
    public <T> StateChangeEvent<T> createStateChangeEvent(UiNode<?> target, String key, Class<T> valueClass, T oldValue, T newValue) {
       StateChangeEventFactory<T> factory = classRegistry.getStateChangeEventFactory(valueClass);
       return factory.create(target, key, oldValue, newValue);
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

    public TickPhase getCurrentPhase() {
        return changeEngine.getCurrentPhase();
    }
}
