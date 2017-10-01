package zhy2002.neutron.core.event;

import zhy2002.neutron.core.*;


public final class AnyNodeAddEventBinding extends GenericNodeAddEventBinding<NodeAddEvent> {

    public AnyNodeAddEventBinding(UiNodeEventFilter<NodeAddEvent> filter, UiNodeEventHandler<NodeAddEvent> handler, TickPhase phase) {
        super(NodeAddEvent.class, filter, handler, phase);
    }

    public AnyNodeAddEventBinding(UiNodeEventFilter<NodeAddEvent> filter, UiNodeEventHandler<NodeAddEvent> handler) {
        super(NodeAddEvent.class, filter, handler);
    }

    public AnyNodeAddEventBinding(UiNodeEventHandler<NodeAddEvent> handler) {
        super(NodeAddEvent.class, handler);
    }
}
