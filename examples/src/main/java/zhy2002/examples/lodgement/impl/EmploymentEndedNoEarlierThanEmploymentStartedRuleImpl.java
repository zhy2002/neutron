package zhy2002.examples.lodgement.impl;

import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.gen.rule.EmploymentEndedNoEarlierThanEmploymentStartedRule;
import zhy2002.neutron.di.Owner;

import javax.inject.Inject;

public class EmploymentEndedNoEarlierThanEmploymentStartedRuleImpl extends EmploymentEndedNoEarlierThanEmploymentStartedRule {

    @Inject
    public EmploymentEndedNoEarlierThanEmploymentStartedRuleImpl(@Owner EmploymentEndedNode owner) {
        super(owner);
    }

    @Override
    protected MonthYearNode<?> getOtherMonthYearNode() {
        return getOwner().getParent().getEmploymentStartedNode();
    }
}
