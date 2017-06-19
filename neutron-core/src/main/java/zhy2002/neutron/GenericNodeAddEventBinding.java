package zhy2002.neutron;


import zhy2002.neutron.config.NeutronConstants;

import javax.validation.constraints.NotNull;

/**
 * Match any NodeAddEvent.
 */
public class GenericNodeAddEventBinding<E extends NodeAddEvent> extends AbstractEventBinding<E> {

    public GenericNodeAddEventBinding(
            Class<E> eventCLass,
            UiNodeEventFilter<E> filter,
            @NotNull UiNodeEventHandler<E> handler,
            TickPhase phase) {
        super(filter, handler, eventCLass, NeutronConstants.ADD_OR_REMOVE_NODE, phase);
    }

    public GenericNodeAddEventBinding(
            Class<E> eventCLass,
            UiNodeEventFilter<E> filter,
            @NotNull UiNodeEventHandler<E> handler
    ) {
        this(eventCLass, filter, handler, null);
    }

    public GenericNodeAddEventBinding(
            Class<E> eventCLass,
            @NotNull UiNodeEventHandler<E> handler
    ) {
        this(eventCLass, null, handler);
    }
}
