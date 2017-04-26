package zhy2002.neutron;

import javax.validation.constraints.NotNull;
import java.util.Collections;

public class NodeRemoveEventBinding<E extends NodeRemoveEvent<?>> extends AbstractEventBinding<E> {

    public NodeRemoveEventBinding(
            UiNodeEventFilter<E> filter,
            @NotNull UiNodeEventHandler<E> handler,
            Class<E> eventCLass,
            TickPhase phase) {
        super(filter, handler, eventCLass, Collections.singleton(""), phase);
    }

    public NodeRemoveEventBinding(
            @NotNull UiNodeEventHandler<E> handler,
            Class<E> eventClass
    ) {
        this(null, handler, eventClass, null);
    }
}
