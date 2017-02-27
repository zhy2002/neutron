package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.node.*;


public abstract class OtherIncomeTypeChangeRule extends UiNodeRule<OtherIncomeTypeNode> {

    public OtherIncomeTypeChangeRule(OtherIncomeTypeNode owner) {
        super(owner);
    }

    protected OtherIncomeTypeNode getOtherIncomeTypeNode() {
        return getOwner();
    }
}
