package zhy2002.neutron.event;

import zhy2002.neutron.StateChangeEvent;
import zhy2002.neutron.StateChangeEventFactory;
import zhy2002.neutron.UiNode;
import zhy2002.neutron.data.NodeReference;

/**
 * Event factory.
 */
public class NodeReferenceStateChangeEventFactory implements StateChangeEventFactory<NodeReference> {

    @Override
    public StateChangeEvent<NodeReference> create(UiNode<?> target, String key) {
        return new NodeReferenceStateChangeEvent(target, key);
    }
}

