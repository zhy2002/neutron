package zhy2002.neutron;


import zhy2002.neutron.util.NeutronConstants;

import javax.validation.constraints.NotNull;

/**
 * Match any NodeAddEvent.
 */
public final class GenericNodeAddEventBinding extends AbstractEventBinding<NodeAddEvent<?>> {

    public GenericNodeAddEventBinding(
            UiNodeEventFilter<NodeAddEvent<?>> filter,
            @NotNull UiNodeEventHandler<NodeAddEvent<?>> handler,
            TickPhase phase) {
        super(filter, handler, NodeAddEvent.class, NeutronConstants.ADD_OR_REMOVE_NODE, phase);
    }

    public GenericNodeAddEventBinding(
            UiNodeEventFilter<NodeAddEvent<?>> filter,
            @NotNull UiNodeEventHandler<NodeAddEvent<?>> handler) {
        this(filter, handler, null);
    }

    public GenericNodeAddEventBinding(
            @NotNull UiNodeEventHandler<NodeAddEvent<?>> handler) {
        this(null, handler);
    }
}
