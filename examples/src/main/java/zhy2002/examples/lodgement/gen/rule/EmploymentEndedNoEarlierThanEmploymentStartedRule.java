package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.*;


public abstract class EmploymentEndedNoEarlierThanEmploymentStartedRule extends MonthYearNoEarlierThanRule<EmploymentEndedNode> {

    public EmploymentEndedNoEarlierThanEmploymentStartedRule(EmploymentEndedNode owner) {
        super(owner);
    }

    protected EmploymentEndedNode getEmploymentEndedNode() {
        return getOwner();
    }
}
