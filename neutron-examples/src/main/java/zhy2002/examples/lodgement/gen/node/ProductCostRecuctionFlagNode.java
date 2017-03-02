package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class ProductCostRecuctionFlagNode extends BooleanUiNode<ProductDescriptionNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ProductCostRecuctionFlagNode.class;
    }

    private ProductCostRecuctionFlagNodeComponent component;

    @Inject
    void createComponent(ProductCostRecuctionFlagNodeComponent.Builder builder) {
        this.component = builder.setProductCostRecuctionFlagNodeModule(new ProductCostRecuctionFlagNodeModule(this)).build();
    }

    @Override
    protected ProductCostRecuctionFlagNodeRuleProvider getRuleProvider() {
        return component.getProductCostRecuctionFlagNodeRuleProvider();
    }

    public ProductCostRecuctionFlagNode(@NotNull ProductDescriptionNode parent, String name) {
        super(parent, name);
    }

}
