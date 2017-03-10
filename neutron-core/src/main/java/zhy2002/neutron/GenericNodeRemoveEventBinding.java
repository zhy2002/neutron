package zhy2002.neutron;


import javax.validation.constraints.NotNull;
import java.util.Collections;
import java.util.List;

public class GenericNodeRemoveEventBinding extends NodeRemoveEventBinding<NodeRemoveEvent<?>> {

    public GenericNodeRemoveEventBinding(UiNodeEventFilter<NodeRemoveEvent<?>> filter, @NotNull UiNodeEventHandler<NodeRemoveEvent<?>> handler, @NotNull String subject) {
        super(filter, handler, null, Collections.singleton(subject), null);
    }

    public GenericNodeRemoveEventBinding(@NotNull UiNodeEventHandler<NodeRemoveEvent<?>> handler, @NotNull String subject) {
        this(null, handler, subject);
    }

    @Override
    protected void addEventKey(List<UiNodeEventKey<?>> eventKeys, @NotNull Class<NodeRemoveEvent<?>> eventCLass, String subject) {
        eventKeys.add(new UiNodeEventKey<>(NodeRemoveEvent.class, subject));
    }
}
