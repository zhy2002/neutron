package zhy2002.examples.register.gen.rule;
/* template name: rule.ftl */
import zhy2002.neutron.*;
import zhy2002.examples.register.gen.node.*;


public abstract class DefaultEmailByUsernameRule extends UiNodeRule<UsernameNode> {

    public DefaultEmailByUsernameRule(UsernameNode owner) {
        super(owner);
    }

    protected UsernameNode getUsernameNode() {
        return getOwner();
    }
}
