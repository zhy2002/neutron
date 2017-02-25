package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;

public class BeingPurchasedFlagNode extends BooleanUiNode<UsageNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return BeingPurchasedFlagNode.class;
    }

    private BeingPurchasedFlagNodeComponent component;

    @Inject
    void createComponent(BeingPurchasedFlagNodeComponent.Builder builder) {
        this.component = builder.setBeingPurchasedFlagNodeModule(new BeingPurchasedFlagNodeModule(this)).build();
    }

    @Override
    protected BeingPurchasedFlagNodeRuleProvider getRuleProvider() {
        return component.getBeingPurchasedFlagNodeRuleProvider();
    }

    public BeingPurchasedFlagNode(@NotNull UsageNode parent, String name) {
        super(parent, name);
    }

}
