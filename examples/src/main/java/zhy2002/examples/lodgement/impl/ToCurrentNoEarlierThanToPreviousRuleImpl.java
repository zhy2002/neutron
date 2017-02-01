package zhy2002.examples.lodgement.impl;

import zhy2002.examples.lodgement.gen.MonthYearNode;
import zhy2002.examples.lodgement.gen.MovedToCurrentAddressNode;
import zhy2002.examples.lodgement.gen.rule.ToCurrentNoEarlierThanToPreviousRule;


public class ToCurrentNoEarlierThanToPreviousRuleImpl extends ToCurrentNoEarlierThanToPreviousRule {

    public ToCurrentNoEarlierThanToPreviousRuleImpl(MovedToCurrentAddressNode owner) {
        super(owner);
    }

    @Override
    protected MonthYearNode<?> getOtherMonthYearNode() {
        return getOwner().getParent().getMovedToPreviousAddressNode();
    }
}
