package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.node.*;


public abstract class AtMostOnePrimaryApplicantRule extends ValidationRule<PrimaryApplicantFlagNode> {

    public AtMostOnePrimaryApplicantRule(PrimaryApplicantFlagNode owner) {
        super(owner);
    }

    protected PrimaryApplicantFlagNode getPrimaryApplicantFlagNode() {
        return getOwner();
    }
}
