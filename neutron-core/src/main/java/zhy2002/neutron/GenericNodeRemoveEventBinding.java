package zhy2002.neutron;

import zhy2002.neutron.config.NeutronConstants;

import javax.validation.constraints.NotNull;

/**
 * Match any NodeRemoveEvent.
 */
public final class GenericNodeRemoveEventBinding extends AbstractEventBinding<NodeRemoveEvent<?>> {

    public GenericNodeRemoveEventBinding(
            UiNodeEventFilter<NodeRemoveEvent<?>> filter,
            @NotNull UiNodeEventHandler<NodeRemoveEvent<?>> handler,
            TickPhase phase
    ) {
        super(filter, handler, NodeRemoveEvent.class, NeutronConstants.ADD_OR_REMOVE_NODE, phase);
    }

    public GenericNodeRemoveEventBinding(
            UiNodeEventFilter<NodeRemoveEvent<?>> filter,
            @NotNull UiNodeEventHandler<NodeRemoveEvent<?>> handler
    ) {
        this(filter, handler, null);
    }

    public GenericNodeRemoveEventBinding(@NotNull UiNodeEventHandler<NodeRemoveEvent<?>> handler) {
        this(null, handler);
    }
}
