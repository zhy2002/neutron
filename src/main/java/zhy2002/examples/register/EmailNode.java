package zhy2002.examples.register;

import jsinterop.annotations.JsType;
import zhy2002.examples.register.rule.EmailChangeReasonRule;
import zhy2002.examples.register.rule.ValidateEmailIsRequiredRule;
import zhy2002.neutron.StringUiNode;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.util.EnhancedLinkedList;

import java.util.Arrays;
import java.util.List;

@JsType
public class EmailNode extends StringUiNode<RegisterNode> {

    public static final String STATE_KEY_TRIGGERED_BY = "triggeredBy";

    protected EmailNode(RegisterNode parent, String name) {
        super(parent, name);

        setPattern("\\w+@\\w+\\.[\\w.]+");
        setValue("");
    }

    @Override
    protected EnhancedLinkedList<UiNodeRule<?, ?>> createOwnRules() {
        return super.createOwnRules()
                .and(getContext().createUiNodeRule(EmailChangeReasonRule.class, this))
                .and(getContext().createUiNodeRule(ValidateEmailIsRequiredRule.class, this));
    }

    public void setTriggeredBy(String triggeredBy) {
        this.setStateValue(STATE_KEY_TRIGGERED_BY, String.class, triggeredBy);
    }

    public String getTriggeredBy() {
        return getStateValue(STATE_KEY_TRIGGERED_BY);
    }

}
