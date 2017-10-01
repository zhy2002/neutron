package zhy2002.neutron.core;

/**
 * Abstract factory class for state change events.
 */
@FunctionalInterface
public interface StateChangeEventFactory<T> {

    default StateChangeEvent<T> create(UiNode<?> target, String key, T oldValue, T newValue) {
        StateChangeEvent<T> event = create(target, key);
        event.setOldValue(oldValue);
        event.setNewValue(newValue);
        return event;
    }

    StateChangeEvent<T> create(UiNode<?> target, String key);
}