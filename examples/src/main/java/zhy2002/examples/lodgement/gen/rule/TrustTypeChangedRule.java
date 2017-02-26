package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.node.*;


public abstract class TrustTypeChangedRule extends UiNodeRule<PersonTrustTypeNode> {

    public TrustTypeChangedRule(PersonTrustTypeNode owner) {
        super(owner);
    }

    protected PersonTrustTypeNode getPersonTrustTypeNode() {
        return getOwner();
    }
}