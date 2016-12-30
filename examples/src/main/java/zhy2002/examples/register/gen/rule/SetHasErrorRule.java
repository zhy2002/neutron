package zhy2002.examples.register.gen.rule;

import zhy2002.neutron.*;
import java.util.*;
import zhy2002.examples.register.gen.*;


public abstract class SetHasErrorRule extends UiNodeRule<RegisterNode> {

    public SetHasErrorRule(RegisterNode owner) {
        super(owner);
    }

    protected RegisterNode getRegisterNode() {
        return getOwner();
    }
}
