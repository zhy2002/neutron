package zhy2002.examples.register;

import jsinterop.annotations.JsType;
import zhy2002.examples.register.rule.UsernameInvalidCharRule;
import zhy2002.examples.register.rule.UsernameInvalidCharRuleFactory;
import zhy2002.examples.register.rule.UsernameLengthRule;
import zhy2002.examples.register.rule.UsernameLengthRuleFactory;
import zhy2002.neutron.NotImplementedException;
import zhy2002.neutron.StringUiNode;

@JsType
public class UsernameNode extends StringUiNode<RegisterNode> {

    protected UsernameNode(RegisterNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void doLoad() {
        UsernameLengthRule usernameLengthRule = getContext().getInstance(UsernameLengthRuleFactory.class).create(this);
        usernameLengthRule.addToOwner();

        UsernameInvalidCharRule usernameInvalidCharRule = getContext().getInstance(UsernameInvalidCharRuleFactory.class).create(this);
        usernameInvalidCharRule.addToOwner();
    }

    @Override
    protected void doUnload() {
        throw new NotImplementedException();
    }


}
