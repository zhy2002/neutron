package zhy2002.neutron.rule;


import zhy2002.neutron.*;
import zhy2002.neutron.config.NeutronConstants;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.BooleanStateChangeEvent;
import zhy2002.neutron.event.BooleanStateChangeEventBinding;
import zhy2002.neutron.util.TraversalUtil;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.Collection;

/**
 * Add this rule to a parent if all descendants should be readonly when it is readonly.
 * When this parent node becomes readonly, increment readonly ancestor count of all descendants.
 * When this parent node becomes not readonly, decrement readonly ancestor count of all descendants.
 */
public class MaintainReadonlyAncestorCountRule extends UiNodeRule<ParentUiNode<?>> {

    private static String PROCESSED_FLAG = MaintainReadonlyAncestorCountRule.class.getSimpleName();

    @Inject
    protected MaintainReadonlyAncestorCountRule(@Owner ParentUiNode<?> owner) {
        super(owner);
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Arrays.asList(
                new BooleanStateChangeEventBinding(
                        e -> e.getOrigin() == getOwner(),
                        this::updateCount,
                        UiNode.READONLY_PROPERTY.getStateKey()
                ),
                new RefreshEventBinding(
                        e -> e.getOrigin() == getOwner(),
                        e -> this.initCount(),
                        NeutronConstants.NODE_LOADED_REFRESH_REASON
                ),
                new GenericNodeAddEventBinding( //a descendant is added
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
        int delta = getOwner().isReadonly() ? 1 : 0;
        delta += getOwner().getReadonlyAncestorCount();
        doUpdate(delta, getOwner().getChildren());
    }

    private void initCount(UiNode<?> node) {
        assert node.getParent() != null;
        int delta = node.getParent().isReadonly() ? 1 : 0;
        delta += node.getParent().getReadonlyAncestorCount();
        doUpdate(delta, node);
    }

    private void doUpdate(final int delta, UiNode<?>... nodes) {
        if (delta == 0)
            return;

        TraversalUtil.bfs(
                node -> {
                    boolean old = node.isEffectivelyReadonly();
                    node.setReadonlyAncestorCount(node.getReadonlyAncestorCount() + delta);
                    if (node.isEffectivelyReadonly() != old) {
                        node.queueNotification(NeutronConstants.STATE_CHANGE_NOTIFICATION, null);
                    }
                },
                nodes
        );
    }
}
