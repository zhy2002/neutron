package zhy2002.neutron;

/**
 * This event fires when a node is passed to removeFromOwner method.
 * All its children and its state will be destroyed by itself is kept to be loaded again.
 * Reset = removeFromOwner + addToOwner.
 * Must be inherited to fill in the type parameters.
 */
public abstract class NodeRemoveEvent<N extends UiNode<?>>
        extends ChangeUiNodeEvent {

    private final N target;

    public NodeRemoveEvent(N target) {
        super(target, target.getParent().getName());

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

}
