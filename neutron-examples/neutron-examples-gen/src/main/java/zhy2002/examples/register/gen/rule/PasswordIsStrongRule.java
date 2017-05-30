package zhy2002.examples.register.gen.rule;
/* template name: rule.ftl */
import zhy2002.neutron.*;
import zhy2002.examples.register.gen.node.*;


public abstract class PasswordIsStrongRule extends ValidationRule<PasswordNode> {

    public PasswordIsStrongRule(PasswordNode owner) {
        super(owner);
    }

    protected PasswordNode getPasswordNode() {
        return getOwner();
    }
}
