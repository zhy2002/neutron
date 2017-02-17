package zhy2002.neutron.event;

import zhy2002.neutron.StateChangeEventBinding;
import zhy2002.neutron.TickPhase;
import zhy2002.neutron.UiNodeEventFilter;
import zhy2002.neutron.UiNodeEventHandler;

import java.util.Collection;

public class NodeReferenceStateChangeEventBinding extends StateChangeEventBinding<NodeReferenceStateChangeEvent> {

    public NodeReferenceStateChangeEventBinding(
            UiNodeEventFilter<NodeReferenceStateChangeEvent> filter,
            UiNodeEventHandler<NodeReferenceStateChangeEvent> handler,
            Collection<String> subjects,
            TickPhase phase
    ) {
        super(filter, handler, NodeReferenceStateChangeEvent.class, subjects, phase);
    }

    public NodeReferenceStateChangeEventBinding(
            UiNodeEventFilter<NodeReferenceStateChangeEvent> filter,
            UiNodeEventHandler<NodeReferenceStateChangeEvent> handler
    ) {
        this(filter, handler, null, null);
    }

    public NodeReferenceStateChangeEventBinding(
            UiNodeEventHandler<NodeReferenceStateChangeEvent> handler,
            Collection<String> subjects
    ) {
        this(null, handler, subjects, null);
    }

    public NodeReferenceStateChangeEventBinding(
            UiNodeEventHandler<NodeReferenceStateChangeEvent> handler,
            TickPhase phase
    ) {
        this(null, handler, null, phase);
    }

    public NodeReferenceStateChangeEventBinding(
            UiNodeEventHandler<NodeReferenceStateChangeEvent> handler
    ) {
        this(null, handler, null, null);
    }
}
