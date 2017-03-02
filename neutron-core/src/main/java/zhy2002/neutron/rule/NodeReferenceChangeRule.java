package zhy2002.neutron.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.StringStateChangeEvent;
import zhy2002.neutron.event.StringStateChangeEventBinding;
import zhy2002.neutron.node.ReferenceUiNode;
import zhy2002.neutron.util.NeutronEventSubjects;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;


public class NodeReferenceChangeRule extends UiNodeRule<ReferenceUiNode<?>> {

    @Inject
    NodeReferenceRegistry nodeReferenceRegistry;

    @Inject
    public NodeReferenceChangeRule(@Owner ReferenceUiNode<?> owner) {
        super(owner);
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Arrays.asList(
                new RefreshEventBinding(
                        this::loadReference,
                        Collections.singletonList(NeutronEventSubjects.NODE_LOADED_REFRESH_REASON)
                ),
                new StringStateChangeEventBinding(
                        this::updateReference
                )
        );
    }

    private void loadReference(RefreshUiNodeEvent event) {
        nodeReferenceRegistry.update(getOwner(), null, getOwner().getValue());
    }

    private void updateReference(StringStateChangeEvent event) {
        if(event.getNewValue() == null && getOwner().isRemoveEmpty()) {
            ParentUiNode<?> parentNode = getOwner().getParent();
            if(parentNode instanceof ListUiNode<?, ?>) {
                ((ListUiNode<?, ?>)parentNode).removeByName(getOwner().getName());
            } else if(parentNode != null && parentNode.getParent() instanceof ListUiNode<?,?>) {
                ((ListUiNode<?, ?>)parentNode.getParent()).removeByName(parentNode.getName());
            }
        } else {
            nodeReferenceRegistry.update(getOwner(), event.getOldValue(), event.getNewValue());
        }
    }
}
