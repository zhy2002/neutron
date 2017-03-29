package zhy2002.neutron;

import jsinterop.annotations.JsMethod;
import zhy2002.neutron.node.VoidUiNode;

/**
 * This interface is a facade to all framework level services.
 *
 * @param <R> type of the root UiNode.
 */
public interface UiNodeContext<R extends UiNode<VoidUiNode>> extends CycleStatus, UiNodeChangeEngineStatus, UiNodeChangeEngine {

    /**
     * Get an automatically generate unique id.
     *
     * @return a unique id in this context.
     */
    String getUniqueId();

    /**
     * Get the root ui node of this context.
     *
     * @return the one and only root ui node of this context.
     */
    R getRootNode();

    <N extends UiNode<?>> void loadNode(Class<N> nodeClass, N node);

    <N extends UiNode<?>> void unLoadNode(Class<N> nodeClass, N node);

    <T> StateChangeEvent<T> createStateChangeEvent(UiNode<?> target, String key, Class<T> valueClass, T oldValue, T newValue);

    <N extends UiNode<?>> NodeLoadEvent<N> createNodeLoadEvent(Class<N> nodeClass, N node);

    <N extends UiNode<?>> NodeUnloadEvent<N> createNodeUnloadEvent(Class<N> nodeClass, N node);

    void processEvent(UiNodeEvent event);

    void flush();

    NodeFinder getNodeFinder();

    NodeReferenceRegistry getNodeReferenceRegistry();

    @JsMethod
    boolean isDirtyCheckEnabled();

    @JsMethod
    void setDirtyCheckEnabled(boolean enabled);

    @JsMethod
    void resetDirty();

}
