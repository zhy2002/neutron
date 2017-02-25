package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.*;


public abstract class FromPreviousNoEarlierThanToPreviousRule extends MonthYearNoEarlierThanRule<MovedFromPreviousAddressNode> {

    public FromPreviousNoEarlierThanToPreviousRule(MovedFromPreviousAddressNode owner) {
        super(owner);
    }

    protected MovedFromPreviousAddressNode getMovedFromPreviousAddressNode() {
        return getOwner();
    }
}
