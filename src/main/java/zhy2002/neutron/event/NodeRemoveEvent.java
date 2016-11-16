package zhy2002.neutron.event;

import zhy2002.neutron.EventTypeEnum;
import zhy2002.neutron.UiNodeRuleActivation;
import zhy2002.neutron.node.UiNode;

/**
 * This event fires when a node is removeFromOwner. All its children and its state will be destroyed by itself is kept to be loaded again.
 * Reset = removeFromOwner + addToOwner.
 */
public final class NodeRemoveEvent extends UiNodeEvent {

    protected NodeRemoveEvent(UiNode<?> target) {
        super(target);
    }

    @Override
    public Iterable<UiNodeRuleActivation> getActivations() {
        return null;
    }

    public final EventTypeEnum getEventType() {
        return EventTypeEnum.Unload;
    }

    @Override
    public void apply() {
        throw new RuntimeException();
    }


    @Override
    public void revert() {
        throw new RuntimeException();
    }

}
