package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.node.*;


public abstract class AddExistingApplicantsRule extends UiNodeRule<OwnershipListNode<?>> {

    public AddExistingApplicantsRule(OwnershipListNode<?> owner) {
        super(owner);
    }

    protected OwnershipListNode<?> getOwnershipListNode() {
        return getOwner();
    }
}
