package zhy2002.neutron.event;

import zhy2002.neutron.StateChangeEventBinding;
import zhy2002.neutron.TickPhase;
import zhy2002.neutron.UiNodeEventFilter;
import zhy2002.neutron.UiNodeEventHandler;

public class ValidationErrorStateChangeEventBinding extends StateChangeEventBinding<ValidationErrorStateChangeEvent> {

    public ValidationErrorStateChangeEventBinding(
            UiNodeEventFilter<ValidationErrorStateChangeEvent> filter,
            UiNodeEventHandler<ValidationErrorStateChangeEvent> handler,
            String subject, TickPhase phase) {
        super(
                filter,
                handler,
                ValidationErrorStateChangeEvent.class,
                subject,
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
