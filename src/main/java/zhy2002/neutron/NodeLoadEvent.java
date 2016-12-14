package zhy2002.neutron;

/**
 * This event is fired when a node loads its content (and children if any).
 * All descendants are loaded with the target node; no separate load event is fired for them.
 */
public abstract class NodeLoadEvent<N extends UiNode<?>>
        extends ChangeUiNodeEvent {

    protected NodeLoadEvent(UiNode<?> target) {
        super(target);
    }

    @Override
    public void apply() {
        getTarget().load();
    }

    @Override
    public void revert() {
        getTarget().unload();
    }
}