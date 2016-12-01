package zhy2002.examples.register;

import jsinterop.annotations.JsMethod;
import zhy2002.examples.register.rule.PasswordIsStrongRule;
import zhy2002.neutron.PredefinedUiNodeStateKeys;
import zhy2002.neutron.StringUiNode;

/**
 * Used for single node test.
 */
public class PasswordNode extends StringUiNode<RegisterNode> {

    protected PasswordNode(RegisterNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void doLoad() {
        super.doLoad();

        getContext().getInstance(PasswordIsStrongRule.Factory.class).create(this).addToOwner();
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
