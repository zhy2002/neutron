package zhy2002.neutron;

import zhy2002.neutron.ChangeUiNodeEvent;
import zhy2002.neutron.ListUiNode;
import zhy2002.neutron.UiNode;

/**
 * This event is fired when a node is attached to a node tree (or context if it is a root node).
 * This event does not fire for the nodes' descendants.
 */
public abstract class NodeAddEvent<N extends UiNode<? extends ListUiNode<?, ?, N>>>
        extends ChangeUiNodeEvent {

    private final N target;

    public NodeAddEvent(N target) {
        super(target);

        this.target = target;
    }

    /**
     * @return the node being added.
     */
    @Override
    public N getTarget() {
        return target;
    }

    @SuppressWarnings("unchecked")
    @Override
    public void apply() {
        target.attach();
    }

    @SuppressWarnings("unchecked")
    @Override
    public void revert() {
        target.detach();
    }

}
