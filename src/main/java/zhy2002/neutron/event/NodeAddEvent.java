package zhy2002.neutron.event;

import zhy2002.neutron.EventTypeEnum;
import zhy2002.neutron.node.ListUiNode;
import zhy2002.neutron.node.ParentUiNode;
import zhy2002.neutron.node.UiNode;

/**
 * This event is fired when a node is attached to a node tree (or context if it is a root node).
 * This event does not fire for the nodes' descendants.
 */
public final class NodeAddEvent<N extends UiNode<? extends ListUiNode<?, N>>> extends UiNodeEvent {

    private final N target;
    private final ListUiNode<?, N> parent;

    public NodeAddEvent(N target) {
        super(target);
        this.target = target;
        this.parent = target.getParent();
    }

    public final EventTypeEnum getEventType() {
        return EventTypeEnum.Load;
    }

    public ParentUiNode<?> getParent() {
        return parent;
    }

    @Override
    public void apply() {
        parent.addItemInternal(target);
    }

    @Override
    public void revert() {
        parent.removeItemInternal(target);
    }
}
