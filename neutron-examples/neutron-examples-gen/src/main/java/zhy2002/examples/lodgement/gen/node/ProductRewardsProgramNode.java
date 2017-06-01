package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ProductRewardsProgramNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class ProductRewardsProgramNode extends StringUiNode<ProductCardHolderNode> {

    @Inject
    public ProductRewardsProgramNode(@Owner ProductCardHolderNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProductRewardsProgramNode.class;
    }

    protected final ProductRewardsProgramNodeComponent getComponent() {
        return component;
    }


    private ProductRewardsProgramNodeComponent component;

    @Inject
    void createComponent(ProductRewardsProgramNodeComponent.Builder builder) {
        this.component = builder.setProductRewardsProgramNodeModule(new ProductRewardsProgramNodeModule(this)).build();
    }

    private RuleProvider<ProductRewardsProgramNode> getRuleProvider() {
        return component.getProductRewardsProgramNodeRuleProvider();
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

    private RuleProvider<ProductRewardsProgramNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
