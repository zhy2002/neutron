package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.*;


public abstract class AddNewCompanyApplicantRule extends UiNodeRule<OwnershipListNode<?>> {

    public AddNewCompanyApplicantRule(OwnershipListNode<?> owner) {
        super(owner);
    }

    protected OwnershipListNode<?> getOwnershipListNode() {
        return getOwner();
    }
}
