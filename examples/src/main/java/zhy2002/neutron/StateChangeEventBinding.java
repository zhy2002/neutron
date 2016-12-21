package zhy2002.neutron;

import zhy2002.neutron.util.ValueUtil;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public abstract class StateChangeEventBinding<E extends StateChangeEvent> extends AbstractEventBinding<E> {

    private static final List<String> DEFAULT_SUBJECTS = Collections.singletonList(PredefinedEventSubjects.VALUE);

    protected StateChangeEventBinding(
            UiNodeEventFilter<E> filter,
            UiNodeEventHandler<E> handler,
            Class<E> eventCLass,
            Collection<String> subjects,
            TickPhase phase
    ) {
        super(
                filter,
                handler,
                eventCLass,
                ValueUtil.ifNull(subjects, DEFAULT_SUBJECTS),
                ValueUtil.ifNull(phase, PredefinedPhases.Post)
        );
    }
}
