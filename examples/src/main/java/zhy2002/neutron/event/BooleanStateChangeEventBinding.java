package zhy2002.neutron.event;

import zhy2002.neutron.StateChangeEventBinding;
import zhy2002.neutron.TickPhase;
import zhy2002.neutron.UiNodeEventFilter;
import zhy2002.neutron.UiNodeEventHandler;

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
            UiNodeEventHandler<BooleanStateChangeEvent> handler,
            Collection<String> subjects
    ) {
        this(null, handler, subjects, null);
    }

    public BooleanStateChangeEventBinding(
            UiNodeEventFilter<BooleanStateChangeEvent> filter,
            UiNodeEventHandler<BooleanStateChangeEvent> handler
    ) {
        this(filter, handler, null, null);
    }

    public BooleanStateChangeEventBinding(
            UiNodeEventFilter<BooleanStateChangeEvent> filter,
            UiNodeEventHandler<BooleanStateChangeEvent> handler,
            Collection<String> subjects
    ) {
        this(filter, handler, subjects, null);
    }

    public BooleanStateChangeEventBinding(
            UiNodeEventHandler<BooleanStateChangeEvent> handler
    ) {
        this(null, handler, null, null);
    }
}
