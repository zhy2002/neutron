package zhy2002.neutron.core.event;


import zhy2002.neutron.core.*;

/**
 * A binding for the eventClass passed in constructor.
 *
 * @param <E> the unknown state change event type. It is known when a GenericStateChangeEventBinding object is instantiated.
 */
public class GenericStateChangeEventBinding<E extends StateChangeEvent> extends StateChangeEventBinding<E> {

    public GenericStateChangeEventBinding(
            Class<E> eventClass,
            UiNodeEventFilter<E> filter,
            UiNodeEventHandler<E> handler,
            String subject,
            TickPhase phase
    ) {
        super(filter, handler, eventClass, subject, phase);
    }

    public GenericStateChangeEventBinding(
            Class<E> eventClass,
            UiNodeEventHandler<E> handler,
            String subject
    ) {
        this(eventClass, null, handler, subject, null);
    }

}
