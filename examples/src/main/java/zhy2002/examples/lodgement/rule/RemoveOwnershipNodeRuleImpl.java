package zhy2002.examples.lodgement.rule;

import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.gen.rule.RemoveOwnershipNodeRule;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.StringStateChangeEvent;
import zhy2002.neutron.event.StringStateChangeEventBinding;

import javax.inject.Inject;
import java.util.Collection;
import java.util.Collections;

/**
 * Remove the containing ownership node when the referenced node is removed.
 */
public class RemoveOwnershipNodeRuleImpl extends RemoveOwnershipNodeRule {

    @Inject
    public RemoveOwnershipNodeRuleImpl(@Owner ApplicantReferenceNode owner) {
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