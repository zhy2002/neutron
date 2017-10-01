package zhy2002.neutron.core.event;


import zhy2002.neutron.core.StateChangeEventBinding;
import zhy2002.neutron.core.TickPhase;
import zhy2002.neutron.core.UiNodeEventFilter;
import zhy2002.neutron.core.UiNodeEventHandler;

public class IntegerStateChangeEventBinding extends StateChangeEventBinding<IntegerStateChangeEvent> {

    public IntegerStateChangeEventBinding(
            UiNodeEventFilter<IntegerStateChangeEvent> filter,
            UiNodeEventHandler<IntegerStateChangeEvent> handler,
            String subject,
            TickPhase phase
    ) {
        super(filter, handler, IntegerStateChangeEvent.class, subject, phase);
    }

    public IntegerStateChangeEventBinding(
            UiNodeEventHandler<IntegerStateChangeEvent> handler,
            String subject
    ) {
        this(null, handler, subject, null);
    }
}
