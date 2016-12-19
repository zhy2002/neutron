package zhy2002.neutron;

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
            nodeLoadEventFactories.putAll(proto.nodeLoadEventFactories);
            nodeUnloadEventFactories.putAll(proto.nodeUnloadEventFactories);
        }
    }

    private static Object getObject(Map<Class<?>, Object> map, Class<?> key, String type) {
        Object instance = map.get(key);
        if (instance == null) {
            throw new RuntimeException("Cannot find registered " + type + " instance for " + key.getName());
        }
        return instance;
    }

    @SuppressWarnings("unchecked")
    @Override
    public <N extends UiNode<P>, P extends ParentUiNode<?>> ChildNodeFactory<N, P> getChildNodeFactory(Class<N> childNodeClass) {
        return (ChildNodeFactory<N, P>) getObject(childNodeFactories, childNodeClass, "ChildNodeFactory");
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

    public final <N extends UiNode<?>> void setUiNodeConfig(Class<N> nodeClass, UiNodeConfig<N> config) {
        if (!nodeConfigMap.containsKey(nodeClass)) {
            nodeConfigMap.put(nodeClass, new LinkedList<>());
        }
        nodeConfigMap.get(nodeClass).add(config);
    }

    @SuppressWarnings("unchecked")
    @Override
    public <R extends UiNodeRule<N>, N extends UiNode<?>> UiNodeRuleFactory<R, N> getUiNodeRuleFactory(Class<R> ruleClass) {
        return (UiNodeRuleFactory<R, N>) getObject(uiNodeRuleFactories, ruleClass, "UiNodeRuleFactory");
    }

    public final <R extends UiNodeRule<N>, N extends UiNode<?>> void setUiNodeRuleFactory(Class<R> ruleClass, UiNodeRuleFactory<R, N> factory) {
        uiNodeRuleFactories.put(ruleClass, factory);
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T> StateChangeEventFactory<T> getStateChangeEventFactory(Class<T> valueClass) {
        return (StateChangeEventFactory<T>) getObject(stateChangeEventFactories, valueClass, "StateChangeEventFactory");
    }

    public final <T> void setStateChangeEventFactory(Class<T> valueClass, StateChangeEventFactory<T> factory) {
        stateChangeEventFactories.put(valueClass, factory);
    }

    @SuppressWarnings("unchecked")
    @Override
    public <N extends UiNode<S>, S extends ListUiNode<?, S, N>> NodeAddEventFactory<N> getNodeAddEventFactory(Class<N> itemClass) {
        return (NodeAddEventFactory<N>) getObject(nodeAddEventFactories, itemClass, "NodeAddEventFactory");
    }

    public final <N extends UiNode<S>, S extends ListUiNode<?, S, N>> void setNodeAddEventFactory(Class<N> itemClass, NodeAddEventFactory<N> factory) {
        nodeAddEventFactories.put(itemClass, factory);
    }

    @SuppressWarnings("unchecked")
    @Override
    public <N extends UiNode<S>, S extends ListUiNode<?, S, N>> NodeRemoveEventFactory<N> getNodeRemoveEventFactory(Class<N> itemClass) {
        return (NodeRemoveEventFactory<N>) getObject(nodeRemoveEventFactories, itemClass, "NodeRemoveEventFactory");
    }

    public final <N extends UiNode<S>, S extends ListUiNode<?, S, N>> void setNodeRemoveEventFactory(Class<N> itemClass, NodeRemoveEventFactory<N> factory) {
        nodeRemoveEventFactories.put(itemClass, factory);
    }

    @SuppressWarnings("unchecked")
    @Override
    public <N extends UiNode<?>> NodeLoadEventFactory<N> getNodeLoadEventFactory(Class<N> nodeClass) {
        return (NodeLoadEventFactory<N>) getObject(nodeLoadEventFactories, nodeClass, "NodeLoadEventFactory");
    }

    public <N extends UiNode<?>> void setNodeLoadEventFactory(Class<N> nodeClass, NodeLoadEventFactory<N> factory) {
        nodeLoadEventFactories.put(nodeClass, factory);
    }

    @SuppressWarnings("unchecked")
    @Override
    public <N extends UiNode<?>> NodeUnloadEventFactory<N> getNodeUnloadEventFactory(Class<N> nodeClass) {
        return (NodeUnloadEventFactory<N>) getObject(nodeUnloadEventFactories, nodeClass, "NodeUnloadEventFactory");
    }

    public <N extends UiNode<?>> void setNodeUnloadEventFactory(Class<N> nodeClass, NodeUnloadEventFactory<N> factory) {
        nodeUnloadEventFactories.put(nodeClass, factory);
    }

}
