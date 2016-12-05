package zhy2002.examples.register;

import zhy2002.neutron.BigDecimalUiNode;

import javax.validation.constraints.NotNull;

public class AgeNode extends BigDecimalUiNode<RegisterNode> {

    protected AgeNode(@NotNull RegisterNode parent, @NotNull String name) {
        super(parent, name);
    }
}
