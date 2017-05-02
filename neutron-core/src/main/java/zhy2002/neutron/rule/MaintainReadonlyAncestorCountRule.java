package zhy2002.neutron.rule;


import zhy2002.neutron.*;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.BooleanStateChangeEvent;
import zhy2002.neutron.event.BooleanStateChangeEventBinding;
import zhy2002.neutron.util.NeutronConstants;

import javax.inject.Inject;
import java.util.*;

/**
 * Add this rule to a parent if all descendants should be readonly when it is readonly.
 * When this parent node becomes readonly, increment readonly ancestor count of all descendants.
 * When this parent node becomes not readonly, decrement readonly ancestor count of all descendants.
 */
public class MaintainReadonlyAncestorCountRule extends UiNodeRule<ParentUiNode<?>> {

    @Inject
    protected MaintainReadonlyAncestorCountRule(@Owner ParentUiNode<?> owner) {
        super(owner);
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Arrays.asList(
                new BooleanStateChangeEventBinding(
                        e -> e.getOrigin() == getOwner() && !Objects.equals(e.getOldValue(), e.getNewValue()),
                        this::updateCount,
                        UiNode.READONLY_PROPERTY.getStateKey()
                ),
                new RefreshEventBinding(
                        e -> e.getOrigin() == getOwner(),
                        this::initCount,
                        NeutronConstants.NODE_LOADED_REFRESH_REASON
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

        doUpdate(delta);
    }

    private void initCount(RefreshUiNodeEvent event) {
        if (getOwner().isReadonly()) {
            doUpdate(1);
        }
    }

    private void doUpdate(int delta) {
        Queue<UiNode<?>> nodes = new ArrayDeque<>();
        nodes.addAll(Arrays.asList(getOwner().getChildren()));
        while (!nodes.isEmpty()) {
            UiNode<?> node = nodes.poll();
            node.setReadonlyAncestorCount(node.getReadonlyAncestorCount() + delta);
            if (node instanceof ParentUiNode) {
                ParentUiNode<?> parent = (ParentUiNode<?>) node;
                nodes.addAll(Arrays.asList(parent.getChildren()));
            }
        }
    }
}
