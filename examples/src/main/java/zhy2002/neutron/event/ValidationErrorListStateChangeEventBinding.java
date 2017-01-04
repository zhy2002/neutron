package zhy2002.neutron.event;

import zhy2002.neutron.*;
import zhy2002.neutron.util.NeutronEventSubjects;
import zhy2002.neutron.util.ValueUtil;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ValidationErrorListStateChangeEventBinding extends StateChangeEventBinding<ValidationErrorListStateChangeEvent> {

    private static final List<String> DEFAULT_SUBJECTS = Collections.singletonList(NeutronEventSubjects.VALIDATION_ERROR_LIST);

    public ValidationErrorListStateChangeEventBinding(
            UiNodeEventFilter<ValidationErrorListStateChangeEvent> filter,
            UiNodeEventHandler<ValidationErrorListStateChangeEvent> handler,
            Collection<String> subjects, TickPhase phase) {
        super(
                filter,
                handler,
                ValidationErrorListStateChangeEvent.class,
                ValueUtil.ifNull(subjects, DEFAULT_SUBJECTS),
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
