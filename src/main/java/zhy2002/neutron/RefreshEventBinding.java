package zhy2002.neutron;

import zhy2002.neutron.util.ValueUtil;

import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class RefreshEventBinding extends AbstractEventBinding<RefreshUiNodeEvent> {

    private static final List<String> DEFAULT_SUBJECTS = Collections.singletonList(PredefinedEventSubjects.DEFAULT_REFRESH_REASON);

    public RefreshEventBinding(
            UiNodeEventFilter<RefreshUiNodeEvent> filter,
            UiNodeEventHandler<RefreshUiNodeEvent> handler,
            Collection<String> subjects,
            TickPhase phase) {
        super(
                filter,
                handler,
                RefreshUiNodeEvent.class,
                ValueUtil.ifNull(subjects, DEFAULT_SUBJECTS),
                phase
        );
    }

    public RefreshEventBinding(
            UiNodeEventFilter<RefreshUiNodeEvent> filter,
            UiNodeEventHandler<RefreshUiNodeEvent> handler) {
        this(filter, handler, null, null);
    }

    public RefreshEventBinding(
            UiNodeEventHandler<RefreshUiNodeEvent> handler) {
        this(null, handler, null, null);
    }
}
