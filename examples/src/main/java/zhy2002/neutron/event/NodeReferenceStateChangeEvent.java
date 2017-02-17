package zhy2002.neutron.event;

import zhy2002.neutron.StateChangeEvent;
import zhy2002.neutron.UiNode;
import zhy2002.neutron.data.NodeReference;

/**
 * Have this capturing type for each leaf value type.
 */
public class NodeReferenceStateChangeEvent extends StateChangeEvent<NodeReference> {
    public NodeReferenceStateChangeEvent(UiNode<?> target, String key) {
        super(target, key);
    }

}
