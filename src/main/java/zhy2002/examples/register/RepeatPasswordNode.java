package zhy2002.examples.register;

import zhy2002.examples.register.rule.RepeatPasswordRule;
import zhy2002.neutron.node.StringUiNode;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.util.EnhancedLinkedList;

public class RepeatPasswordNode extends StringUiNode<RegisterNode> {

    RepeatPasswordNode(RegisterNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected EnhancedLinkedList<UiNodeRule<?>> createOwnRules() {
        return super.createOwnRules()
                .and(getContext().createUiNodeRule(RepeatPasswordRule.class, this));
    }
}
