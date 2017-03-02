package zhy2002.examples.register.gen.rule;

import zhy2002.neutron.*;
import zhy2002.examples.register.gen.node.*;


public abstract class LoadInvestmentPropertyRule extends UiNodeRule<OwnInvestmentPropertyNode> {

    public LoadInvestmentPropertyRule(OwnInvestmentPropertyNode owner) {
        super(owner);
    }

    protected OwnInvestmentPropertyNode getOwnInvestmentPropertyNode() {
        return getOwner();
    }
}
