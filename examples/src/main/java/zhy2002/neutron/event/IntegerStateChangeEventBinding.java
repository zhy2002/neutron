package zhy2002.neutron.event;


import zhy2002.neutron.StateChangeEventBinding;
import zhy2002.neutron.TickPhase;
import zhy2002.neutron.UiNodeEventFilter;
import zhy2002.neutron.UiNodeEventHandler;

import java.util.Collection;

public class IntegerStateChangeEventBinding extends StateChangeEventBinding<IntegerStateChangeEvent> {

    public IntegerStateChangeEventBinding(
            UiNodeEventFilter<IntegerStateChangeEvent> filter,
            UiNodeEventHandler<IntegerStateChangeEvent> handler,
            Collection<String> subjects,
            TickPhase phase
    ) {
        super(filter, handler, IntegerStateChangeEvent.class, subjects, phase);
    }

    public IntegerStateChangeEventBinding(
            UiNodeEventHandler<IntegerStateChangeEvent> handler,
            Collection<String> subjects
    ) {
        this(null, handler, subjects, null);
    }
}
