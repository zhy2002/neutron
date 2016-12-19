package zhy2002.neutron;

/**
 * This event is fired when a node loads its content (and children if any).
 * All descendants are loaded with the target node; no separate load event is fired for them.
 */
public abstract class NodeLoadEvent<N extends UiNode<?>>
        extends ChangeUiNodeEvent {

    protected NodeLoadEvent(UiNode<?> origin) {
        super(origin, "");
    }

    @Override
    public void apply() {
        getOrigin().load();
    }

    @Override
    public void revert() {
        getOrigin().unload();
    }
}
