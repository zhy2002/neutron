package zhy2002.neutron.core;

/**
 * Match a action event.
 */
public class NodeActionEventBinding<E extends NodeActionEvent<?>> extends AbstractEventBinding<E> {

    public NodeActionEventBinding(UiNodeEventHandler<E> handler, Class<E> eventClass, String subject) {
        this(null, handler, eventClass, subject);
    }

    public NodeActionEventBinding(
            UiNodeEventFilter<E> filter,
            UiNodeEventHandler<E> handler,
            Class<? extends E> eventClass,
            String subject
    ) {
        super(filter, handler, eventClass, subject, null);
    }
}
