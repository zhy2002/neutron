package zhy2002.neutron;


import javax.validation.constraints.NotNull;
import java.util.Collections;
import java.util.List;

/**
 * Match any NodeAddEvent.
 */
public class GenericNodeAddEventBinding extends NodeAddEventBinding<NodeAddEvent<?>> {

    public GenericNodeAddEventBinding(
            UiNodeEventFilter<NodeAddEvent<?>> filter,
            @NotNull UiNodeEventHandler<NodeAddEvent<?>> handler,
            TickPhase phase) {
        super(filter, handler, null, phase);
    }

    public GenericNodeAddEventBinding(
            UiNodeEventFilter<NodeAddEvent<?>> filter,
            @NotNull UiNodeEventHandler<NodeAddEvent<?>> handler) {
        super(filter, handler, null, null);
    }

    public GenericNodeAddEventBinding(
            @NotNull UiNodeEventHandler<NodeAddEvent<?>> handler) {
        this(null, handler);
    }

    @Override
    protected void addEventKey(List<UiNodeEventKey<?>> uiNodeEventKeys, @NotNull Class<NodeAddEvent<?>> eventCLass, String subject) {
        uiNodeEventKeys.add(new UiNodeEventKey<>(NodeAddEvent.class, subject));
    }
}
