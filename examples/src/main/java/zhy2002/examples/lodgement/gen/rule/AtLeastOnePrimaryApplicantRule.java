package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.*;


public abstract class AtLeastOnePrimaryApplicantRule extends ValidationRule<PrimaryApplicantFlagNode> {

    public AtLeastOnePrimaryApplicantRule(PrimaryApplicantFlagNode owner) {
        super(owner);
    }

    protected PrimaryApplicantFlagNode getPrimaryApplicantFlagNode() {
        return getOwner();
    }
}
