package zhy2002.examples.register;

import zhy2002.examples.register.rule.RepeatPasswordRule;
import zhy2002.neutron.StringUiNode;
import zhy2002.neutron.UiNodeRule;

import java.util.Arrays;
import java.util.List;

public class RepeatPasswordNode extends StringUiNode<RegisterNode> {

    protected RepeatPasswordNode(RegisterNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected List<UiNodeRule<?, ?>> createOwnRules() {
        return Arrays.asList(
                getContext().createUiNodeRule(RepeatPasswordRule.class, this)
        );
    }
}
