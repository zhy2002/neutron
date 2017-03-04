package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class ProductCreditCardFlagNode extends BooleanUiNode<ProductFeaturesNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ProductCreditCardFlagNode.class;
    }

    private ProductCreditCardFlagNodeComponent component;

    @Inject
    void createComponent(ProductCreditCardFlagNodeComponent.Builder builder) {
        this.component = builder.setProductCreditCardFlagNodeModule(new ProductCreditCardFlagNodeModule(this)).build();
    }

    @Override
    protected ProductCreditCardFlagNodeRuleProvider getRuleProvider() {
        return component.getProductCreditCardFlagNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public ProductCreditCardFlagNode(@NotNull ProductFeaturesNode parent, String name) {
        super(parent, name);
    }

}
