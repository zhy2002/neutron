package zhy2002.neutron.event;

import zhy2002.neutron.EventTypeEnum;
import zhy2002.neutron.UiNodeRuleActivation;
import zhy2002.neutron.node.ListUiNode;
import zhy2002.neutron.node.ObjectUiNode;
import zhy2002.neutron.node.ParentUiNode;
import zhy2002.neutron.node.UiNode;

import java.util.ArrayList;

/**
 * This event is fired when a node is attached to a node tree (or context if it is a root node).
 * This event does not fire for the nodes' descendants.
 */
public final class NodeAddEvent<T extends UiNode<? extends ListUiNode<?, T>>> extends UiNodeEvent {

    private final T target;
    private final ListUiNode<?, T> parent;

    public NodeAddEvent(T target) {
        super(target);
        this.target = target;
        this.parent = target.getParent();
    }

    @Override
    public Iterable<UiNodeRuleActivation> getActivations() {
        return new ArrayList<>();
    }

    public final EventTypeEnum getEventType() {
        return EventTypeEnum.Load;
    }

    public ParentUiNode<?> getParent() {
        return parent;
    }

    @Override
    public void apply() {
        parent.addItem(target);
    }

    @Override
    public void revert() {
        parent.removeItem(target);
    }
}
