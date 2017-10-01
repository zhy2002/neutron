package zhy2002.neutron.core.event;

import zhy2002.neutron.core.*;
import zhy2002.neutron.core.util.ValueUtil;

public class ValidationErrorListStateChangeEventBinding extends StateChangeEventBinding<ValidationErrorListStateChangeEvent> {

    public ValidationErrorListStateChangeEventBinding(
            UiNodeEventFilter<ValidationErrorListStateChangeEvent> filter,
            UiNodeEventHandler<ValidationErrorListStateChangeEvent> handler,
            String subject, TickPhase phase) {
        super(
                filter,
                handler,
                ValidationErrorListStateChangeEvent.class,
                ValueUtil.ifNull(subject, UiNode.VALIDATION_ERROR_LIST_PROPERTY.getStateKey()),
                phase
        );
    }

    public ValidationErrorListStateChangeEventBinding(
            UiNodeEventFilter<ValidationErrorListStateChangeEvent> filter,
            UiNodeEventHandler<ValidationErrorListStateChangeEvent> handler) {
        this(filter, handler, null, null);
    }

    public ValidationErrorListStateChangeEventBinding(
            UiNodeEventHandler<ValidationErrorListStateChangeEvent> handler) {
        this(null, handler);
    }
}
