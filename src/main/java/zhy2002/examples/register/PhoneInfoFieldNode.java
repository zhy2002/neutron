package zhy2002.examples.register;

import zhy2002.examples.register.rule.PhoneFieldIsRequiredRule;
import zhy2002.neutron.StringUiNode;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.util.EnhancedLinkedList;

public abstract class PhoneInfoFieldNode extends StringUiNode<PhoneInfoNode> {

    protected PhoneInfoFieldNode(PhoneInfoNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected EnhancedLinkedList<UiNodeRule<?, ?>> createOwnRules() {
        return super.createOwnRules().and(getContext().createUiNodeRule(PhoneFieldIsRequiredRule.class, this));
    }
}
