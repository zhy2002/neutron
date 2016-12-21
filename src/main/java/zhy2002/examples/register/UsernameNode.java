package zhy2002.examples.register;

import jsinterop.annotations.JsType;
import zhy2002.examples.register.rule.DefaultEmailByUsernameRule;
import zhy2002.neutron.PredefinedEventSubjects;
import zhy2002.neutron.node.StringUiNode;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.util.EnhancedLinkedList;

@JsType
public class UsernameNode extends StringUiNode<RegisterNode> {

    protected UsernameNode(RegisterNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setMinLength(4);
        setLengthMessage("Username must have at least four characters.");

        setInvalidChars("#");
        setInvalidCharsMessage("Username cannot contain '#'.");
    }

    @Override
    protected EnhancedLinkedList<UiNodeRule<?>> createOwnRules() {
        return super.createOwnRules()
                .and(getContext().createUiNodeRule(DefaultEmailByUsernameRule.class, this));
    }

}
