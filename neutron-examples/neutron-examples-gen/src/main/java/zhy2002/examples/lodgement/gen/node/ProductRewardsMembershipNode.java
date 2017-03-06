package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


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

    private ProductRewardsMembershipNodeRuleProvider getRuleProvider() {
        return component.getProductRewardsMembershipNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public ProductRewardsMembershipNode(@NotNull ProductCardHolderNode parent, String name) {
        super(parent, name);
    }

}
