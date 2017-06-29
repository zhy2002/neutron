package zhy2002.examples.lodgement.shared;


import zhy2002.examples.lodgement.gen.node.MonthYearNode;
import zhy2002.examples.lodgement.gen.node.MovedFromPreviousAddressNode;
import zhy2002.examples.lodgement.rule.MonthYearNoEarlierThanRule;
import zhy2002.neutron.di.Owner;

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
