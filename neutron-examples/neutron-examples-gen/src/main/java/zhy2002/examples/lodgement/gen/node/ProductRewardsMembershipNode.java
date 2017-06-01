package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ProductRewardsMembershipNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class ProductRewardsMembershipNode extends StringUiNode<ProductCardHolderNode> {

    @Inject
    public ProductRewardsMembershipNode(@Owner ProductCardHolderNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProductRewardsMembershipNode.class;
    }

    protected final ProductRewardsMembershipNodeComponent getComponent() {
        return component;
    }


    private ProductRewardsMembershipNodeComponent component;

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
