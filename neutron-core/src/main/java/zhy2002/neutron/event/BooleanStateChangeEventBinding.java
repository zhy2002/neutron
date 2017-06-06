package zhy2002.neutron.event;

import zhy2002.neutron.StateChangeEventBinding;
import zhy2002.neutron.TickPhase;
import zhy2002.neutron.UiNodeEventFilter;
import zhy2002.neutron.UiNodeEventHandler;
import zhy2002.neutron.node.BooleanUiNode;
import zhy2002.neutron.util.ValueUtil;

public class BooleanStateChangeEventBinding extends StateChangeEventBinding<BooleanStateChangeEvent> {

    public BooleanStateChangeEventBinding(
            UiNodeEventFilter<BooleanStateChangeEvent> filter,
            UiNodeEventHandler<BooleanStateChangeEvent> handler,
            String subject,
            TickPhase phase
    ) {
        super(filter, handler, BooleanStateChangeEvent.class, ValueUtil.ifNull(subject, BooleanUiNode.VALUE_PROPERTY.getStateKey()), phase);
    }

    public BooleanStateChangeEventBinding(
            UiNodeEventHandler<BooleanStateChangeEvent> handler,
            String subject
    ) {
        this(null, handler, subject, null);
    }

    public BooleanStateChangeEventBinding(
            UiNodeEventFilter<BooleanStateChangeEvent> filter,
            UiNodeEventHandler<BooleanStateChangeEvent> handler
    ) {
        this(filter, handler, null, null);
    }

    public BooleanStateChangeEventBinding(
            UiNodeEventFilter<BooleanStateChangeEvent> filter,
            UiNodeEventHandler<BooleanStateChangeEvent> handler,
            String subject
    ) {
        this(filter, handler, subject, null);
    }

    public BooleanStateChangeEventBinding(
            UiNodeEventHandler<BooleanStateChangeEvent> handler
    ) {
        this(null, handler, null, null);
    }
}
