package zhy2002.neutron.event;

import zhy2002.neutron.*;

/**
 * A binding for the eventClass passed in constructor.
 *
 * @param <E> the unknown state change event type. It is known when a GenericStateChangeEventBinding object is instantiated.
 */
public class GenericStateChangeEventBinding<E extends StateChangeEvent> extends StateChangeEventBinding<E> {

    public GenericStateChangeEventBinding(
            UiNodeEventHandler<E> handler, Class<E> eventCLass) {
        super(null, handler, eventCLass, null, null);
    }

    public GenericStateChangeEventBinding(
            UiNodeEventFilter<E> filter, UiNodeEventHandler<E> handler, Class<E> eventCLass, TickPhase phase) {
        super(filter, handler, eventCLass, null, phase);
    }
}
