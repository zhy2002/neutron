package zhy2002.neutron;

import jsinterop.annotations.JsMethod;

/**
 * This interface is a facade to all framework level services.
 *
 * @param <R> type of the root UiNode.
 */
public interface UiNodeContext<R extends UiNode<VoidUiNode>> {

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

    /**
     * Process a event which in turn can trigger rules and cause changes.
     *
     * @param event any UiNodeEvent.
     */
    void processEvent(UiNodeEvent event);

    @JsMethod
    void beginSession();

    @JsMethod
    void rollbackSession();

    @JsMethod
    void commitSession();

    @JsMethod
    boolean undo();

    @JsMethod
    boolean redo();

    /**
     * @return the current rule activation.
     */
    UiNodeRuleActivation getCurrentActivation();

    TickPhase getCurrentPhase();

    <R extends UiNodeRule<?, N>, N extends UiNode<?>> R createUiNodeRule(Class<R> ruleClass, N owner);

    <T> StateChangeEvent<T> createStateChangeEvent(UiNode<?> target, String key, Class<T> valueClass, T oldValue, T newValue);

    <N extends UiNode<S>, S extends ListUiNode<?, S, N>> NodeAddEvent<N> createNodeAddEvent(Class<N> itemClass, N item);

    <N extends UiNode<S>, S extends ListUiNode<?, S, N>> NodeRemoveEvent<N> createNodeRemoveEvent(Class<N> itemClass, N item);

    <N extends UiNode<P>, P extends ParentUiNode<?>> N createChildNode(Class<N> childNodeClass, P parent, String name);

}
