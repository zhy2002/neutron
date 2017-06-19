package zhy2002.neutron;

import zhy2002.neutron.config.NeutronConstants;

import javax.validation.constraints.NotNull;

/**
 * Match any NodeRemoveEvent.
 */
public class GenericNodeRemoveEventBinding<E extends NodeRemoveEvent> extends AbstractEventBinding<E> {

    public GenericNodeRemoveEventBinding(
            Class<E> eventClass,
            UiNodeEventFilter<E> filter,
            @NotNull UiNodeEventHandler<E> handler,
            TickPhase phase
    ) {
        super(filter, handler, eventClass, NeutronConstants.ADD_OR_REMOVE_NODE, phase);
    }

    public GenericNodeRemoveEventBinding(
            Class<E> eventClass,
            UiNodeEventFilter<E> filter,
            @NotNull UiNodeEventHandler<E> handler
    ) {
        this(eventClass, filter, handler, null);
    }

    public GenericNodeRemoveEventBinding(
            Class<E> eventClass,
            @NotNull UiNodeEventHandler<E> handler
    ) {
        this(eventClass, null, handler);
    }
}
