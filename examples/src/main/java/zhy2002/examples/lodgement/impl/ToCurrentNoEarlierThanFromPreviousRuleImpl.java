package zhy2002.examples.lodgement.impl;

import zhy2002.examples.lodgement.gen.MonthYearNode;
import zhy2002.examples.lodgement.gen.MovedToCurrentAddressNode;
import zhy2002.examples.lodgement.gen.rule.ToCurrentNoEarlierThanFromPreviousRule;
import zhy2002.neutron.di.Owner;

import javax.inject.Inject;

public class ToCurrentNoEarlierThanFromPreviousRuleImpl extends ToCurrentNoEarlierThanFromPreviousRule {

    @Inject
    public ToCurrentNoEarlierThanFromPreviousRuleImpl(@Owner MovedToCurrentAddressNode owner) {
        super(owner);
    }

    @Override
    protected MonthYearNode<?> getOtherMonthYearNode() {
        return getOwner().getParent().getMovedFromPreviousAddressNode();
    }
}
