package zhy2002.neutron;

/**
 * Created by ZHY on 16/11/2016.
 */
public class ImmutableFactoryRegistry extends FactoryRegistry {

    public ImmutableFactoryRegistry() {
    }

    public ImmutableFactoryRegistry(FactoryRegistry factoryRegistry) {
        getStorage().putAll(factoryRegistry.getStorage());
    }

    @Override
    public <T> void set(Class<T> factoryClass, T factory) {
        throw new UnsupportedOperationException();
    }
}
