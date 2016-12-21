package zhy2002.neutron;

/**
 * An immutable ClassRegistry.
 */
public class ImmutableClassRegistry implements ClassRegistry {

    private final ClassRegistryImpl registry;

    ImmutableClassRegistry(ClassRegistryImpl registry) {
        this.registry = new ClassRegistryImpl(registry);
    }

    @Override
    public <N extends UiNode<P>, P extends ParentUiNode<?>> ChildNodeFactory<N, P> getChildNodeFactory(Class<N> childNodeClass) {
        return registry.getChildNodeFactory(childNodeClass);
    }

    @Override
    public <N extends UiNode<?>> UiNodeConfig<N> getUiNodeConfig(Class<N> nodeClass, String name) {
        return registry.getUiNodeConfig(nodeClass, name);
    }

    @Override
    public <R extends UiNodeRule<N>, N extends UiNode<?>> UiNodeRuleFactory<R, N> getUiNodeRuleFactory(Class<R> ruleClass) {
        return registry.getUiNodeRuleFactory(ruleClass);
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
