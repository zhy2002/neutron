package zhy2002.examples.register;

import zhy2002.examples.register.rule.LoadInvestmentPropertyRule;
import zhy2002.neutron.BooleanUiNode;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.util.EnhancedLinkedList;

import javax.validation.constraints.NotNull;

public class OwnInvestmentPropertyNode extends BooleanUiNode<RegisterNode>{

    protected OwnInvestmentPropertyNode(@NotNull RegisterNode parent, @NotNull String name) {
        super(parent, name);
    }

    @Override
    protected EnhancedLinkedList<UiNodeRule<?>> createOwnRules() {
        return super.createOwnRules().and(getContext().createUiNodeRule(LoadInvestmentPropertyRule.class, this));
    }
}
