package zhy2002.examples.register;

import zhy2002.examples.register.rules.PasswordMinLengthRule;
import zhy2002.neutron.node.NotImplementedException;
import zhy2002.neutron.node.atomic.StringUiNode;
import zhy2002.neutron.node.UiNodeRule;

import java.util.ArrayList;
import java.util.List;

/**
 * Used for single node test.
 */
public class PasswordNode extends StringUiNode<RegisterNode> {

    private List<UiNodeRule> selfRules = new ArrayList<>();

    protected PasswordNode(RegisterNode parent, String name) {
        super(parent, name);
    }

    public void addRule(PasswordMinLengthRule passwordMinLengthRule) {
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
