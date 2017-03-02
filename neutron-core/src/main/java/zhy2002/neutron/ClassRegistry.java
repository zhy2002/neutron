package zhy2002.neutron;

/**
 * A central place to specify context-wide singleton object for a given a class.
 */
public interface ClassRegistry {

    /**
     * Get the factory instance of a given state change event type.
     *
     * @param valueClass state value class.
     * @param <T>        state value type.
     * @return the factory that creates
     */
    <T> StateChangeEventFactory<T> getStateChangeEventFactory(Class<T> valueClass);

    <N extends UiNode<?>> NodeLoadEventFactory<N> getNodeLoadEventFactory(Class<N> nodeClass);

    <N extends UiNode<?>> NodeUnloadEventFactory<N> getNodeUnloadEventFactory(Class<N> nodeClass);

}
