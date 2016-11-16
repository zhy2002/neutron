package zhy2002.neutron;

import java.util.HashMap;
import java.util.Map;

/**
 * A simple mechanism to allow overriding implementation class.
 */
public abstract class FactoryRegistry {

    private final Map<Class<?>, ? super Object> storage = new HashMap<>();

    protected FactoryRegistry() {
    }

    Map<Class<?>, ? super Object> getStorage() {
        return storage;
    }

    public <T> void set(Class<T> factoryClass, T factory) {
        storage.put(factoryClass, factory);
    }

    public <T> T get(Class<T> factoryClass) {
        return (T) storage.get(factoryClass);
    }
}
