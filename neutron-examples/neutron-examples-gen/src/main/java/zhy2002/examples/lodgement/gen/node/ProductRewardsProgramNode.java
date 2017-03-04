package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class ProductRewardsProgramNode extends StringUiNode<ProductCardHolderNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ProductRewardsProgramNode.class;
    }

    private ProductRewardsProgramNodeComponent component;

    @Inject
    void createComponent(ProductRewardsProgramNodeComponent.Builder builder) {
        this.component = builder.setProductRewardsProgramNodeModule(new ProductRewardsProgramNodeModule(this)).build();
    }

    @Override
    protected ProductRewardsProgramNodeRuleProvider getRuleProvider() {
        return component.getProductRewardsProgramNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public ProductRewardsProgramNode(@NotNull ProductCardHolderNode parent, String name) {
        super(parent, name);
    }

}
