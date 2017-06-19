package zhy2002.neutron.event;

import zhy2002.neutron.*;
import zhy2002.neutron.config.NeutronConstants;

public class AnyStateChangeEventBinding extends GenericStateChangeEventBinding<StateChangeEvent> {

    public AnyStateChangeEventBinding(UiNodeEventFilter<StateChangeEvent> filter, UiNodeEventHandler<StateChangeEvent> handler, String subject, TickPhase phase) {
        super(StateChangeEvent.class, filter, handler, subject, phase);
    }

    public AnyStateChangeEventBinding(UiNodeEventFilter<StateChangeEvent> filter, UiNodeEventHandler<StateChangeEvent> handler) {
        this(filter, handler, NeutronConstants.ANY_VALUE, null);
    }

}
