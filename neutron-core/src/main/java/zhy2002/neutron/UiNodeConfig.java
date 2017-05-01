package zhy2002.neutron;

import java.util.List;

/**
 * Base class for all config objects.
 * A UiNodeConfig object is used to provide instance specific
 * (as opposed to Class specific) logic for a UiNode.
 * If Multiple children of a ParentUiNode has the same class,
 * each one can have a different config identified by child name.
 */
public abstract class UiNodeConfig<N extends UiNode<?>> implements UiNodeLifeCycleListener {

    private final N owner;

    public UiNodeConfig(N owner) {
        this.owner = owner;
        owner.addStatusListener(this);
    }

    public final void dispose() {
        owner.removeStatusListener(this);
    }

    public N getOwner() {
        return owner;
    }

    @Override
    public void exitAddToParent() {
    }

    @Override
    public void postCreateRules(List<UiNodeRule<?>> createdRules) {
    }

    @Override
    public void exitLoad() {
    }

}
