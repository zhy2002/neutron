package zhy2002.neutron;

/**
 * This event is fired when a node is attached to a node tree (or context if it is a root node).
 * This event does not fire for the nodes' descendants.
 */
public abstract class NodeAddEvent<N extends UiNode<? extends ListUiNode<?, N>>>
        extends ChangeUiNodeEvent {

    private final N target;
    private final ListUiNode<?, N> parent;

    public NodeAddEvent(N target) {
        super(target);

        this.target = target;
        this.parent = target.getParent();
    }

    /**
     * @return the node being added.
     */
    @Override
    public N getTarget() {
        return target;
    }

    public ListUiNode<?, N> getParent() {
        return parent;
    }

    @SuppressWarnings("unchecked")
    @Override
    public void apply() {
        parent.addItemInternal(target);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void revert() {
        parent.removeItemInternal(target);
    }

}
