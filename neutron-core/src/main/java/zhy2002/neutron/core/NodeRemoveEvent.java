package zhy2002.neutron.core;

import zhy2002.neutron.core.config.NeutronConstants;

import java.util.List;

/**
 * This event fires when a node is passed to removeFromOwner method.
 * All its children and its state will be destroyed by itself is kept to be loaded again.
 * Reset = removeFromOwner + addToOwner.
 * Must be inherited to fill in the type parameters.
 */
public abstract class NodeRemoveEvent<N extends UiNode<? extends ListUiNode<?, N>>>
        extends ChangeUiNodeEvent {

    private final N target;

    public NodeRemoveEvent(N target) {
        super(target, NeutronConstants.ADD_OR_REMOVE_NODE);

        this.target = target;
    }

    /**
     * @return the node being removed.
     */
    @Override
    public N getOrigin() {
        return this.target;
    }

    @SuppressWarnings("unchecked")
    @Override
    public void apply() {
        target.detach();
    }

    @SuppressWarnings("unchecked")
    @Override
    public void revert() {
        target.attach();
    }

    @Override
    protected void addBindingActivations(List<BindingActivation> result, UiNode<?> anchor) {
        super.addBindingActivations(result, anchor);
        addBindingActivations(result, anchor, new UiNodeEventKey<>(NodeRemoveEvent.class, this.getSubject()));
    }
}
