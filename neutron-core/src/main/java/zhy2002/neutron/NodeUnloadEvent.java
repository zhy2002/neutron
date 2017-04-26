package zhy2002.neutron;

/**
 * This event is fired when a node unloads its content (and children if any).
 * All descendants are unloaded with the target node; no separate unload event is fired for them.
 */
public abstract class NodeUnloadEvent<N extends UiNode<?>>
        extends ChangeUiNodeEvent {

    protected NodeUnloadEvent(N target) {
        super(target, "");
    }

    @Override
    public void apply() {
        UiNode<?> origin = getOrigin();
        if (origin.getNodeStatus() == NodeStatusEnum.Loaded) {
            origin.unloadDirectly();
        }
    }

    @Override
    public void revert() {
        getOrigin().loadDirectly();
    }
}
