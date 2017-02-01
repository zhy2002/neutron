package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.*;


public abstract class AtMostOnePrimaryApplicantRule extends ValidationRule<PrimaryApplicantFlagNode> {

    public AtMostOnePrimaryApplicantRule(PrimaryApplicantFlagNode owner) {
        super(owner);
    }

    protected PrimaryApplicantFlagNode getPrimaryApplicantFlagNode() {
        return getOwner();
    }
}
