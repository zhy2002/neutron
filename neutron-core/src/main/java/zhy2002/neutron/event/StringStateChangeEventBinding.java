package zhy2002.neutron.event;

import zhy2002.neutron.StateChangeEventBinding;
import zhy2002.neutron.TickPhase;
import zhy2002.neutron.UiNodeEventFilter;
import zhy2002.neutron.UiNodeEventHandler;
import zhy2002.neutron.node.StringUiNode;
import zhy2002.neutron.util.ValueUtil;

public class StringStateChangeEventBinding extends StateChangeEventBinding<StringStateChangeEvent> {

    public StringStateChangeEventBinding(
            UiNodeEventFilter<StringStateChangeEvent> filter,
            UiNodeEventHandler<StringStateChangeEvent> handler,
            String subject,
            TickPhase phase
    ) {
        super(filter, handler, StringStateChangeEvent.class, ValueUtil.ifNull(subject, StringUiNode.VALUE_PROPERTY.getStateKey()), phase);
    }

    public StringStateChangeEventBinding(
            UiNodeEventFilter<StringStateChangeEvent> filter,
            UiNodeEventHandler<StringStateChangeEvent> handler
    ) {
        this(filter, handler, null, null);
    }

    public StringStateChangeEventBinding(
            UiNodeEventHandler<StringStateChangeEvent> handler,
            String subject
    ) {
        this(null, handler, subject, null);
    }

    public StringStateChangeEventBinding(
            UiNodeEventHandler<StringStateChangeEvent> handler,
            TickPhase phase
    ) {
        this(null, handler, null, phase);
    }

    public StringStateChangeEventBinding(
            UiNodeEventHandler<StringStateChangeEvent> handler
    ) {
        this(null, handler, null, null);
    }
}
