package zhy2002.neutron;

/**
 * An immutable ClassRegistry.
 */
public class ImmutableClassRegistry implements ClassRegistry {

    private final ClassRegistryImpl registry;

    public ImmutableClassRegistry() {
        this(null);
    }

    public ImmutableClassRegistry(ClassRegistryImpl registry) {
        this.registry = new ClassRegistryImpl(registry);
    }

    @Override
    public <T> StateChangeEventFactory<T> getStateChangeEventFactory(Class<T> valueClass) {
        return registry.getStateChangeEventFactory(valueClass);
    }

    @Override
    public <F> F getInstance(Class<F> clazz) {
        return registry.getInstance(clazz);
    }
}
