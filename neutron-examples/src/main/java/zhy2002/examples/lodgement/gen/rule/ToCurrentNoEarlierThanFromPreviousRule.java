package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.node.*;


public abstract class ToCurrentNoEarlierThanFromPreviousRule extends MonthYearNoEarlierThanRule<MovedToCurrentAddressNode> {

    public ToCurrentNoEarlierThanFromPreviousRule(MovedToCurrentAddressNode owner) {
        super(owner);
    }

    protected MovedToCurrentAddressNode getMovedToCurrentAddressNode() {
        return getOwner();
    }
}