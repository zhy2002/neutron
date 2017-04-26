package zhy2002.neutron;

import zhy2002.neutron.util.NeutronEventSubjects;

import java.util.List;

/**
 * This event is fired when a node is attached to a node tree (or context if it is a root node).
 * This event does not fire for the nodes' descendants.
 */
public abstract class NodeAddEvent<N extends UiNode<? extends ListUiNode<?, N>>>
        extends ChangeUiNodeEvent {

    private final N target;

    public NodeAddEvent(N origin) {
        super(origin, NeutronEventSubjects.ADD_OR_REMOVE_NODE);

        this.target = origin;
    }

    /**
     * @return the node being added.
     */
    @Override
    public N getOrigin() {
        return target;
    }

    @SuppressWarnings("unchecked")
    @Override
    public void apply() {
        target.attach();
        target.refreshWithReason(NeutronEventSubjects.NODE_LOADED_REFRESH_REASON);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void revert() {
        target.detach();
    }

    @Override
    protected void addBindingActivations(List<BindingActivation> result, UiNode<?> anchor) {
        super.addBindingActivations(result, anchor);
        addBindingActivations(result, anchor, new UiNodeEventKey<>(NodeAddEvent.class, this.getSubject()));
    }
}
