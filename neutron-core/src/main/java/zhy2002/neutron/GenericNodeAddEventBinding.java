package zhy2002.neutron;


import javax.validation.constraints.NotNull;
import java.util.Collections;
import java.util.List;

public class GenericNodeAddEventBinding extends NodeAddEventBinding<NodeAddEvent<?>> {


    public GenericNodeAddEventBinding(
            UiNodeEventFilter<NodeAddEvent<?>> filter,
            @NotNull UiNodeEventHandler<NodeAddEvent<?>> handler,
            @NotNull String subject,
            TickPhase phase) {
        super(filter, handler, null, Collections.singleton(subject), phase);
    }

    public GenericNodeAddEventBinding(
            UiNodeEventFilter<NodeAddEvent<?>> filter,
            @NotNull UiNodeEventHandler<NodeAddEvent<?>> handler,
            @NotNull String subject) {
        super(filter, handler, null, Collections.singleton(subject), null);
    }

    public GenericNodeAddEventBinding(
            @NotNull UiNodeEventHandler<NodeAddEvent<?>> handler,
            @NotNull String subject) {
        this(null, handler, subject);
    }

    @Override
    protected void addEventKey(List<UiNodeEventKey<?>> uiNodeEventKeys, @NotNull Class<NodeAddEvent<?>> eventCLass, String subject) {
        uiNodeEventKeys.add(new UiNodeEventKey<>(NodeAddEvent.class, subject));
    }
}
