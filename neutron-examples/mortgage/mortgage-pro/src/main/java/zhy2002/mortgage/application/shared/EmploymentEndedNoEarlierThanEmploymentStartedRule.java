package zhy2002.mortgage.application.shared;

import zhy2002.mortgage.application.gen.node.EmploymentEndedNode;
import zhy2002.mortgage.application.gen.node.MonthYearNode;
import zhy2002.mortgage.application.rule.MonthYearNoEarlierThanRule;
import zhy2002.neutron.di.Owner;

import javax.inject.Inject;

public class EmploymentEndedNoEarlierThanEmploymentStartedRule extends MonthYearNoEarlierThanRule<EmploymentEndedNode> {

    @Inject
    public EmploymentEndedNoEarlierThanEmploymentStartedRule(@Owner EmploymentEndedNode owner) {
        super(owner);
    }

    protected EmploymentEndedNode getEmploymentEndedNode() {
        return getOwner();
    }

    @Override
    protected MonthYearNode<?> getOtherMonthYearNode() {
        return getOwner().getParent().getEmploymentStartedNode();
    }
}
