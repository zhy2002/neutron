package zhy2002.examples.register;

import zhy2002.examples.register.rule.EmailIsRequiredWhenReceiveOffersRule;
import zhy2002.neutron.BooleanUiNode;
import zhy2002.neutron.UiNodeRule;

import javax.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.List;

public class ReceiveOffersNode extends BooleanUiNode<RegisterNode> {

    protected ReceiveOffersNode(@NotNull RegisterNode parent, @NotNull String name) {
        super(parent, name);
    }

    @Override
    protected List<UiNodeRule<?, ?>> createOwnRules() {
        return Arrays.asList(
                getContext().createUiNodeRule(EmailIsRequiredWhenReceiveOffersRule.class, this)
        );
    }
}
