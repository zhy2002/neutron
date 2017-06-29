package zhy2002.mortgage.application.shared;

import zhy2002.mortgage.application.gen.node.MonthYearNode;
import zhy2002.mortgage.application.gen.node.MovedToCurrentAddressNode;
import zhy2002.mortgage.application.rule.MonthYearNoEarlierThanRule;
import zhy2002.neutron.di.Owner;

import javax.inject.Inject;

public class ToCurrentNoEarlierThanFromPreviousRule extends MonthYearNoEarlierThanRule<MovedToCurrentAddressNode> {

    @Inject
    public ToCurrentNoEarlierThanFromPreviousRule(@Owner MovedToCurrentAddressNode owner) {
        super(owner);
    }

    @Override
    protected MonthYearNode<?> getOtherMonthYearNode() {
        return getOwner().getParent().getMovedFromPreviousAddressNode();
    }
}
