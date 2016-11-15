package zhy2002.examples.register;

import zhy2002.examples.register.rules.UsernameInvalidCharRule;
import zhy2002.examples.register.rules.UsernameLengthRule;
import zhy2002.neutron.node.NotImplementedException;
import zhy2002.neutron.node.atomic.StringUiNode;

/**
 * Created by ZHY on 12/11/2016.
 */
public class UsernameNode extends StringUiNode<RegisterNode> {

    protected UsernameNode(RegisterNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void doLoad() {
        UsernameLengthRule usernameLengthRule = new UsernameLengthRule(this);//todo use factory
        usernameLengthRule.load();

        UsernameInvalidCharRule usernameInvalidCharRule = new UsernameInvalidCharRule(this);
        usernameInvalidCharRule.load();
    }

    @Override
    protected void doUnload() {
        throw new NotImplementedException();
    }
}
