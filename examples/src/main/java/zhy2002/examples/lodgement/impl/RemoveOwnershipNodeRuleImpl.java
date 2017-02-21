package zhy2002.examples.lodgement.impl;

import zhy2002.examples.lodgement.gen.ApplicantReferenceNode;
import zhy2002.examples.lodgement.gen.OwnershipListNode;
import zhy2002.examples.lodgement.gen.OwnershipNode;
import zhy2002.examples.lodgement.gen.rule.RemoveOwnershipNodeRule;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.event.StringStateChangeEvent;
import zhy2002.neutron.event.StringStateChangeEventBinding;

import java.util.Collection;
import java.util.Collections;

/**
 * Remove the containing ownership node when the referenced node is removed.
 */
public class RemoveOwnershipNodeRuleImpl extends RemoveOwnershipNodeRule {

    public RemoveOwnershipNodeRuleImpl(ApplicantReferenceNode owner) {
        super(owner);
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Collections.singletonList(
                new StringStateChangeEventBinding(
                        e -> e.getNewValue() == null,
                        this::removeOwnership
                )
        );
    }

    private void removeOwnership(StringStateChangeEvent event) {
        OwnershipNode ownershipNode = getOwner().getParent();
        ownershipNode.getParent().removeItem(ownershipNode);
    }
}
