package zhy2002.examples.register.gen.rule;
/* template name: rule.ftl */
import zhy2002.neutron.*;
import zhy2002.examples.register.gen.node.*;


public abstract class SetHasErrorRule extends UiNodeRule<RegisterNode> {

    public SetHasErrorRule(RegisterNode owner) {
        super(owner);
    }

    protected RegisterNode getRegisterNode() {
        return getOwner();
    }
}
