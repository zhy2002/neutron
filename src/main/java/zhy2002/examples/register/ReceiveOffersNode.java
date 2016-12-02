package zhy2002.examples.register;

import zhy2002.examples.register.rule.EmailIsRequiredWhenReceiveOffersRule;
import zhy2002.neutron.BooleanUiNode;

import javax.validation.constraints.NotNull;

public class ReceiveOffersNode extends BooleanUiNode<RegisterNode> {

    protected ReceiveOffersNode(@NotNull RegisterNode parent, @NotNull String name) {
        super(parent, name);
    }

    @Override
    protected void doLoad() {
        super.doLoad();

        getContext().getInstance(EmailIsRequiredWhenReceiveOffersRule.Factory.class).create(this).addToOwner();
    }
}
