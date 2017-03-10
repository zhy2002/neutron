package zhy2002.neutron;

import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.Collections;

public class NodeRemoveEventBinding<E extends NodeRemoveEvent<?>> extends AbstractEventBinding<E> {

    public NodeRemoveEventBinding(
            UiNodeEventFilter<E> filter,
            @NotNull UiNodeEventHandler<E> handler,
             Class<E> eventCLass,
            @NotNull Collection<String> subjects,
            TickPhase phase) {
        super(filter, handler, eventCLass, subjects, phase);
    }

    public NodeRemoveEventBinding(
            @NotNull UiNodeEventHandler<E> handler,
             Class<E> eventClass,
            @NotNull String subject
    ) {
        this(null, handler, eventClass, Collections.singletonList(subject), null);
    }
}
