package zhy2002.neutron;

/**
 * This event fires when a node is passed to removeFromOwner method.
 * All its children and its state will be destroyed by itself is kept to be loaded again.
 * Reset = removeFromOwner + addToOwner.
 */
public final class NodeRemoveEvent<N extends UiNode<? extends ListUiNode<?, N>>> extends ChangeUiNodeEvent {

    private final N target;
    private ListUiNode<?, N> parent;

    public NodeRemoveEvent(N target, UiNodeRuleActivation activation) {
        super(target, activation);

        this.target = target;
        this.parent = target.getParent();
    }

    /**
     * @return the node being removed.
     */
    @Override
    public N getTarget() {
        return this.target;
    }

    public final UiNodeEventTypeEnum getEventType() {
        return UiNodeEventTypeEnum.NodeRemove;
    }

    public ListUiNode<?, N> getParent() {
        return parent;
    }

    @SuppressWarnings("unchecked")
    @Override
    public void apply() {
        parent.removeItemInternal(target);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void revert() {
        parent.addItemInternal(target);
    }

}
