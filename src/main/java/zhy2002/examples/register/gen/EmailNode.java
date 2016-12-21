package zhy2002.examples.register.gen;

import jsinterop.annotations.JsType;
import zhy2002.examples.register.rule.EmailChangeReasonRule;
//import zhy2002.examples.register.rule.ValidateEmailIsRequiredRule;
import zhy2002.neutron.node.StringUiNode;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.util.EnhancedLinkedList;

@JsType
public class EmailNode extends StringUiNode<RegisterNode> {

    public static final String STATE_KEY_TRIGGERED_BY = "triggeredBy";

    EmailNode(RegisterNode parent, String name) {
        super(parent, name);

        setPattern("\\w+@\\w+\\.[\\w.]+");
        setPatternMessage("Email format is invalid.");
        setRequiredMessage("Email is required.");
    }

    public void setTriggeredBy(String triggeredBy) {
        this.setStateValue(STATE_KEY_TRIGGERED_BY, String.class, triggeredBy);
    }

    public String getTriggeredBy() {
        return getStateValue(STATE_KEY_TRIGGERED_BY);
    }

    @Override
    protected EnhancedLinkedList<UiNodeRule<?>> createOwnRules() {
        return super.createOwnRules()
                .and(getContext().createUiNodeRule(EmailChangeReasonRule.class, this));
    }



}
