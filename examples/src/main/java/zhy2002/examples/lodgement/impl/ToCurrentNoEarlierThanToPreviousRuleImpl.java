package zhy2002.examples.lodgement.impl;

import zhy2002.examples.lodgement.gen.MonthYearNode;
import zhy2002.examples.lodgement.gen.MovedToCurrentAddressNode;
import zhy2002.examples.lodgement.gen.rule.ToCurrentNoEarlierThanToPreviousRule;
import zhy2002.neutron.di.Owner;

import javax.inject.Inject;


public class ToCurrentNoEarlierThanToPreviousRuleImpl extends ToCurrentNoEarlierThanToPreviousRule {

    @Inject
    public ToCurrentNoEarlierThanToPreviousRuleImpl(@Owner MovedToCurrentAddressNode owner) {
        super(owner);
    }

    @Override
    protected MonthYearNode<?> getOtherMonthYearNode() {
        return getOwner().getParent().getMovedToPreviousAddressNode();
    }
}
