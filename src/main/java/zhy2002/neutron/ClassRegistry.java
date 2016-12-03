package zhy2002.neutron;

/**
 * A central place to specify context-wide singleton object for a given a class.
 */
public interface ClassRegistry {
    /**
     * Get the registered instance of the given class.
     *
     * @param clazz the clas of the instance.
     * @param <F>   class of the instance.
     * @return the same instance is returned for all calls.
     */
    <F> F getInstance(Class<F> clazz);

    /**
     * Get the factory instance of a given state change event type.
     *
     * @param valueClass state value class.
     * @param <T>        state value type.
     * @return the factory that creates
     */
    <T> StateChangeEventFactory<T> getStateChangeEventFactory(Class<T> valueClass);

    <N extends UiNode<S>, S extends ListUiNode<?, S, N>> NodeAddEventFactory<N> getNodeAddEventFactory(Class<N> itemClass);

    <N extends UiNode<S>, S extends ListUiNode<?, S, N>> NodeRemoveEventFactory<N> getNodeRemoveEventFactory(Class<N> itemClass);

    <N extends UiNode<P>, P extends ParentUiNode<?>> ChildNodeFactory<N, P> getChildNodeFactory(Class<N> childNodeClass);
}
