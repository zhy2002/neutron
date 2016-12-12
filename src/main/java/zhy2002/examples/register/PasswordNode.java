package zhy2002.examples.register;

import jsinterop.annotations.JsMethod;
import zhy2002.examples.register.rule.PasswordIsStrongRule;
import zhy2002.neutron.PredefinedUiNodeStateKeys;
import zhy2002.neutron.StringUiNode;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.util.EnhancedLinkedList;

import java.util.Arrays;
import java.util.List;

/**
 * Used for single node test.
 */
public class PasswordNode extends StringUiNode<RegisterNode> {

    protected PasswordNode(RegisterNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected EnhancedLinkedList<UiNodeRule<?, ?>> createOwnRules() {
        return super.createOwnRules().and(getContext().createUiNodeRule(PasswordIsStrongRule.class, this));
    }

    @JsMethod
    public void setMessage(String message) {
        setStateValue(PredefinedUiNodeStateKeys.MESSAGE, String.class, message);
    }

    @JsMethod
    public String getMessage() {
        return getStateValue(PredefinedUiNodeStateKeys.MESSAGE);
    }
}
