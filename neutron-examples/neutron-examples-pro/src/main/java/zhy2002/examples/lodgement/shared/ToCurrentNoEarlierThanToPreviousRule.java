package zhy2002.examples.lodgement.shared;

import zhy2002.examples.lodgement.gen.node.MonthYearNode;
import zhy2002.examples.lodgement.gen.node.MovedToCurrentAddressNode;
import zhy2002.neutron.MonthYearNoEarlierThanRule;
import zhy2002.neutron.di.Owner;

import javax.inject.Inject;


public class ToCurrentNoEarlierThanToPreviousRule extends MonthYearNoEarlierThanRule<MovedToCurrentAddressNode> {

    @Inject
    public ToCurrentNoEarlierThanToPreviousRule(@Owner MovedToCurrentAddressNode owner) {
        super(owner);
    }

    @Override
    protected MonthYearNode<?> getOtherMonthYearNode() {
        return getOwner().getParent().getMovedToPreviousAddressNode();
    }
}
