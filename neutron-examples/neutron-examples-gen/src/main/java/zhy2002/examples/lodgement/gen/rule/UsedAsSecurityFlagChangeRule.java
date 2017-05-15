package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.node.*;


public abstract class UsedAsSecurityFlagChangeRule extends UiNodeRule<UsedAsSecurityFlagNode> {

    public UsedAsSecurityFlagChangeRule(UsedAsSecurityFlagNode owner) {
        super(owner);
    }

    protected UsedAsSecurityFlagNode getUsedAsSecurityFlagNode() {
        return getOwner();
    }
}
