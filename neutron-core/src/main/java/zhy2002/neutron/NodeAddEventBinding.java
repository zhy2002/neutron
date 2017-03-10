package zhy2002.neutron;


import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.Collections;

public class NodeAddEventBinding<E extends NodeAddEvent<?>> extends AbstractEventBinding<E> {

    public NodeAddEventBinding(
            UiNodeEventFilter<E> filter,
            @NotNull UiNodeEventHandler<E> handler,
            Class<E> eventCLass,
            @NotNull Collection<String> subjects,
            @NotNull TickPhase phase
    ) {
        super(filter, handler, eventCLass, subjects, phase);
    }

    public NodeAddEventBinding(
            @NotNull UiNodeEventHandler<E> handler,
            Class<E> eventClass,
            @NotNull String subject
    ) {
        this(null, handler, eventClass, Collections.singletonList(subject), null);
    }
}
