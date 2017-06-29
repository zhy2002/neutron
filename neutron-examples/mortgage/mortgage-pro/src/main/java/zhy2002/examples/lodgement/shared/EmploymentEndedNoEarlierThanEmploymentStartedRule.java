package zhy2002.examples.lodgement.shared;

import zhy2002.examples.lodgement.gen.node.EmploymentEndedNode;
import zhy2002.examples.lodgement.gen.node.MonthYearNode;
import zhy2002.examples.lodgement.rule.MonthYearNoEarlierThanRule;
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
