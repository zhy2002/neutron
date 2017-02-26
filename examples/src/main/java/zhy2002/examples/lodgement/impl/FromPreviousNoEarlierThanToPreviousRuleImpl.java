package zhy2002.examples.lodgement.impl;


import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.gen.rule.FromPreviousNoEarlierThanToPreviousRule;
import zhy2002.neutron.di.Owner;

import javax.inject.Inject;

public class FromPreviousNoEarlierThanToPreviousRuleImpl extends FromPreviousNoEarlierThanToPreviousRule {

    @Inject
    public FromPreviousNoEarlierThanToPreviousRuleImpl(@Owner MovedFromPreviousAddressNode owner) {
        super(owner);
    }

    @Override
    protected MonthYearNode<?> getOtherMonthYearNode() {
        return getOwner().getParent().getMovedToPreviousAddressNode();
    }
}
