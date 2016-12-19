package zhy2002.neutron;

import zhy2002.neutron.event.BigDecimalStateChangeEvent;

import java.util.Collection;

public class BigDecimalStateChangeEventBinding extends StateChangeEventBinding<BigDecimalStateChangeEvent> {

    public BigDecimalStateChangeEventBinding(
            UiNodeEventFilter<BigDecimalStateChangeEvent> filter,
            UiNodeEventHandler<BigDecimalStateChangeEvent> handler,
            Collection<String> subjects,
            TickPhase phase
    ) {
        super(filter, handler, BigDecimalStateChangeEvent.class, subjects, phase);
    }

    public BigDecimalStateChangeEventBinding(
            UiNodeEventFilter<BigDecimalStateChangeEvent> filter,
            UiNodeEventHandler<BigDecimalStateChangeEvent> handler
    ) {
        this(filter, handler, null, null);
    }

    public BigDecimalStateChangeEventBinding(
            UiNodeEventHandler<BigDecimalStateChangeEvent> handler
    ) {
        this(null, handler);
    }
}
