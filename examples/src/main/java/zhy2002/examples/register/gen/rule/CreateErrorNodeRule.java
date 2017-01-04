package zhy2002.examples.register.gen.rule;

import zhy2002.neutron.*;
import java.util.*;
import zhy2002.examples.register.gen.*;


public abstract class CreateErrorNodeRule extends BaseCreateErrorNodeRule<RegisterNode> {

    public CreateErrorNodeRule(RegisterNode owner) {
        super(owner);
    }

    protected RegisterNode getRegisterNode() {
        return getOwner();
    }
}