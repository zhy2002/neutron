package zhy2002.mortgage.application.shared;


import zhy2002.mortgage.application.gen.node.MonthYearNode;
import zhy2002.mortgage.application.gen.node.MovedFromPreviousAddressNode;
import zhy2002.mortgage.application.rule.MonthYearNoEarlierThanRule;
import zhy2002.neutron.core.di.Owner;

import javax.inject.Inject;

public class FromPreviousNoEarlierThanToPreviousRule extends MonthYearNoEarlierThanRule<MovedFromPreviousAddressNode> {

    @Inject
    public FromPreviousNoEarlierThanToPreviousRule(@Owner MovedFromPreviousAddressNode owner) {
        super(owner);
    }

    @Override
    protected MonthYearNode<?> getOtherMonthYearNode() {
        return getOwner().getParent().getMovedToPreviousAddressNode();
    }
}
