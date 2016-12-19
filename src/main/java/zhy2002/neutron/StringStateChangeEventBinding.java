package zhy2002.neutron;

import zhy2002.neutron.event.StringStateChangeEvent;

import java.util.Collection;

public class StringStateChangeEventBinding extends StateChangeEventBinding<StringStateChangeEvent> {

    public StringStateChangeEventBinding(
            UiNodeEventFilter<StringStateChangeEvent> filter,
            UiNodeEventHandler<StringStateChangeEvent> handler,
            Collection<String> subjects,
            TickPhase phase
    ) {
        super(filter, handler, StringStateChangeEvent.class, subjects, phase);
    }

    public StringStateChangeEventBinding(
            UiNodeEventFilter<StringStateChangeEvent> filter,
            UiNodeEventHandler<StringStateChangeEvent> handler
    ) {
        this(filter, handler, null, null);
    }

    public StringStateChangeEventBinding(
            UiNodeEventHandler<StringStateChangeEvent> handler
    ) {
        this(null, handler, null, null);
    }
}
