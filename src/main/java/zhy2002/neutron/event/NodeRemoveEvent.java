package zhy2002.neutron.event;

import zhy2002.neutron.EventTypeEnum;
import zhy2002.neutron.node.ListUiNode;
import zhy2002.neutron.node.UiNode;

/**
 * This event fires when a node is removeFromOwner. All its children and its state will be destroyed by itself is kept to be loaded again.
 * Reset = removeFromOwner + addToOwner.
 */
public final class NodeRemoveEvent<N extends UiNode<? extends ListUiNode<?, N>>> extends UiNodeEvent {

    private final N target;
    private ListUiNode<?, N> parent;

    public NodeRemoveEvent(N target) {
        super(target);
        this.target = target;
        this.parent = target.getParent();
    }

    @Override
    public N getTarget() {
        return this.target;
    }

    public final EventTypeEnum getEventType() {
        return EventTypeEnum.Unload;
    }

    @Override
    public void apply() {
        parent.removeItemInternal(target);
    }


    @Override
    public void revert() {
       parent.addItemInternal(target);
    }

}
