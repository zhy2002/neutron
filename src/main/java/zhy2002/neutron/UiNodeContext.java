package zhy2002.neutron;

/**
 * This interface is a facade to all framework level services.
 *
 * @param <R> type of the root UiNode.
 */
public interface UiNodeContext<R extends UiNode<VoidUiNode>> {
    
    String getUniqueId();

    R getRootNode();

    <T> T getFactory(Class<T> factoryClass);

    void processEvent(UiNodeEvent event);

    void beginSession();

    void rollbackSession();

    void commitSession();

    boolean undo();

    boolean redo();

    UiNodeRuleActivation getCurrentActivation();
}
