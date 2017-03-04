package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class ProductCreditCardTypeNode extends StringUiNode<ProductFeaturesNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ProductCreditCardTypeNode.class;
    }

    private ProductCreditCardTypeNodeComponent component;

    @Inject
    void createComponent(ProductCreditCardTypeNodeComponent.Builder builder) {
        this.component = builder.setProductCreditCardTypeNodeModule(new ProductCreditCardTypeNodeModule(this)).build();
    }

    @Override
    protected ProductCreditCardTypeNodeRuleProvider getRuleProvider() {
        return component.getProductCreditCardTypeNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public ProductCreditCardTypeNode(@NotNull ProductFeaturesNode parent, String name) {
        super(parent, name);
    }

}
