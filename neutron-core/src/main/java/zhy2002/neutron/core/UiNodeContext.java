package zhy2002.neutron.core;

import jsinterop.annotations.JsMethod;
import zhy2002.neutron.core.config.ContextConfiguration;
import zhy2002.neutron.core.data.NodeIdentity;
import zhy2002.neutron.core.node.VoidUiNode;

/**
 * This interface is a facade to all framework level services.
 *
 * @param <R> type of the root UiNode.
 */
public interface UiNodeContext<R extends RootUiNode<VoidUiNode>> extends CycleStatus, UiNodeChangeEngine {

    String generateNodeId(String localId);

    /**
     * @return the next node id in sequence.
     */
    String generateNodeId();

    NodeIdentity getNodeIdentity();

    void setNodeIdentity(NodeIdentity nodeIdentity);

    /**
     * Get the root ui node of this context.
     *
     * @return the one and only root ui node of this context.
     */
    R getRootNode();

    /**
     * Create a state change event for a node in this context.
     *
     * @param origin     the node whose state change is described by this event.
     * @param key        the key that identifies which state (property) is changing.
     * @param valueClass class object of the value.
     * @param oldValue   the state value when the event is created.
     * @param newValue   the new value.
     * @param <T>        type of the state value.
     * @return a state change event instance.
     */
    <T> StateChangeEvent<T> createStateChangeEvent(UiNode<?> origin, String key, Class<T> valueClass, T oldValue, T newValue);

    void processEvent(UiNodeEvent event);

    void flush();

    @JsMethod
    NodeFinder getNodeFinder();

    NodeReferenceRegistry getNodeReferenceRegistry();

    @JsMethod
    boolean isDirtyCheckEnabled();

    @JsMethod
    void setDirtyCheckEnabled(boolean enabled);

    @JsMethod
    void resetDirty();

    void addPendingChangeEvent(ChangeUiNodeEvent event);

    boolean isLoaded();

    ContextConfiguration getConfiguration();

    String getContextId();

    RuleCreator getRuleCreator();
}
