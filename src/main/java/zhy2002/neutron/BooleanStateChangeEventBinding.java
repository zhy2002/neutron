package zhy2002.neutron;

import zhy2002.neutron.event.BooleanStateChangeEvent;

import java.util.Collection;

public class BooleanStateChangeEventBinding extends StateChangeEventBinding<BooleanStateChangeEvent> {

    public BooleanStateChangeEventBinding(
            UiNodeEventFilter<BooleanStateChangeEvent> filter,
            UiNodeEventHandler<BooleanStateChangeEvent> handler,
            Collection<String> subjects,
            TickPhase phase
    ) {
        super(filter, handler, BooleanStateChangeEvent.class, subjects, phase);
    }

    public BooleanStateChangeEventBinding(
            UiNodeEventFilter<BooleanStateChangeEvent> filter,
            UiNodeEventHandler<BooleanStateChangeEvent> handler
    ) {
        this(filter, handler, null, null);
    }

    public BooleanStateChangeEventBinding(
            UiNodeEventHandler<BooleanStateChangeEvent> handler
    ) {
        this(null, handler, null, null);
    }
}
