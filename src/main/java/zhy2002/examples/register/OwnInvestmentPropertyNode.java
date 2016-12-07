package zhy2002.examples.register;

import zhy2002.neutron.BooleanUiNode;
import zhy2002.neutron.UiNodeRule;

import javax.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.List;

public class OwnInvestmentPropertyNode extends BooleanUiNode<RegisterNode>{

    protected OwnInvestmentPropertyNode(@NotNull RegisterNode parent, @NotNull String name) {
        super(parent, name);
    }

    @Override
    protected List<UiNodeRule<?, ?>> createOwnRules() {
        return Arrays.asList(getContext().createUiNodeRule(LoadInvestmentPropertyRule.class, this));
    }
}
