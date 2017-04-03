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

    private final Map<String, UiNode<?>> nodeMap = new HashMap<>();

    @Inject
    public NodeFinder() {
    }

    @JsMethod
    @SuppressWarnings("unchecked")
    public <N extends UiNode<?>> N findNodeByPath(@NotNull String path) {
        return (N) nodeMap.get(path);
    }

    public void registerNode(UiNode<?> node) {
        nodeMap.put(node.getPath(), node);
    }

    public void deregisterNode(UiNode<?> node) {
        nodeMap.remove(node.getPath());
    }
}
