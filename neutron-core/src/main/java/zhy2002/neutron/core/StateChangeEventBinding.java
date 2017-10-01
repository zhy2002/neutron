package zhy2002.neutron.core;

import zhy2002.neutron.core.util.ValueUtil;

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
                subject,
                ValueUtil.ifNull(phase, PredefinedPhases.Post)
        );
    }
}
