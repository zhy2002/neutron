package zhy2002.examples.lodgement.impl;

import zhy2002.examples.lodgement.gen.EmploymentEndedNode;
import zhy2002.examples.lodgement.gen.MonthYearNode;
import zhy2002.examples.lodgement.gen.rule.EmploymentEndedNoEarlierThanEmploymentStartedRule;

public class EmploymentEndedNoEarlierThanEmploymentStartedRuleImpl extends EmploymentEndedNoEarlierThanEmploymentStartedRule {

    public EmploymentEndedNoEarlierThanEmploymentStartedRuleImpl(EmploymentEndedNode owner) {
        super(owner);
    }

    @Override
    protected MonthYearNode<?> getOtherMonthYearNode() {
        return getOwner().getParent().getEmploymentStartedNode();
    }
}
