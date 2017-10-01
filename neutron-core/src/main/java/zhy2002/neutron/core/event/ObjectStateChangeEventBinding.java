package zhy2002.neutron.core.event;

import zhy2002.neutron.core.StateChangeEventBinding;
import zhy2002.neutron.core.TickPhase;
import zhy2002.neutron.core.UiNodeEventFilter;
import zhy2002.neutron.core.UiNodeEventHandler;

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
