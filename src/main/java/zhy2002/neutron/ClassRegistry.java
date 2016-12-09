package zhy2002.neutron;

/**
 * A central place to specify context-wide singleton object for a given a class.
 */
public interface ClassRegistry {

    <N extends UiNode<P>, P extends ParentUiNode<?>> ChildNodeFactory<N, P> getChildNodeFactory(Class<N> childNodeClass);

    <N extends UiNode<?>> UiNodeConfig<N> getUiNodeConfig(Class<N> nodeClass, String name);

    /**
     * Get the registered instance of the given class.
     *
     * @param ruleClass the rule's class object.
     * @return the factory instance that can create the rule.
     */
    <R extends UiNodeRule<?, N>, N extends UiNode<?>> UiNodeRuleFactory<R, N> getUiNodeRuleFactory(Class<R> ruleClass);

    /**
     * Get the factory instance of a given state change event type.
     *
     * @param valueClass state value class.
     * @param <T>        state value type.
     * @return the factory that creates
     */
    <T> StateChangeEventFactory<T> getStateChangeEventFactory(Class<T> valueClass);

    <N extends UiNode<S>, S extends ListUiNode<?, S, N>> NodeAddEventFactory<N> getNodeAddEventFactory(Class<N> itemClass);

    <N extends UiNode<S>, S extends ListUiNode<?, S, N>> NodeRemoveEventFactory<N> getNodeRemoveEventFactory(Class<N> itemClass);

    <N extends UiNode<?>> NodeLoadEventFactory<N> getNodeLoadEventFactory(Class<N> nodeClass);

    <N extends UiNode<?>> NodeUnloadEventFactory<N> getNodeUnloadEventFactory(Class<N> nodeClass);

}
