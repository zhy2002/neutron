package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class ProductRewardsMembershipNode extends StringUiNode<ProductCardHolderNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ProductRewardsMembershipNode.class;
    }

    private ProductRewardsMembershipNodeComponent component;

    @Inject
    void createComponent(ProductRewardsMembershipNodeComponent.Builder builder) {
        this.component = builder.setProductRewardsMembershipNodeModule(new ProductRewardsMembershipNodeModule(this)).build();
    }

    @Override
    protected ProductRewardsMembershipNodeRuleProvider getRuleProvider() {
        return component.getProductRewardsMembershipNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public ProductRewardsMembershipNode(@NotNull ProductCardHolderNode parent, String name) {
        super(parent, name);
    }

}
