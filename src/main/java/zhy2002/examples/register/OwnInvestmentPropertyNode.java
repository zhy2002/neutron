package zhy2002.examples.register;

import zhy2002.neutron.BooleanUiNode;

import javax.validation.constraints.NotNull;

public class OwnInvestmentPropertyNode extends BooleanUiNode<RegisterNode>{

    protected OwnInvestmentPropertyNode(@NotNull RegisterNode parent, @NotNull String name) {
        super(parent, name);
    }
}
