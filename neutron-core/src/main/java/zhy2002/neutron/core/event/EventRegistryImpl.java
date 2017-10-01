package zhy2002.neutron.core.event;

import zhy2002.neutron.core.StateChangeEventFactory;
import zhy2002.neutron.core.data.ValidationError;
import zhy2002.neutron.core.data.ValidationErrorList;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * A simple mechanism to allow overriding implementation class.
 */
public class EventRegistryImpl implements EventRegistry {

    private final Map<Class<?>, Object> stateChangeEventFactories = new HashMap<>();

    public EventRegistryImpl() {
        //system -> context -> custom
        loadStateChangeEventFactories();
    }

    private void loadStateChangeEventFactories() {
        this.setStateChangeEventFactory(Boolean.class, BooleanStateChangeEvent::new);
        this.setStateChangeEventFactory(Integer.class, IntegerStateChangeEvent::new);
        this.setStateChangeEventFactory(Double.class, DoubleStateChangeEvent::new);
        this.setStateChangeEventFactory(BigDecimal.class, BigDecimalStateChangeEvent::new);
        this.setStateChangeEventFactory(String.class, StringStateChangeEvent::new);
        this.setStateChangeEventFactory(Object.class, ObjectStateChangeEvent::new);
        this.setStateChangeEventFactory(ValidationErrorList.class, ValidationErrorListStateChangeEvent::new);
        this.setStateChangeEventFactory(ValidationError.class, ValidationErrorStateChangeEvent::new);
    }

    @SuppressWarnings("unchecked")
    @Override
    public final <T> StateChangeEventFactory<T> getStateChangeEventFactory(Class<T> valueClass) {
        return (StateChangeEventFactory<T>) getObject(stateChangeEventFactories, valueClass, "StateChangeEventFactory");
    }

    protected final <T> void setStateChangeEventFactory(Class<T> valueClass, StateChangeEventFactory<T> factory) {
        stateChangeEventFactories.put(valueClass, factory);
    }

    private static Object getObject(Map<Class<?>, Object> map, Class<?> key, String type) {
        Object instance = map.get(key);
        if (instance == null) {
            throw new RuntimeException("Cannot find registered " + type + " instance for " + key.getName());
        }
        return instance;
    }

    final void copyFrom(EventRegistryImpl registry) {
        if (registry == null)
            return;

        stateChangeEventFactories.putAll(registry.stateChangeEventFactories);
    }
}
