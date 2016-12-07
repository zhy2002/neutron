package zhy2002.neutron;

import java.util.*;

/**
 * A simple mechanism to allow overriding implementation class.
 */
public class ClassRegistryImpl implements ClassRegistry {

    private final Map<Class<?>, Object> uiNodeRuleFactories = new HashMap<>();
    private final Map<Class<?>, Object> childNodeFactories = new HashMap<>();
    private final Map<Class<?>, Object> stateChangeEventFactories = new HashMap<>();
    private final Map<Class<?>, Object> nodeAddEventFactories = new HashMap<>();
    private final Map<Class<?>, Object> nodeRemoveEventFactories = new HashMap<>();
    private final Map<Class<?>, List<UiNodeConfig<?>>> nodeConfigMap = new HashMap<>();

    protected ClassRegistryImpl() {
    }

    protected ClassRegistryImpl(ClassRegistryImpl proto) {
        if (proto != null) {
            uiNodeRuleFactories.putAll(proto.uiNodeRuleFactories);
            childNodeFactories.putAll(proto.childNodeFactories);
            stateChangeEventFactories.putAll(proto.stateChangeEventFactories);
            nodeAddEventFactories.putAll(proto.nodeAddEventFactories);
            nodeRemoveEventFactories.putAll(proto.nodeRemoveEventFactories);
            nodeConfigMap.putAll(proto.nodeConfigMap);
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public <R extends UiNodeRule<?, N>, N extends UiNode<?>> UiNodeRuleFactory<R, N> getUiNodeRuleFactory(Class<R> ruleClass) {
        Object instance = uiNodeRuleFactories.get(ruleClass);
        if (instance == null) {
            throw new RuntimeException("Cannot find registered instance of " + ruleClass.getName());
        }
        return (UiNodeRuleFactory<R, N>) instance;
    }

    public final <R extends UiNodeRule<?, N>, N extends UiNode<?>> void setUiNodeRuleFactory(Class<R> ruleClass, UiNodeRuleFactory<R, N> factory) {
        uiNodeRuleFactories.put(ruleClass, factory);
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T> StateChangeEventFactory<T> getStateChangeEventFactory(Class<T> valueClass) {
        Object instance = stateChangeEventFactories.get(valueClass);
        if (instance == null) {
            throw new RuntimeException("Cannot find registered StateChangeEventFactory for " + valueClass.getName());
        }
        return (StateChangeEventFactory<T>) instance;
    }

    public final <T> void setStateChangeEventFactory(Class<T> valueClass, StateChangeEventFactory<T> factory) {
        stateChangeEventFactories.put(valueClass, factory);
    }

    @SuppressWarnings("unchecked")
    @Override
    public <N extends UiNode<S>, S extends ListUiNode<?, S, N>> NodeAddEventFactory<N> getNodeAddEventFactory(Class<N> itemClass) {
        Object instance = nodeAddEventFactories.get(itemClass);
        if (instance == null) {
            throw new RuntimeException("Cannot find registered NodeAddEventFactory for " + itemClass.getName());
        }
        return (NodeAddEventFactory<N>) instance;
    }

    public final <N extends UiNode<S>, S extends ListUiNode<?, S, N>> void setNodeAddEventFactory(Class<N> itemClass, NodeAddEventFactory<N> factory) {
        nodeAddEventFactories.put(itemClass, factory);
    }

    @SuppressWarnings("unchecked")
    @Override
    public <N extends UiNode<S>, S extends ListUiNode<?, S, N>> NodeRemoveEventFactory<N> getNodeRemoveEventFactory(Class<N> itemClass) {
        Object instance = nodeRemoveEventFactories.get(itemClass);
        if (instance == null) {
            throw new RuntimeException("Cannot find registered NodeRemoveEventFactory for " + itemClass.getName());
        }
        return (NodeRemoveEventFactory<N>) instance;
    }

    public final <N extends UiNode<S>, S extends ListUiNode<?, S, N>> void setNodeRemoveEventFactory(Class<N> itemClass, NodeRemoveEventFactory<N> factory) {
        nodeRemoveEventFactories.put(itemClass, factory);
    }

    @SuppressWarnings("unchecked")
    @Override
    public <N extends UiNode<P>, P extends ParentUiNode<?>> ChildNodeFactory<N, P> getChildNodeFactory(Class<N> childNodeClass) {
        Object instance = childNodeFactories.get(childNodeClass);
        if (instance == null) {
            throw new RuntimeException("Cannot find registered ChildNodeFactory for " + childNodeClass.getName());
        }
        return (ChildNodeFactory<N, P>) instance;
    }

    public final <N extends UiNode<P>, P extends ParentUiNode<?>> void setChildNodeFactory(Class<N> childNodeClass, ChildNodeFactory<N, P> factory) {
        childNodeFactories.put(childNodeClass, factory);
    }

    @SuppressWarnings("unchecked")
    @Override
    public <N extends UiNode<?>> UiNodeConfig<N> getUiNodeConfig(Class<N> nodeClass, String name) {
        List<UiNodeConfig<?>> configList = nodeConfigMap.get(nodeClass);
        if (configList != null) {
            for (UiNodeConfig<?> config : configList) {
                if (Objects.equals(config.getName(), name))
                    return (UiNodeConfig<N>) config;
            }
        }
        return null;
    }

    public <N extends UiNode<?>> void setUiNodeConfig(Class<N> nodeClass, UiNodeConfig<N> config) {
        if (!nodeConfigMap.containsKey(nodeClass)) {
            nodeConfigMap.put(nodeClass, new LinkedList<>());
        }
        nodeConfigMap.get(nodeClass).add(config);
    }
}
