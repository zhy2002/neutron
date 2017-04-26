package zhy2002.neutron;


import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Match any NodeRemoveEvent.
 */
public class GenericNodeRemoveEventBinding extends NodeRemoveEventBinding<NodeRemoveEvent<?>> {

    public GenericNodeRemoveEventBinding(
            UiNodeEventFilter<NodeRemoveEvent<?>> filter,
            @NotNull UiNodeEventHandler<NodeRemoveEvent<?>> handler,
            TickPhase phase
    ) {
        super(filter, handler, null, phase);
    }

    public GenericNodeRemoveEventBinding(
            UiNodeEventFilter<NodeRemoveEvent<?>> filter,
            @NotNull UiNodeEventHandler<NodeRemoveEvent<?>> handler
    ) {
        super(filter, handler, null, null);
    }

    public GenericNodeRemoveEventBinding(@NotNull UiNodeEventHandler<NodeRemoveEvent<?>> handler) {
        this(null, handler);
    }

    @Override
    protected void addEventKey(List<UiNodeEventKey<?>> eventKeys, @NotNull Class<NodeRemoveEvent<?>> eventCLass, String subject) {
        eventKeys.add(new UiNodeEventKey<>(NodeRemoveEvent.class, subject));
    }
}
