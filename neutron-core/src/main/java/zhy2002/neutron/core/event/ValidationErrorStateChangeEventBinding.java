package zhy2002.neutron.core.event;

import zhy2002.neutron.core.StateChangeEventBinding;
import zhy2002.neutron.core.TickPhase;
import zhy2002.neutron.core.UiNodeEventFilter;
import zhy2002.neutron.core.UiNodeEventHandler;
import zhy2002.neutron.core.node.ValidationErrorUiNode;
import zhy2002.neutron.core.util.ValueUtil;

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
