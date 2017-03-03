package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.node.*;


public abstract class TrustTypeChangedRule extends UiNodeRule<TrustTypeNode> {

    public TrustTypeChangedRule(TrustTypeNode owner) {
        super(owner);
    }

    protected TrustTypeNode getTrustTypeNode() {
        return getOwner();
    }
}
