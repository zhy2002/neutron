package zhy2002.neutron;

/**
 * A central place to specify context-wide singleton object for a given a class.
 */
public interface ClassRegistry {

    /**
     * Get the factory instance of a given state change event type.
     * @param valueClass state value class.
     * @param <T> state value type.
     * @return the factory that creates
     */
    <T> StateChangeEventFactory<T> getStateChangeEventFactory(Class<T> valueClass);

    /**
     * Get the registered instance of the given class.
     * @param clazz the clas of the instance.
     * @param <F> class of the instance.
     * @return the same instance is returned for all calls.
     */
    <F> F getInstance(Class<F> clazz);

}
