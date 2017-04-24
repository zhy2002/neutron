package zhy2002.neutron.event;

import zhy2002.neutron.NodeLoadEventFactory;
import zhy2002.neutron.NodeUnloadEventFactory;
import zhy2002.neutron.StateChangeEventFactory;
import zhy2002.neutron.UiNode;
import zhy2002.neutron.event.EventRegistry;
import zhy2002.neutron.event.EventRegistryImpl;

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

    public <N extends UiNode<?>> NodeLoadEventFactory<N> getNodeLoadEventFactory(Class<N> nodeClass) {
        return registry.getNodeLoadEventFactory(nodeClass);
    }

    public <N extends UiNode<?>> NodeUnloadEventFactory<N> getNodeUnloadEventFactory(Class<N> nodeClass) {
        return registry.getNodeUnloadEventFactory(nodeClass);
    }
}
