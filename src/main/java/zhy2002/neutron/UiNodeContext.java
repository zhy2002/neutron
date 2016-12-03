package zhy2002.neutron;

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

    void beginSession();

    void rollbackSession();

    void commitSession();

    boolean undo();

    boolean redo();

    /**
     * @return the current rule activation.
     */
    UiNodeRuleActivation getCurrentActivation();

    TickPhase getCurrentPhase();

    /**
     * Ge the registered instance for the given class object.
     *
     * @param clazz the class object (used as a key).
     * @param <T>   the type of the desired instance.
     * @return the registered instance. If the instance is not found
     * an exception will be thrown.
     */
    <T> T getInstance(Class<T> clazz);

    <T> StateChangeEvent<T> createStateChangeEvent(UiNode<?> target, String key, Class<T> valueClass, T oldValue, T newValue);

    <N extends UiNode<S>, S extends ListUiNode<?, S, N>> NodeAddEvent<N> createNodeAddEvent(Class<N> itemClass, N item);

    <N extends UiNode<S>, S extends ListUiNode<?, S, N>> NodeRemoveEvent<N> createNodeRemoveEvent(Class<N> itemClass, N item);

    <N extends UiNode<P>, P extends ParentUiNode<?>> N createChildNode(Class<N> childNodeClass, P parent, String name);

}
