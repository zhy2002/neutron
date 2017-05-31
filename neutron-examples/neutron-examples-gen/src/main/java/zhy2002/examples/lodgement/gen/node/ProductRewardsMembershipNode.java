package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class ProductRewardsMembershipNode extends StringUiNode<ProductCardHolderNode> {
    private ProductRewardsMembershipNodeComponent component;

    public ProductRewardsMembershipNode(@NotNull ProductCardHolderNode parent, String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return ProductRewardsMembershipNode.class;
    }

    @Inject
    void createComponent(ProductRewardsMembershipNodeComponent.Builder builder) {
        this.component = builder.setProductRewardsMembershipNodeModule(new ProductRewardsMembershipNodeModule(this)).build();
    }

    private RuleProvider<ProductRewardsMembershipNode> getRuleProvider() {
        return component.getProductRewardsMembershipNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
        getInstanceRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
        getInstanceRuleProvider().createRules(createdRules);
    }

    private RuleProvider<ProductRewardsMembershipNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
