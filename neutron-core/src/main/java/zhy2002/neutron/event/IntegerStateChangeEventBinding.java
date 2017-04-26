package zhy2002.neutron.event;


import zhy2002.neutron.StateChangeEventBinding;
import zhy2002.neutron.TickPhase;
import zhy2002.neutron.UiNodeEventFilter;
import zhy2002.neutron.UiNodeEventHandler;

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
