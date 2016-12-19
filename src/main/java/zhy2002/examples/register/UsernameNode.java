package zhy2002.examples.register;

import jsinterop.annotations.JsType;
import zhy2002.examples.register.rule.DefaultEmailByUsernameRule;
import zhy2002.neutron.PredefinedEventSubjects;
import zhy2002.neutron.StringUiNode;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.util.EnhancedLinkedList;

//import zhy2002.examples.register.rule.UsernameIsRequiredRule;
//import zhy2002.examples.register.rule.UsernameLengthRule;

@JsType
public class UsernameNode extends StringUiNode<RegisterNode> {

    public static final String LENGTH_MESSAGE = "Username must have at least four characters.";
    public static final String INVALID_CHARS_MESSAGE = "Username cannot contain '#'.";

    protected UsernameNode(RegisterNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setStateValue(PredefinedEventSubjects.LENGTH_MESSAGE, String.class, LENGTH_MESSAGE);
        setMinLength(4);

        setStateValue(PredefinedEventSubjects.INVALID_CHARS_MESSAGE, String.class, INVALID_CHARS_MESSAGE);
        setInvalidChars("#");

    }

    @Override
    protected EnhancedLinkedList<UiNodeRule<?>> createOwnRules() {
        return super.createOwnRules()
//                .and(getContext().createUiNodeRule(UsernameIsRequiredRule.class, this))
                .and(getContext().createUiNodeRule(DefaultEmailByUsernameRule.class, this));
        //.and(getContext().createUiNodeRule(TestRule.class, this));
    }

}
