package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

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


    public ProductRewardsProgramNode(@NotNull ProductCardHolderNode parent, String name) {
        super(parent, name);
    }

}
