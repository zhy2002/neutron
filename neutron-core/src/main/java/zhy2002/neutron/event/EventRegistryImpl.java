package zhy2002.neutron.event;

import zhy2002.neutron.NodeLoadEventFactory;
import zhy2002.neutron.NodeUnloadEventFactory;
import zhy2002.neutron.StateChangeEventFactory;
import zhy2002.neutron.UiNode;
import zhy2002.neutron.data.ValidationError;
import zhy2002.neutron.data.ValidationErrorList;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * A simple mechanism to allow overriding implementation class.
 */
public class EventRegistryImpl implements EventRegistry {

    private final Map<Class<?>, Object> stateChangeEventFactories = new HashMap<>();
    private final Map<Class<?>, Object> nodeLoadEventFactories = new HashMap<>();
    private final Map<Class<?>, Object> nodeUnloadEventFactories = new HashMap<>();

    public EventRegistryImpl() {
        //system -> context -> custom
        loadStateChangeEventFactories();
    }

    final void copyFrom(EventRegistryImpl registry) {
        if (registry == null)
            return;

        stateChangeEventFactories.putAll(registry.stateChangeEventFactories);
        nodeLoadEventFactories.putAll(registry.nodeLoadEventFactories);
        nodeUnloadEventFactories.putAll(registry.nodeUnloadEventFactories);
    }

    private static Object getObject(Map<Class<?>, Object> map, Class<?> key, String type) {
        Object instance = map.get(key);
        if (instance == null) {
            throw new RuntimeException("Cannot find registered " + type + " instance for " + key.getName());
        }
        return instance;
    }

    private void loadStateChangeEventFactories() {
        this.setStateChangeEventFactory(String.class, StringStateChangeEvent::new);
        this.setStateChangeEventFactory(Boolean.class, BooleanStateChangeEvent::new);
        this.setStateChangeEventFactory(BigDecimal.class, BigDecimalStateChangeEvent::new);
        this.setStateChangeEventFactory(ValidationErrorList.class, ValidationErrorListStateChangeEvent::new);
        this.setStateChangeEventFactory(Object.class, ObjectStateChangeEvent::new);
        this.setStateChangeEventFactory(Integer.class, IntegerStateChangeEvent::new);
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

    @SuppressWarnings("unchecked")
    @Override
    public final <N extends UiNode<?>> NodeLoadEventFactory<N> getNodeLoadEventFactory(Class<N> nodeClass) {
        return (NodeLoadEventFactory<N>) getObject(nodeLoadEventFactories, nodeClass, "NodeLoadEventFactory");
    }

    protected final <N extends UiNode<?>> void setNodeLoadEventFactory(Class<N> nodeClass, NodeLoadEventFactory<N> factory) {
        nodeLoadEventFactories.put(nodeClass, factory);
    }

    @SuppressWarnings("unchecked")
    @Override
    public final <N extends UiNode<?>> NodeUnloadEventFactory<N> getNodeUnloadEventFactory(Class<N> nodeClass) {
        return (NodeUnloadEventFactory<N>) getObject(nodeUnloadEventFactories, nodeClass, "NodeUnloadEventFactory");
    }

    protected final <N extends UiNode<?>> void setNodeUnloadEventFactory(Class<N> nodeClass, NodeUnloadEventFactory<N> factory) {
        nodeUnloadEventFactories.put(nodeClass, factory);
    }

}
