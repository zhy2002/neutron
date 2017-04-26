package zhy2002.neutron.event;

import zhy2002.neutron.StateChangeEventBinding;
import zhy2002.neutron.TickPhase;
import zhy2002.neutron.UiNodeEventFilter;
import zhy2002.neutron.UiNodeEventHandler;

public class ObjectStateChangeEventBinding extends StateChangeEventBinding<ObjectStateChangeEvent> {

    protected ObjectStateChangeEventBinding(
            UiNodeEventFilter<ObjectStateChangeEvent> filter,
            UiNodeEventHandler<ObjectStateChangeEvent> handler,
            Class<ObjectStateChangeEvent> eventCLass,
            String subject,
            TickPhase phase
    ) {
        super(filter, handler, eventCLass, subject, phase);
    }
}
