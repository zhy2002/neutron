package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class ProductTotalLvrLmiNode extends BasePercentageNode<ProductsNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ProductTotalLvrLmiNode.class;
    }

    private ProductTotalLvrLmiNodeComponent component;

    @Inject
    void createComponent(ProductTotalLvrLmiNodeComponent.Builder builder) {
        this.component = builder.setProductTotalLvrLmiNodeModule(new ProductTotalLvrLmiNodeModule(this)).build();
    }

    @Override
    protected ProductTotalLvrLmiNodeRuleProvider getRuleProvider() {
        return component.getProductTotalLvrLmiNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public ProductTotalLvrLmiNode(@NotNull ProductsNode parent, String name) {
        super(parent, name);
    }

}
