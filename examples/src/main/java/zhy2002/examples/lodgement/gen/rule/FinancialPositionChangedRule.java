package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.*;


public abstract class FinancialPositionChangedRule extends UiNodeRule<FinancialPositionNode> {

    public FinancialPositionChangedRule(FinancialPositionNode owner) {
        super(owner);
    }

    protected FinancialPositionNode getFinancialPositionNode() {
        return getOwner();
    }
}
