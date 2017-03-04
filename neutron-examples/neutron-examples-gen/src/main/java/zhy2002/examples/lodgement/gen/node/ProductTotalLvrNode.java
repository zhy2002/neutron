package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class ProductTotalLvrNode extends BasePercentageNode<ProductsNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ProductTotalLvrNode.class;
    }

    private ProductTotalLvrNodeComponent component;

    @Inject
    void createComponent(ProductTotalLvrNodeComponent.Builder builder) {
        this.component = builder.setProductTotalLvrNodeModule(new ProductTotalLvrNodeModule(this)).build();
    }

    @Override
    protected ProductTotalLvrNodeRuleProvider getRuleProvider() {
        return component.getProductTotalLvrNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public ProductTotalLvrNode(@NotNull ProductsNode parent, String name) {
        super(parent, name);
    }

}
