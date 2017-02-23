package zhy2002.neutron;

import zhy2002.neutron.node.ReferenceUiNode;

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

    private final Map<String, Set<ReferenceUiNode<?>>> reverseReferenceMap = new HashMap<>();

    @Inject
    public NodeReferenceRegistry() {
    }

    public void update(ReferenceUiNode<?> owner, String oldValue, String newValue) {
        if (oldValue != null) {
            removeEntry(oldValue, owner);
        }

        if (newValue != null) {
            addEntry(newValue, owner);
        }
    }

    private void addEntry(String newValue, ReferenceUiNode<?> owner) {
        Set<ReferenceUiNode<?>> referenceSet = reverseReferenceMap.computeIfAbsent(newValue, k -> new HashSet<>());
        referenceSet.add(owner);
    }

    private void removeEntry(String oldValue, ReferenceUiNode<?> owner) {
        Set<ReferenceUiNode<?>> referenceSet = reverseReferenceMap.get(oldValue);
        if (referenceSet != null) {
            referenceSet.remove(owner);
            if (referenceSet.size() == 0) {
                reverseReferenceMap.remove(oldValue);
            }
        }
    }

    @SuppressWarnings("unchecked")
    void postRemoveFromParent(UiNode<?> node) {
        Set<ReferenceUiNode<?>> referenceSet = reverseReferenceMap.get(node.getPath());
        if (referenceSet == null)
            return;

        for (ReferenceUiNode<?> referenceUiNode : referenceSet) {
            referenceUiNode.setValue(null);
        }
    }

}
