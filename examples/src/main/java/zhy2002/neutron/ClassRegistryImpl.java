package zhy2002.neutron;

import zhy2002.neutron.data.ValidationError;
import zhy2002.neutron.data.ValidationErrorList;
import zhy2002.neutron.event.*;
import zhy2002.neutron.node.BigDecimalUiNode;
import zhy2002.neutron.node.StringUiNode;
import zhy2002.neutron.rule.*;

import java.math.BigDecimal;
import java.util.*;

/**
 * A simple mechanism to allow overriding implementation class.
 */
public class ClassRegistryImpl implements ClassRegistry {
    private final Map<Class<?>, Object> childNodeFactories = new HashMap<>();
    private final Map<Class<?>, Object> uiNodeRuleFactories = new HashMap<>();
    private final Map<Class<?>, List<UiNodeConfig<?>>> nodeConfigMap = new HashMap<>();
    private final Map<Class<?>, Object> stateChangeEventFactories = new HashMap<>();
    private final Map<Class<?>, Object> nodeAddEventFactories = new HashMap<>();
    private final Map<Class<?>, Object> nodeRemoveEventFactories = new HashMap<>();
    private final Map<Class<?>, Object> nodeLoadEventFactories = new HashMap<>();
    private final Map<Class<?>, Object> nodeUnloadEventFactories = new HashMap<>();

    public ClassRegistryImpl() {
        //system -> context -> custom
        loadStateChangeEventFactories();
    }

    final void copyFrom(ClassRegistryImpl registry) {
        if (registry == null)
            return;

        uiNodeRuleFactories.putAll(registry.uiNodeRuleFactories);
        childNodeFactories.putAll(registry.childNodeFactories);
        stateChangeEventFactories.putAll(registry.stateChangeEventFactories);
        nodeAddEventFactories.putAll(registry.nodeAddEventFactories);
        nodeRemoveEventFactories.putAll(registry.nodeRemoveEventFactories);
        nodeConfigMap.putAll(registry.nodeConfigMap);
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
        this.setStateChangeEventFactory(String.class, new StringStateChangeEventFactory());
        this.setStateChangeEventFactory(Boolean.class, new BooleanStateChangeEventFactory());
        this.setStateChangeEventFactory(BigDecimal.class, new BigDecimalStateChangeEventFactory());
        this.setStateChangeEventFactory(ValidationErrorList.class, new ValidationErrorListStateChangeEventFactory());
        this.setStateChangeEventFactory(Object.class, new ObjectStateChangeEventFactory());
        this.setStateChangeEventFactory(Integer.class, new IntegerStateChangeEventFactory());
        this.setStateChangeEventFactory(ValidationError.class, ValidationErrorStateChangeEvent::new);
    }

    @SuppressWarnings("unchecked")
    @Override
    public final <T> StateChangeEventFactory<T> getStateChangeEventFactory(Class<T> valueClass) {
        return (StateChangeEventFactory<T>) getObject(stateChangeEventFactories, valueClass, "StateChangeEventFactory");
    }

    public final <T> void setStateChangeEventFactory(Class<T> valueClass, StateChangeEventFactory<T> factory) {
        stateChangeEventFactories.put(valueClass, factory);
    }

    @SuppressWarnings("unchecked")
    @Override
    public final <N extends UiNode<S>, S extends ListUiNode<?, S, N>> NodeAddEventFactory<N> getNodeAddEventFactory(Class<N> itemClass) {
        return (NodeAddEventFactory<N>) getObject(nodeAddEventFactories, itemClass, "NodeAddEventFactory");
    }

    public final <N extends UiNode<S>, S extends ListUiNode<?, S, N>> void setNodeAddEventFactory(Class<N> itemClass, NodeAddEventFactory<N> factory) {
        nodeAddEventFactories.put(itemClass, factory);
    }

    @SuppressWarnings("unchecked")
    @Override
    public final <N extends UiNode<S>, S extends ListUiNode<?, S, N>> NodeRemoveEventFactory<N> getNodeRemoveEventFactory(Class<N> itemClass) {
        return (NodeRemoveEventFactory<N>) getObject(nodeRemoveEventFactories, itemClass, "NodeRemoveEventFactory");
    }

    public final <N extends UiNode<S>, S extends ListUiNode<?, S, N>> void setNodeRemoveEventFactory(Class<N> itemClass, NodeRemoveEventFactory<N> factory) {
        nodeRemoveEventFactories.put(itemClass, factory);
    }

    @SuppressWarnings("unchecked")
    @Override
    public final <N extends UiNode<?>> NodeLoadEventFactory<N> getNodeLoadEventFactory(Class<N> nodeClass) {
        return (NodeLoadEventFactory<N>) getObject(nodeLoadEventFactories, nodeClass, "NodeLoadEventFactory");
    }

    public final <N extends UiNode<?>> void setNodeLoadEventFactory(Class<N> nodeClass, NodeLoadEventFactory<N> factory) {
        nodeLoadEventFactories.put(nodeClass, factory);
    }

    @SuppressWarnings("unchecked")
    @Override
    public final <N extends UiNode<?>> NodeUnloadEventFactory<N> getNodeUnloadEventFactory(Class<N> nodeClass) {
        return (NodeUnloadEventFactory<N>) getObject(nodeUnloadEventFactories, nodeClass, "NodeUnloadEventFactory");
    }

    public final <N extends UiNode<?>> void setNodeUnloadEventFactory(Class<N> nodeClass, NodeUnloadEventFactory<N> factory) {
        nodeUnloadEventFactories.put(nodeClass, factory);
    }

}
