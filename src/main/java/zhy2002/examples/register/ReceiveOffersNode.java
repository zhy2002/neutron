package zhy2002.examples.register;

import zhy2002.neutron.BooleanUiNode;
import zhy2002.neutron.ParentUiNode;

import javax.validation.constraints.NotNull;

public class ReceiveOffersNode extends BooleanUiNode<RegisterNode> {

    protected ReceiveOffersNode(@NotNull RegisterNode parent, @NotNull String name) {
        super(parent, name);
    }
}
