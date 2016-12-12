package zhy2002.examples.register;

import zhy2002.examples.register.rule.RepeatPasswordRule;
import zhy2002.neutron.StringUiNode;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.util.EnhancedLinkedList;

import java.util.Arrays;
import java.util.List;

public class RepeatPasswordNode extends StringUiNode<RegisterNode> {

    protected RepeatPasswordNode(RegisterNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected EnhancedLinkedList<UiNodeRule<?, ?>> createOwnRules() {
        return super.createOwnRules().and(getContext().createUiNodeRule(RepeatPasswordRule.class, this));
    }
}
