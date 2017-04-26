package zhy2002.neutron.event;

import zhy2002.neutron.StateChangeEventFactory;


/**
 * A central place to obtain event factories.
 */
public interface EventRegistry {

    <T> StateChangeEventFactory<T> getStateChangeEventFactory(Class<T> valueClass);

}
