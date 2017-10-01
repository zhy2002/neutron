package zhy2002.neutron.core.event;

import zhy2002.neutron.core.*;


public final class AnyNodeRemoveEventBinding extends GenericNodeRemoveEventBinding<NodeRemoveEvent> {

    public AnyNodeRemoveEventBinding(UiNodeEventFilter<NodeRemoveEvent> filter, UiNodeEventHandler<NodeRemoveEvent> handler, TickPhase phase) {
        super(NodeRemoveEvent.class, filter, handler, phase);
    }

    public AnyNodeRemoveEventBinding(UiNodeEventFilter<NodeRemoveEvent> filter, UiNodeEventHandler<NodeRemoveEvent> handler) {
        super(NodeRemoveEvent.class, filter, handler);
    }

    public AnyNodeRemoveEventBinding(UiNodeEventHandler<NodeRemoveEvent> handler) {
        super(NodeRemoveEvent.class, handler);
    }
}
