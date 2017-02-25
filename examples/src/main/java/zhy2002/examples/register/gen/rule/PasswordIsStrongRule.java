package zhy2002.examples.register.gen.rule;

import zhy2002.neutron.*;
import zhy2002.examples.register.gen.*;


public abstract class PasswordIsStrongRule extends ValidationRule<PasswordNode> {

    public PasswordIsStrongRule(PasswordNode owner) {
        super(owner);
    }

    protected PasswordNode getPasswordNode() {
        return getOwner();
    }
}
