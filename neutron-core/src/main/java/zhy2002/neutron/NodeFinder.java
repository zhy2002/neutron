package zhy2002.neutron;

import jsinterop.annotations.JsMethod;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.Map;

/**
 * A service used to locate nodes.
 */
@Singleton
public class NodeFinder {

    private final Map<String, UiNode<?>> mapPathToNode = new HashMap<>();
    private final Map<String, UiNode<?>> mapIdToNode = new HashMap<>();

    @Inject
    public NodeFinder() {
    }

    @JsMethod
    @SuppressWarnings("unchecked")
    public <N extends UiNode<?>> N findNodeByPath(@NotNull String path) {
        return (N) mapPathToNode.get(path);
    }

    @JsMethod
    @SuppressWarnings("unchecked")
    public <N extends UiNode<?>> N findNodeById(@NotNull String path) {
        return (N) mapIdToNode.get(path);
    }

    @SuppressWarnings("unchecked")
    public <N extends UiNode<?>> N findSibling(UiNode<?> node, String name) {
        return (N) node.getParent().getChild(name);
    }

    @SuppressWarnings("unchecked")
    public <N extends UiNode<?>> N findAncestor(UiNode<?> node, Class<N> ancestorType) {
        UiNode<?> ancestor = node.getParent();
        while (ancestor != null) {
            if (isInstanceOf(ancestor, ancestorType))
                break;
            ancestor = ancestor.getParent();
        }
        return (N) ancestor;
    }

    private boolean isInstanceOf(UiNode<?> ancestor, Class<?> ancestorType) {
        Class<?> clazz = ancestor.getClass();
        do {
            if (clazz == ancestorType)
                return true;
            clazz = clazz.getSuperclass();
        } while (clazz != null);
        return false;
    }

    public void registerNode(UiNode<?> node) {
        mapPathToNode.put(node.getPath(), node);
        mapIdToNode.put(node.getUniqueId(), node);
    }

    public void deregisterNode(UiNode<?> node) {
        mapPathToNode.remove(node.getPath());
        mapIdToNode.remove(node.getUniqueId());
    }

    public boolean isAncestor(UiNode<?> target, UiNode<?> source) {
        UiNode<?> ancestor = source.getParent();
        while (ancestor != null) {
            if (ancestor == target)
                return true;
            ancestor = ancestor.getParent();
        }
        return false;
    }
}
