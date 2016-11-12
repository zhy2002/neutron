package zhy2002.neutron;

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
    private int id = 0;
    private Map<Class<?>, ChildNodeFactory<?, ?>> childNodeFactoryMap = new HashMap<>();

    /**
     * Returns a unique id in this context.
     *
     * @return a unique string value.
     */
    public String getUniqueId() {
        return "n" + String.valueOf(id++); //todo change to a more robust implementation
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
}
