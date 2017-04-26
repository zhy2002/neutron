package zhy2002.neutron;


import zhy2002.neutron.util.NeutronEventSubjects;

import javax.validation.constraints.NotNull;

public final class NodeAddEventBinding<E extends NodeAddEvent<?>> extends AbstractEventBinding<E> {

    public NodeAddEventBinding(
            UiNodeEventFilter<E> filter,
            @NotNull UiNodeEventHandler<E> handler,
            Class<E> eventCLass,
            @NotNull TickPhase phase
    ) {
        super(filter, handler, eventCLass, NeutronEventSubjects.ADD_OR_REMOVE_NODE, phase);
    }

    public NodeAddEventBinding(
            @NotNull UiNodeEventHandler<E> handler,
            Class<E> eventClass
    ) {
        this(null, handler, eventClass, null);
    }
}
