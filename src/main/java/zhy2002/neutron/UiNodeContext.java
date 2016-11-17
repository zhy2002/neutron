package zhy2002.neutron;

import zhy2002.neutron.event.UiNodeEvent;
import zhy2002.neutron.node.ChildNodeFactory;
import zhy2002.neutron.node.ParentUiNode;
import zhy2002.neutron.node.UiNode;
import zhy2002.neutron.node.VoidUiNode;

import java.util.HashMap;
import java.util.Map;

/**
 * There is one context per node tree.
 */
public abstract class UiNodeContext<R extends UiNode<VoidUiNode>> {

    private R root;
    private final FactoryRegistry factoryRegistry;
    private final Map<Class<?>, ChildNodeFactory<?, ?>> childNodeFactoryMap = new HashMap<>();
    private final SequentialUniqueIdGenerator uniqueIdGenerator = new SequentialUniqueIdGenerator();
    private final UiNodeChangeEngine changeEngine = new UiNodeChangeEngine();

    protected UiNodeContext(FactoryRegistry factoryRegistry) {
        this.factoryRegistry = new ImmutableFactoryRegistry(factoryRegistry);
    }

    //region node construction

    /**
     * Returns a unique uniqueIdSequenceNumber in this context.
     *
     * @return a unique string value.
     */
    public String getUniqueId() {
        return uniqueIdGenerator.next();
    }

    /**
     * Get the root node. If the root node has not been created this will create and addToOwner the root node.
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

    public <T> T getFactory(Class<T> factoryClass) {
        return factoryRegistry.get(factoryClass);
    }

    //endregion

    public void processEvent(UiNodeEvent event) {
        changeEngine.processEvent(event);
    }

    public void beginSession() {
        changeEngine.beginSession();
    }

    public void rollbackSession() {
        changeEngine.rollbackSession();
    }

    public void commitSession() {
        changeEngine.commitSession();
    }

    public boolean undo() {
        return changeEngine.undo();
    }

    public boolean redo() {
        return changeEngine.redo();
    }
}
