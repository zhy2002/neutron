package zhy2002.neutron;

import zhy2002.neutron.util.NeutronEventSubjects;

import javax.validation.constraints.NotNull;

public final class NodeRemoveEventBinding<E extends NodeRemoveEvent<?>> extends AbstractEventBinding<E> {

    public NodeRemoveEventBinding(
            UiNodeEventFilter<E> filter,
            @NotNull UiNodeEventHandler<E> handler,
            Class<E> eventCLass,
            TickPhase phase) {
        super(filter, handler, eventCLass, NeutronEventSubjects.ADD_OR_REMOVE_NODE, phase);
    }

    public NodeRemoveEventBinding(
            @NotNull UiNodeEventHandler<E> handler,
            Class<E> eventClass
    ) {
        this(null, handler, eventClass, null);
    }
}
