package zhy2002.neutron.event;

import zhy2002.neutron.*;

public class AnyStateChangeEventBinding extends GenericStateChangeEventBinding<StateChangeEvent> {

    public AnyStateChangeEventBinding(UiNodeEventFilter<StateChangeEvent> filter, UiNodeEventHandler<StateChangeEvent> handler, String subject, TickPhase phase) {
        super(StateChangeEvent.class, filter, handler, subject, phase);
    }

    public AnyStateChangeEventBinding(Class<StateChangeEvent> eventClass, UiNodeEventHandler<StateChangeEvent> handler, String subject) {
        super(StateChangeEvent.class, handler, subject);
    }
}
