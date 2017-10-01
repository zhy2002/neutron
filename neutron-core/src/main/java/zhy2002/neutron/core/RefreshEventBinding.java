package zhy2002.neutron.core;

import zhy2002.neutron.core.config.NeutronConstants;
import zhy2002.neutron.core.util.ValueUtil;


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
                ValueUtil.ifNull(subject, NeutronConstants.DEFAULT_REFRESH_REASON),
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
