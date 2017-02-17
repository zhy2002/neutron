package zhy2002.neutron;

import zhy2002.neutron.data.NodeReference;

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

    private final Map<NodeReference, UiNode<?>> nodeMap = new HashMap<>();

    @Inject
    public NodeFinder() {}

    @SuppressWarnings("unchecked")
    public <N extends UiNode<?>> N findNodeByReference(@NotNull NodeReference reference) {
        return (N) nodeMap.get(reference);
    }

    public void registerNode(UiNode<?> node) {
        nodeMap.put(node.toNodeReference(), node);
    }

    public void deregisterNode(UiNode<?> node) {
        nodeMap.remove(node.toNodeReference());
    }
}
