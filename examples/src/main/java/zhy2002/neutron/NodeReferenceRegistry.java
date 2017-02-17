package zhy2002.neutron;

import zhy2002.neutron.data.NodeReference;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Context level singleton service class that manages
 * references between nodes.
 * Node hierarchy forms a tree; if we consider references as edges
 * then it becomes a DAG.
 * //todo verify no circle is formed when a reference is created.
 */
@Singleton
public class NodeReferenceRegistry {

    private final Map<NodeReference, Set<ReferenceUiNode<?>>> referenceListMap = new HashMap<>();

    @Inject
    public NodeReferenceRegistry() {
    }

    public void update(ReferenceUiNode<?> owner, NodeReference oldValue, NodeReference newValue) {
        if (oldValue != null) {
            removeEntry(oldValue, owner);
        }

        if (newValue != null) {
            addEntry(newValue, owner);
        }
    }

    private void addEntry(NodeReference newValue, ReferenceUiNode<?> owner) {
        Set<ReferenceUiNode<?>> referenceSet = referenceListMap.get(newValue);
        if (referenceSet == null) {
            referenceSet = new HashSet<>();
            referenceListMap.put(newValue, referenceSet);
        }
        referenceSet.add(owner);
    }

    private void removeEntry(NodeReference oldValue, ReferenceUiNode<?> owner) {
        Set<ReferenceUiNode<?>> referenceSet = referenceListMap.get(oldValue);
        if (referenceSet != null) {
            referenceSet.remove(owner);
            if (referenceSet.size() == 0) {
                referenceListMap.remove(oldValue);
            }
        }
    }

    @SuppressWarnings("unchecked")
    void postRemoveFromParent(UiNode<?> node) {
        NodeReference reference = node.toNodeReference();
        Set<ReferenceUiNode<?>> referenceSet = referenceListMap.get(reference);
        if (referenceSet == null)
            return;

        for (ReferenceUiNode<?> referenceUiNode : referenceSet) {
            ParentUiNode<?> parentUiNode = referenceUiNode.getParent();
            if (parentUiNode instanceof ListUiNode) {
                ((ListUiNode<?, ?, ReferenceUiNode<?>>) parentUiNode).removeItem(referenceUiNode);
            } else {
                referenceUiNode.setValue(null);
            }
        }
    }

}
