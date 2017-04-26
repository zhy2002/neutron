package zhy2002.neutron;

import zhy2002.neutron.util.NeutronEventSubjects;
import zhy2002.neutron.util.ValueUtil;


public class RefreshEventBinding extends AbstractEventBinding<RefreshUiNodeEvent> {

    public RefreshEventBinding(
            UiNodeEventFilter<RefreshUiNodeEvent> filter,
            UiNodeEventHandler<RefreshUiNodeEvent> handler,
            String subject,
            TickPhase phase) {
        super(
                filter,
                handler,
                RefreshUiNodeEvent.class,
                ValueUtil.ifNull(subject, NeutronEventSubjects.DEFAULT_REFRESH_REASON),
                phase
        );
    }

    public RefreshEventBinding(
            UiNodeEventFilter<RefreshUiNodeEvent> filter,
            UiNodeEventHandler<RefreshUiNodeEvent> handler,
            String subject) {
        this(filter, handler, subject, null);
    }

    public RefreshEventBinding(
            UiNodeEventFilter<RefreshUiNodeEvent> filter,
            UiNodeEventHandler<RefreshUiNodeEvent> handler) {
        this(filter, handler, null, null);
    }

    public RefreshEventBinding(
            UiNodeEventHandler<RefreshUiNodeEvent> handler,
            String subject
    ) {
        this(null, handler, subject, null);
    }

    public RefreshEventBinding(
            UiNodeEventHandler<RefreshUiNodeEvent> handler
    ) {
        this(null, handler, null, null);
    }

    public RefreshEventBinding(
            UiNodeEventHandler<RefreshUiNodeEvent> handler,
            TickPhase phase) {
        this(null, handler, null, phase);
    }
}
