package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.node.*;


public abstract class OwnedOutrightFlagChangeRule extends UiNodeRule<OwnedOutrightFlagNode> {

    public OwnedOutrightFlagChangeRule(OwnedOutrightFlagNode owner) {
        super(owner);
    }

    protected OwnedOutrightFlagNode getOwnedOutrightFlagNode() {
        return getOwner();
    }
}
