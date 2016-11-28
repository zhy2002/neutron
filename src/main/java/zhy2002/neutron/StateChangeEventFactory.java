package zhy2002.neutron;

/**
 * Abstract factory class for state change events.
 */
public abstract class StateChangeEventFactory<T> {

    public abstract StateChangeEvent<T> create(UiNode<?> target, String key, T oldValue, T newValue);

    protected StateChangeEvent<T> init(StateChangeEvent<T> event, T oldValue, T newValue) {
        event.setOldValue(oldValue);
        event.setNewValue(newValue);
        return event;
    }
}