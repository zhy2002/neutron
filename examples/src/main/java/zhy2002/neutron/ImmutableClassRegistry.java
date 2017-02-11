package zhy2002.neutron;

/**
 * An immutable ClassRegistry.
 */
public final class ImmutableClassRegistry implements ClassRegistry {

    private final ClassRegistryImpl registry;

    ImmutableClassRegistry(ClassRegistryImpl[] registries) {
        this.registry = new ClassRegistryImpl();
        for(ClassRegistryImpl registry : registries) {
            this.registry.copyFrom(registry);
        }
    }

    @Override
    public <T> StateChangeEventFactory<T> getStateChangeEventFactory(Class<T> valueClass) {
        return registry.getStateChangeEventFactory(valueClass);
    }

    @Override
    public <N extends UiNode<S>, S extends ListUiNode<?, S, N>> NodeAddEventFactory<N> getNodeAddEventFactory(Class<N> itemClass) {
        return registry.getNodeAddEventFactory(itemClass);
    }

    @Override
    public <N extends UiNode<S>, S extends ListUiNode<?, S, N>> NodeRemoveEventFactory<N> getNodeRemoveEventFactory(Class<N> itemClass) {
        return registry.getNodeRemoveEventFactory(itemClass);
    }

    public <N extends UiNode<?>> NodeLoadEventFactory<N> getNodeLoadEventFactory(Class<N> nodeClass) {
        return registry.getNodeLoadEventFactory(nodeClass);
    }

    public <N extends UiNode<?>> NodeUnloadEventFactory<N> getNodeUnloadEventFactory(Class<N> nodeClass) {
        return registry.getNodeUnloadEventFactory(nodeClass);
    }
}
