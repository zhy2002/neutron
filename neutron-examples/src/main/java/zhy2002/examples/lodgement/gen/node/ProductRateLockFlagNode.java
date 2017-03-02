package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class ProductRateLockFlagNode extends BooleanUiNode<ProductFeaturesNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ProductRateLockFlagNode.class;
    }

    private ProductRateLockFlagNodeComponent component;

    @Inject
    void createComponent(ProductRateLockFlagNodeComponent.Builder builder) {
        this.component = builder.setProductRateLockFlagNodeModule(new ProductRateLockFlagNodeModule(this)).build();
    }

    @Override
    protected ProductRateLockFlagNodeRuleProvider getRuleProvider() {
        return component.getProductRateLockFlagNodeRuleProvider();
    }

    public ProductRateLockFlagNode(@NotNull ProductFeaturesNode parent, String name) {
        super(parent, name);
    }

}
