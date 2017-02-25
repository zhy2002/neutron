package zhy2002.examples.register.gen.rule;

import zhy2002.neutron.*;
import zhy2002.examples.register.gen.*;


public abstract class RepeatPasswordRule extends ValidationRule<RepeatPasswordNode> {

    public RepeatPasswordRule(RepeatPasswordNode owner) {
        super(owner);
    }

    protected RepeatPasswordNode getRepeatPasswordNode() {
        return getOwner();
    }
}
