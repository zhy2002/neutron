package zhy2002.neutron;


import zhy2002.neutron.util.NeutronConstants;

import javax.validation.constraints.NotNull;

public final class NodeAddEventBinding<E extends NodeAddEvent<?>> extends AbstractEventBinding<E> {

    public NodeAddEventBinding(
            UiNodeEventFilter<E> filter,
            @NotNull UiNodeEventHandler<E> handler,
            Class<E> eventCLass,
            @NotNull TickPhase phase
    ) {
        super(filter, handler, eventCLass, NeutronConstants.ADD_OR_REMOVE_NODE, phase);
    }

    public NodeAddEventBinding(
            UiNodeEventFilter<E> filter,
            @NotNull UiNodeEventHandler<E> handler,
            Class<E> eventCLass
    ) {
        this(filter, handler, eventCLass, null);
    }

    public NodeAddEventBinding(
            @NotNull UiNodeEventHandler<E> handler,
            Class<E> eventClass
    ) {
        this(null, handler, eventClass, null);
    }
}
