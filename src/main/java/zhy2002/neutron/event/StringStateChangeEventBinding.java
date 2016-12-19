package zhy2002.neutron.event;

import zhy2002.neutron.StateChangeEventBinding;
import zhy2002.neutron.TickPhase;
import zhy2002.neutron.UiNodeEventFilter;
import zhy2002.neutron.UiNodeEventHandler;

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
            UiNodeEventHandler<StringStateChangeEvent> handler,
            Collection<String> subjects
    ) {
        this(null, handler, subjects, null);
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
