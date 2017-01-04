package zhy2002.neutron;

import zhy2002.neutron.node.VoidUiNode;

/**
 * This interface is a facade to all framework level services.
 *
 * @param <R> type of the root UiNode.
 */
public interface UiNodeContext<R extends UiNode<VoidUiNode>> extends CycleStatus, UiNodeChangeEngineStatus {

    /**
     * Get an automatically generate unique id.
     *
     * @return a unique id in this context.
     */
    String getUniqueId();

    /**
     * Get the root ui node of this context.
     *
     * @return the one and only root ui node of this context.
     */
    R getRootNode();

    <N extends UiNode<?>> void loadNode(Class<N> nodeClass, N node);

    <N extends UiNode<?>> void unLoadNode(Class<N> nodeClass, N node);

    <N extends UiNode<P>, P extends ParentUiNode<?>> N createChildNode(Class<N> childNodeClass, P parent, String name);

    <L extends UiNodeRule<N>, N extends UiNode<?>> L createUiNodeRule(Class<L> ruleClass, N owner);

    <T> StateChangeEvent<T> createStateChangeEvent(UiNode<?> target, String key, Class<T> valueClass, T oldValue, T newValue);

    <N extends UiNode<S>, S extends ListUiNode<?, S, N>> NodeAddEvent<N> createNodeAddEvent(Class<N> itemClass, N item);

    <N extends UiNode<S>, S extends ListUiNode<?, S, N>> NodeRemoveEvent<N> createNodeRemoveEvent(Class<N> itemClass, N item);

    <N extends UiNode<?>> NodeLoadEvent<N> createNodeLoadEvent(Class<N> nodeClass, N node);

    <N extends UiNode<?>> NodeUnloadEvent<N> createNodeUnloadEvent(Class<N> nodeClass, N node);

    void processEvent(UiNodeEvent event);

    void flush();

}