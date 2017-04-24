package zhy2002.neutron.event;

import zhy2002.neutron.NodeLoadEventFactory;
import zhy2002.neutron.NodeUnloadEventFactory;
import zhy2002.neutron.StateChangeEventFactory;
import zhy2002.neutron.UiNode;

/**
 * A central place to obtain event factories.
 */
public interface EventRegistry {

    <T> StateChangeEventFactory<T> getStateChangeEventFactory(Class<T> valueClass);

    <N extends UiNode<?>> NodeLoadEventFactory<N> getNodeLoadEventFactory(Class<N> nodeClass);

    <N extends UiNode<?>> NodeUnloadEventFactory<N> getNodeUnloadEventFactory(Class<N> nodeClass);

}
