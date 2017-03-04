package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class ProductCreditCardLimitNode extends BaseCurrencyNode<ProductFeaturesNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ProductCreditCardLimitNode.class;
    }

    private ProductCreditCardLimitNodeComponent component;

    @Inject
    void createComponent(ProductCreditCardLimitNodeComponent.Builder builder) {
        this.component = builder.setProductCreditCardLimitNodeModule(new ProductCreditCardLimitNodeModule(this)).build();
    }

    @Override
    protected ProductCreditCardLimitNodeRuleProvider getRuleProvider() {
        return component.getProductCreditCardLimitNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public ProductCreditCardLimitNode(@NotNull ProductFeaturesNode parent, String name) {
        super(parent, name);
    }

}
