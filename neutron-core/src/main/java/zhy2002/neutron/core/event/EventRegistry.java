package zhy2002.neutron.core.event;

import zhy2002.neutron.core.StateChangeEventFactory;


/**
 * A map of state change event factories.
 */
public interface EventRegistry {

    <T> StateChangeEventFactory<T> getStateChangeEventFactory(Class<T> valueClass);

}
