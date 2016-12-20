package zhy2002.examples.register;

import zhy2002.examples.register.rule.EmailIsRequiredWhenReceiveOffersRule;
import zhy2002.neutron.node.BooleanUiNode;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.util.EnhancedLinkedList;

import javax.validation.constraints.NotNull;

public class ReceiveOffersNode extends BooleanUiNode<RegisterNode> {

    ReceiveOffersNode(@NotNull RegisterNode parent, @NotNull String name) {
        super(parent, name);
    }

    @Override
    protected EnhancedLinkedList<UiNodeRule<?>> createOwnRules() {
        return super.createOwnRules().and(getContext().createUiNodeRule(EmailIsRequiredWhenReceiveOffersRule.class, this));
    }
}
