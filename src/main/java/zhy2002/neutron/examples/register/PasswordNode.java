package zhy2002.neutron.examples.register;

import zhy2002.neutron.atomic.StringUiNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Used for single node test.
 */
public class PasswordNode extends StringUiNode<RootNode> {

    private List<UiNodeRule> selfRules = new ArrayList<>();

    protected PasswordNode(RootNode parent, String name) {
        super(parent, name);
    }

    public void addRule(PasswordMinLengthRule passwordMinLengthRule) {
        selfRules.add(passwordMinLengthRule);
    }
}
