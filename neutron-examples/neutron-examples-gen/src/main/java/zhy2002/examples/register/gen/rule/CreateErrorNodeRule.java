package zhy2002.examples.register.gen.rule;

import zhy2002.neutron.*;
import zhy2002.examples.register.gen.node.*;


public abstract class CreateErrorNodeRule extends BaseCreateErrorNodeRule<RegisterNode> {

    public CreateErrorNodeRule(RegisterNode owner) {
        super(owner);
    }

    protected RegisterNode getRegisterNode() {
        return getOwner();
    }
}
