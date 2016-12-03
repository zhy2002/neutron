package zhy2002.examples.register;

import jsinterop.annotations.JsType;
import zhy2002.examples.register.rule.*;
import zhy2002.neutron.NotImplementedException;
import zhy2002.neutron.StringUiNode;
import zhy2002.neutron.UiNodeRule;

import java.util.Arrays;
import java.util.List;

@JsType
public class UsernameNode extends StringUiNode<RegisterNode> {

    protected UsernameNode(RegisterNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected List<UiNodeRule<?, ?>> createOwnRules() {
        return Arrays.asList(
                getContext().createUiNodeRule(UsernameLengthRule.class, this),
                getContext().createUiNodeRule(UsernameInvalidCharRule.class, this),
                getContext().createUiNodeRule(UsernameIsRequiredRule.class, this),
                getContext().createUiNodeRule(DefaultEmailByUsernameRule.class, this)
        );
    }
}
