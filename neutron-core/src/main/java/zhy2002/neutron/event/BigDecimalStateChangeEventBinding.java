package zhy2002.neutron.event;

import zhy2002.neutron.StateChangeEventBinding;
import zhy2002.neutron.TickPhase;
import zhy2002.neutron.UiNodeEventFilter;
import zhy2002.neutron.UiNodeEventHandler;

public class BigDecimalStateChangeEventBinding extends StateChangeEventBinding<BigDecimalStateChangeEvent> {

    public BigDecimalStateChangeEventBinding(
            UiNodeEventFilter<BigDecimalStateChangeEvent> filter,
            UiNodeEventHandler<BigDecimalStateChangeEvent> handler,
            String subject,
            TickPhase phase
    ) {
        super(filter, handler, BigDecimalStateChangeEvent.class, subject, phase);
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
