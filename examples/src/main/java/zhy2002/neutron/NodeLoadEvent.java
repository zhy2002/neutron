package zhy2002.neutron;

import zhy2002.neutron.util.NeutronEventSubjects;

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
        getOrigin().load();
        getOrigin().refreshWithReason(NeutronEventSubjects.NODE_LOADED_REFRESH_REASON);
    }

    @Override
    public void revert() {
        getOrigin().unload();
    }
}
