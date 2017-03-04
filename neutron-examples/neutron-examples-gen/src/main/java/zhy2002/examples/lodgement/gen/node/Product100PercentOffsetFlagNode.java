package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class Product100PercentOffsetFlagNode extends BooleanUiNode<ProductFeaturesNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return Product100PercentOffsetFlagNode.class;
    }

    private Product100PercentOffsetFlagNodeComponent component;

    @Inject
    void createComponent(Product100PercentOffsetFlagNodeComponent.Builder builder) {
        this.component = builder.setProduct100PercentOffsetFlagNodeModule(new Product100PercentOffsetFlagNodeModule(this)).build();
    }

    @Override
    protected Product100PercentOffsetFlagNodeRuleProvider getRuleProvider() {
        return component.getProduct100PercentOffsetFlagNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public Product100PercentOffsetFlagNode(@NotNull ProductFeaturesNode parent, String name) {
        super(parent, name);
    }

}
