package zhy2002.neutron.core.rule;

import zhy2002.neutron.core.*;
import zhy2002.neutron.core.di.Owner;
import zhy2002.neutron.core.event.AnyNodeAddEventBinding;

import javax.inject.Inject;
import java.util.Collection;
import java.util.Collections;

/**
 * Set the new item of this list as the application content node.
 */
public class SetContentNodeToNewItemRule extends UiNodeRule<ListUiNode<?, ?>> {

    @Inject
    public SetContentNodeToNewItemRule(@Owner ListUiNode<?, ?> owner) {
        super(owner);
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Collections.singleton(
                new AnyNodeAddEventBinding(
                        e -> e.getOrigin().getParent() == getOwner() && getContext().isLoaded(),
                        this::setAsContentNode
                )
        );
    }

    private void setAsContentNode(NodeAddEvent<?> nodeAddEvent) {
        RootUiNode<?> rootNode = getOwner().getContext().getRootNode();
        rootNode.setContentNode(nodeAddEvent.getOrigin());
    }
}
