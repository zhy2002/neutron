package zhy2002.neutron;


import javax.validation.constraints.NotNull;
import java.util.Collections;

public class NodeAddEventBinding<E extends NodeAddEvent<?>> extends AbstractEventBinding<E> {

    public NodeAddEventBinding(
            UiNodeEventFilter<E> filter,
            @NotNull UiNodeEventHandler<E> handler,
            Class<E> eventCLass,
            @NotNull TickPhase phase
    ) {
        super(filter, handler, eventCLass, Collections.singleton(""), phase);
    }

    public NodeAddEventBinding(
            @NotNull UiNodeEventHandler<E> handler,
            Class<E> eventClass
    ) {
        this(null, handler, eventClass, null);
    }
}
