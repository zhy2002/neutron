package zhy2002.neutron.event;

import zhy2002.neutron.StateChangeEventFactory;


/**
 * An immutable EventRegistry.
 */
public final class ImmutableEventRegistry implements EventRegistry {

    private final EventRegistryImpl registry;

    public ImmutableEventRegistry(EventRegistryImpl[] registries) {
        this.registry = new EventRegistryImpl();
        for(EventRegistryImpl registry : registries) {
            this.registry.copyFrom(registry);
        }
    }

    @Override
    public <T> StateChangeEventFactory<T> getStateChangeEventFactory(Class<T> valueClass) {
        return registry.getStateChangeEventFactory(valueClass);
    }
}
