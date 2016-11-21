package zhy2002.examples.register;

import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsType;
import zhy2002.neutron.NotImplementedException;
import zhy2002.neutron.StringUiNode;
import zhy2002.neutron.rule.UiNodeRule;
import zhy2002.neutron.rule.ValidationRule;

import java.util.ArrayList;
import java.util.List;

/**
 * Used for single node test.
 */
public class PasswordNode extends StringUiNode<RegisterNode> {

    @JsIgnore
    private List<UiNodeRule> selfRules = new ArrayList<>();

    protected PasswordNode(RegisterNode parent, String name) {
        super(parent, name);
    }

    public void addRule(ValidationRule passwordMinLengthRule) {
        selfRules.add(passwordMinLengthRule);
    }

    @Override
    protected void doLoad() {

    }

    @Override
    protected void doUnload() {
        throw new NotImplementedException();
    }
}
