package zhy2002.neutron;

import java.util.HashMap;
import java.util.Map;

/**
 * A simple mechanism to allow overriding implementation class.
 */
public class ClassRegistryImpl implements ClassRegistry {

    private final Map<Class<?>, Object> storage = new HashMap<>();

    protected ClassRegistryImpl() {
    }

    protected ClassRegistryImpl(ClassRegistryImpl proto) {
        if (proto != null) {
            storage.putAll(proto.storage);
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public <F> F getInstance(Class<F> clazz) {
        Object instance = storage.get(clazz);
        if (instance == null) {
            throw new RuntimeException("Cannot find registered instance of " + clazz.getName());
        }
        return (F) instance;
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T> StateChangeEventFactory<T> getStateChangeEventFactory(Class<T> valueClass) {
        Object instance = storage.get(valueClass);
        if (instance == null) {
            throw new RuntimeException("Cannot find registered StateChangeEventFactory for " + valueClass.getName());
        }
        return (StateChangeEventFactory<T>) instance;
    }

    public final <F> void setInstance(Class<F> clazz, F instance) {
        storage.put(clazz, instance);
    }

    public final <T> void setStateChangeEventFactory(Class<T> valueClass, StateChangeEventFactory<T> factory) {
        storage.put(valueClass, factory);
    }
}
