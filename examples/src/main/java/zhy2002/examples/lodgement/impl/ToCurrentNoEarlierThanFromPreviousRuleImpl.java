package zhy2002.examples.lodgement.impl;

import zhy2002.examples.lodgement.gen.MonthYearNode;
import zhy2002.examples.lodgement.gen.MovedToCurrentAddressNode;
import zhy2002.examples.lodgement.gen.rule.ToCurrentNoEarlierThanFromPreviousRule;

public class ToCurrentNoEarlierThanFromPreviousRuleImpl extends ToCurrentNoEarlierThanFromPreviousRule {

    public ToCurrentNoEarlierThanFromPreviousRuleImpl(MovedToCurrentAddressNode owner) {
        super(owner);
    }

    @Override
    protected MonthYearNode<?> getOtherMonthYearNode() {
        return getOwner().getParent().getMovedFromPreviousAddressNode();
    }
}
