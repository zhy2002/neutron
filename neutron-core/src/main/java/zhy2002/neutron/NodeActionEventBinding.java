package zhy2002.neutron;

/**
 * Match a action event.
 */
public class NodeActionEventBinding<E extends NodeActionEvent<?>> extends AbstractEventBinding<E> {

    public NodeActionEventBinding(UiNodeEventHandler<E> handler, Class<E> eventClass) {
        this(null, handler, eventClass);
    }

    public NodeActionEventBinding(
            UiNodeEventFilter<E> filter,
            UiNodeEventHandler<E> handler,
            Class<? extends E> eventClass
    ) {
        super(filter, handler, eventClass, "", null);
    }
}
