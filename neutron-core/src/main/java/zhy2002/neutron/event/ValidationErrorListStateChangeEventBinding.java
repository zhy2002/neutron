package zhy2002.neutron.event;

import zhy2002.neutron.StateChangeEventBinding;
import zhy2002.neutron.TickPhase;
import zhy2002.neutron.UiNodeEventFilter;
import zhy2002.neutron.UiNodeEventHandler;
import zhy2002.neutron.util.NeutronEventSubjects;
import zhy2002.neutron.util.ValueUtil;

public class ValidationErrorListStateChangeEventBinding extends StateChangeEventBinding<ValidationErrorListStateChangeEvent> {

    public ValidationErrorListStateChangeEventBinding(
            UiNodeEventFilter<ValidationErrorListStateChangeEvent> filter,
            UiNodeEventHandler<ValidationErrorListStateChangeEvent> handler,
            String subject, TickPhase phase) {
        super(
                filter,
                handler,
                ValidationErrorListStateChangeEvent.class,
                ValueUtil.ifNull(subject, NeutronEventSubjects.VALIDATION_ERROR_LIST),
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
