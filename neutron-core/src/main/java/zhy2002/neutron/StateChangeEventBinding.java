package zhy2002.neutron;

import zhy2002.neutron.util.NeutronEventSubjects;
import zhy2002.neutron.util.PredefinedPhases;
import zhy2002.neutron.util.ValueUtil;

public abstract class StateChangeEventBinding<E extends StateChangeEvent> extends AbstractEventBinding<E> {

    protected StateChangeEventBinding(
            UiNodeEventFilter<E> filter,
            UiNodeEventHandler<E> handler,
            Class<E> eventCLass,
            String subject,
            TickPhase phase
    ) {
        super(
                filter,
                handler,
                eventCLass,
                ValueUtil.ifNull(subject, NeutronEventSubjects.VALUE),
                ValueUtil.ifNull(phase, PredefinedPhases.Post)
        );
    }
}
