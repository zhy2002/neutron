package zhy2002.neutron.event;

import zhy2002.neutron.UiNodeRuleActivation;
import zhy2002.neutron.node.UiNode;

/**
 * This event fires when a node is unload. All its children and its state will be destroyed by itself is kept to be loaded again.
 * Reset = unload + load.
 */
public class NodeUnloadEvent extends UiNodeEvent {

    protected NodeUnloadEvent(UiNode<?> target) {
        super(target);
    }

    @Override
    public Iterable<UiNodeRuleActivation> getActivations() {
        return null;
    }

    @Override
    public void apply() {

    }
}
