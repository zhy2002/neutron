package zhy2002.neutron.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.config.NeutronConstants;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.AnyNodeAddEventBinding;
import zhy2002.neutron.event.BooleanStateChangeEvent;
import zhy2002.neutron.event.BooleanStateChangeEventBinding;
import zhy2002.neutron.util.TraversalUtil;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.Collection;

/**
 * Add this rule to a parent node if all descendants should be disabled when it is disabled.
 * When this parent node becomes disabled, increment disabled ancestor count of all descendants.
 * When this parent node becomes not disabled, decrement disabled ancestor count of all descendants.
 */
public class MaintainDisabledAncestorCountRule extends UiNodeRule<ParentUiNode<?>> {

    private static String PROCESSED_FLAG = MaintainDisabledAncestorCountRule.class.getSimpleName();

    @Inject
    protected MaintainDisabledAncestorCountRule(@Owner ParentUiNode<?> owner) {
        super(owner);
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Arrays.asList(
                new BooleanStateChangeEventBinding(//owner node is enabled or disabled
                        e -> e.getOrigin() == getOwner(),
                        this::updateCount,
                        UiNode.DISABLED_PROPERTY.getStateKey()
                ),
                new RefreshEventBinding( //owner node is loaded
                        e -> e.getOrigin() == getOwner(),
                        e -> this.initCount(),
                        NeutronConstants.NODE_LOADED_REFRESH_REASON
                ),
                new AnyNodeAddEventBinding( //a descendant is added
                        e -> e.getOrigin() != getOwner(),
                        e -> {
                            if (!e.getFlags().contains(PROCESSED_FLAG)) {
                                this.initCount(e.getOrigin());
                                e.getFlags().add(PROCESSED_FLAG);
                            }
                        }
                )
        );
    }

    private void updateCount(BooleanStateChangeEvent event) {
        int delta;
        if (Boolean.TRUE.equals(event.getNewValue())) {
            delta = 1;
        } else {
            delta = -1;
        }
        doUpdate(delta, getOwner().getChildren());
    }

    private void initCount() {
        int delta = getOwner().isDisabled() ? 1 : 0;
        delta += getOwner().getDisabledAncestorCount();
        doUpdate(delta, getOwner().getChildren());
    }

    private void initCount(UiNode<?> node) {
        assert node.getParent() != null;
        int delta = node.getParent().getDisabledAncestorCount();
        if (node.getParent().isDisabled()) {
            delta += 1;
        }
        doUpdate(delta, node);
    }

    private void doUpdate(final int delta, UiNode<?>... nodes) {
        if (delta == 0)
            return;

        TraversalUtil.bfs(
                node -> {
                    boolean old = node.isEffectivelyDisabled();
                    node.setDisabledAncestorCount(node.getDisabledAncestorCount() + delta);
                    if (node.isEffectivelyDisabled() != old) {
                        node.queueNotification(NeutronConstants.STATE_CHANGE_NOTIFICATION, null);
                    }
                },
                nodes
        );
    }
}