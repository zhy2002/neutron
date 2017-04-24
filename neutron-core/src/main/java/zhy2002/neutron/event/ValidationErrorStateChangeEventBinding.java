package zhy2002.neutron.event;

import zhy2002.neutron.StateChangeEventBinding;
import zhy2002.neutron.TickPhase;
import zhy2002.neutron.UiNodeEventFilter;
import zhy2002.neutron.UiNodeEventHandler;

import java.util.Collection;

public class ValidationErrorStateChangeEventBinding extends StateChangeEventBinding<ValidationErrorStateChangeEvent> {

    public ValidationErrorStateChangeEventBinding(
            UiNodeEventFilter<ValidationErrorStateChangeEvent> filter,
            UiNodeEventHandler<ValidationErrorStateChangeEvent> handler,
            Collection<String> subjects, TickPhase phase) {
        super(
                filter,
                handler,
                ValidationErrorStateChangeEvent.class,
                subjects,
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
