package zhy2002.examples.register;

import jsinterop.annotations.JsType;
import zhy2002.examples.register.rule.DefaultEmailByUsernameRule;
import zhy2002.examples.register.rule.UsernameInvalidCharRule;
import zhy2002.examples.register.rule.UsernameIsRequiredRule;
import zhy2002.examples.register.rule.UsernameLengthRule;
import zhy2002.neutron.StringUiNode;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.util.EnhancedLinkedList;

@JsType
public class UsernameNode extends StringUiNode<RegisterNode> {

    protected UsernameNode(RegisterNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected EnhancedLinkedList<UiNodeRule<?, ?>> createOwnRules() {
        return super.createOwnRules()
                .and(getContext().createUiNodeRule(UsernameLengthRule.class, this))
                .and(getContext().createUiNodeRule(UsernameInvalidCharRule.class, this))
                .and(getContext().createUiNodeRule(UsernameIsRequiredRule.class, this))
                .and(getContext().createUiNodeRule(DefaultEmailByUsernameRule.class, this));
    }
}
