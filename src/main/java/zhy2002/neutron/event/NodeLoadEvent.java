package zhy2002.neutron.event;

import zhy2002.neutron.UiNodeRuleActivation;
import zhy2002.neutron.node.UiNode;

/**
 * This event is fired when a node is attached to a node tree (or context if it is a root node).
 * This event does not fire for the nodes' descendants.
 */
public class NodeLoadEvent extends UiNodeEvent {

    protected NodeLoadEvent(UiNode<?> target) {
        super(target);
    }

    @Override
    public Iterable<UiNodeRuleActivation> getActivations() {
        return null;
    }
}
