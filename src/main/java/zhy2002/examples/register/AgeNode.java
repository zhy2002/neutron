package zhy2002.examples.register;

import zhy2002.examples.register.rule.AgeValidRule;
import zhy2002.neutron.BigDecimalUiNode;
import zhy2002.neutron.UiNodeRule;

import javax.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.List;

public class AgeNode extends BigDecimalUiNode<RegisterNode> {

    protected AgeNode(@NotNull RegisterNode parent, @NotNull String name) {
        super(parent, name);
    }

    @Override
    protected List<UiNodeRule<?, ?>> createOwnRules() {
        return Arrays.asList(getContext().createUiNodeRule(AgeValidRule.class, this));
    }
}
