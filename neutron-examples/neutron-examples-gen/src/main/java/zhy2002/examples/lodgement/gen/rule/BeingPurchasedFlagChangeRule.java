package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.node.*;


public abstract class BeingPurchasedFlagChangeRule extends UiNodeRule<BeingPurchasedFlagNode> {

    public BeingPurchasedFlagChangeRule(BeingPurchasedFlagNode owner) {
        super(owner);
    }

    protected BeingPurchasedFlagNode getBeingPurchasedFlagNode() {
        return getOwner();
    }
}
