package zhy2002.neutron;

import zhy2002.neutron.config.NeutronConstants;

/**
 * This event is fired when a node loads its content (and children if any).
 * All descendants are loaded with the target node; no separate load event is fired for them.
 */
public abstract class NodeLoadEvent<N extends UiNode<?>>
        extends ChangeUiNodeEvent {

    protected NodeLoadEvent(N origin) {
        super(origin, "");
    }

    @Override
    public void apply() {
        UiNode<?> origin = getOrigin();
        if (origin.getNodeStatus() == NodeStatusEnum.Unloaded) {
            origin.loadDirectly();
            origin.refreshWithReason(NeutronConstants.NODE_LOADED_REFRESH_REASON);
        }
    }

    @Override
    public void revert() {
        getOrigin().unloadDirectly();
    }
}
