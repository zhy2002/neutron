package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.node.*;


public abstract class AddNewPersonApplicantRule extends UiNodeRule<OwnershipListNode<?>> {

    public AddNewPersonApplicantRule(OwnershipListNode<?> owner) {
        super(owner);
    }

    protected OwnershipListNode<?> getOwnershipListNode() {
        return getOwner();
    }
}