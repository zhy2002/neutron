package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class ProductCostRecuctionFlagNode extends BooleanUiNode<ProductDescriptionNode> {
    private ProductCostRecuctionFlagNodeComponent component;

    public ProductCostRecuctionFlagNode(@NotNull ProductDescriptionNode parent, String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return ProductCostRecuctionFlagNode.class;
    }

    @Inject
    void createComponent(ProductCostRecuctionFlagNodeComponent.Builder builder) {
        this.component = builder.setProductCostRecuctionFlagNodeModule(new ProductCostRecuctionFlagNodeModule(this)).build();
    }

    private RuleProvider<ProductCostRecuctionFlagNode> getRuleProvider() {
        return component.getProductCostRecuctionFlagNodeRuleProvider();
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

    private RuleProvider<ProductCostRecuctionFlagNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
