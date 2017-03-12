package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.node.*;


public abstract class OwnershipRequiredValidationRule extends ValidationRule<OwnershipListNode<?>> {

    public OwnershipRequiredValidationRule(OwnershipListNode<?> owner) {
        super(owner);
    }

    protected OwnershipListNode<?> getOwnershipListNode() {
        return getOwner();
    }
}
