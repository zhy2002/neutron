package zhy2002.neutron.core.event;

import zhy2002.neutron.core.StateChangeEventBinding;
import zhy2002.neutron.core.TickPhase;
import zhy2002.neutron.core.UiNodeEventFilter;
import zhy2002.neutron.core.UiNodeEventHandler;
import zhy2002.neutron.core.node.DoubleUiNode;
import zhy2002.neutron.core.util.ValueUtil;

public class DoubleStateChangeEventBinding extends StateChangeEventBinding<DoubleStateChangeEvent> {

    public DoubleStateChangeEventBinding(
            UiNodeEventFilter<DoubleStateChangeEvent> filter,
            UiNodeEventHandler<DoubleStateChangeEvent> handler,
            String subject,
            TickPhase phase
    ) {
        super(filter, handler, DoubleStateChangeEvent.class, ValueUtil.ifNull(subject, DoubleUiNode.VALUE_PROPERTY.getStateKey()), phase);
    }

    public DoubleStateChangeEventBinding(
            UiNodeEventHandler<DoubleStateChangeEvent> handler,
            String subject
    ) {
        this(null, handler, subject, null);
    }

    public DoubleStateChangeEventBinding(
            UiNodeEventFilter<DoubleStateChangeEvent> filter,
            UiNodeEventHandler<DoubleStateChangeEvent> handler
    ) {
        this(filter, handler, null, null);
    }

    public DoubleStateChangeEventBinding(
            UiNodeEventFilter<DoubleStateChangeEvent> filter,
            UiNodeEventHandler<DoubleStateChangeEvent> handler,
            String subject
    ) {
        this(filter, handler, subject, null);
    }

    public DoubleStateChangeEventBinding(
            UiNodeEventHandler<DoubleStateChangeEvent> handler
    ) {
        this(null, handler, null, null);
    }
}
