package zhy2002.neutron.event;

import zhy2002.neutron.StateChangeEventBinding;
import zhy2002.neutron.TickPhase;
import zhy2002.neutron.UiNodeEventFilter;
import zhy2002.neutron.UiNodeEventHandler;
import zhy2002.neutron.node.ValidationErrorUiNode;
import zhy2002.neutron.util.ValueUtil;

public class ValidationErrorStateChangeEventBinding extends StateChangeEventBinding<ValidationErrorStateChangeEvent> {

    public ValidationErrorStateChangeEventBinding(
            UiNodeEventFilter<ValidationErrorStateChangeEvent> filter,
            UiNodeEventHandler<ValidationErrorStateChangeEvent> handler,
            String subject, TickPhase phase) {
        super(
                filter,
                handler,
                ValidationErrorStateChangeEvent.class,
                ValueUtil.ifNull(subject, ValidationErrorUiNode.VALUE_PROPERTY.getStateKey()),
                phase
        );
    }

    public ValidationErrorStateChangeEventBinding(
            UiNodeEventFilter<ValidationErrorStateChangeEvent> filter,
            UiNodeEventHandler<ValidationErrorStateChangeEvent> handler) {
        this(filter, handler, null, null);
    }

    public ValidationErrorStateChangeEventBinding(
            UiNodeEventHandler<ValidationErrorStateChangeEvent> handler) {
        this(null, handler);
    }
}
