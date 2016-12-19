package zhy2002.neutron;

/**
 * This event is fired when a node is attached to a node tree (or context if it is a root node).
 * This event does not fire for the nodes' descendants.
 */
public abstract class NodeAddEvent<N extends UiNode<? extends ListUiNode<?, ?, N>>>
        extends ChangeUiNodeEvent {

    private final N target;

    public NodeAddEvent(N target) {
        super(target, target.getParent().getName());

        this.target = target;
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
    }

    @SuppressWarnings("unchecked")
    @Override
    public void revert() {
        target.detach();
    }

}
