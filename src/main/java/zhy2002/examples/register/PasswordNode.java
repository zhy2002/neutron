package zhy2002.examples.register;

import jsinterop.annotations.JsMethod;
import zhy2002.examples.register.rule.PasswordIsStrongRule;
import zhy2002.neutron.PredefinedEventSubjects;
import zhy2002.neutron.node.StringUiNode;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.util.EnhancedLinkedList;

/**
 * Used for single node test.
 */
public class PasswordNode extends StringUiNode<RegisterNode> {

    PasswordNode(RegisterNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected EnhancedLinkedList<UiNodeRule<?>> createOwnRules() {
        return super.createOwnRules().and(getContext().createUiNodeRule(PasswordIsStrongRule.class, this));
    }

    @JsMethod
    public void setMessage(String message) {
        setStateValue(PredefinedEventSubjects.MESSAGE, String.class, message);
    }

    @JsMethod
    public String getMessage() {
        return getStateValue(PredefinedEventSubjects.MESSAGE);
    }
}
