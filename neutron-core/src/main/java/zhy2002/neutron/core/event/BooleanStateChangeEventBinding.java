package zhy2002.neutron.core.event;

import zhy2002.neutron.core.StateChangeEventBinding;
import zhy2002.neutron.core.TickPhase;
import zhy2002.neutron.core.UiNodeEventFilter;
import zhy2002.neutron.core.UiNodeEventHandler;
import zhy2002.neutron.core.node.BooleanUiNode;
import zhy2002.neutron.core.util.ValueUtil;

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
