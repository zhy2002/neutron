package zhy2002.examples.lodgement.impl;


import zhy2002.examples.lodgement.gen.MonthYearNode;
import zhy2002.examples.lodgement.gen.MovedFromPreviousAddressNode;
import zhy2002.examples.lodgement.gen.rule.FromPreviousNoEarlierThanToPreviousRule;

public class FromPreviousNoEarlierThanToPreviousRuleImpl extends FromPreviousNoEarlierThanToPreviousRule {

    public FromPreviousNoEarlierThanToPreviousRuleImpl(MovedFromPreviousAddressNode owner) {
        super(owner);
    }

    @Override
    protected MonthYearNode<?> getOtherMonthYearNode() {
        return getOwner().getParent().getMovedToPreviousAddressNode();
    }
}
