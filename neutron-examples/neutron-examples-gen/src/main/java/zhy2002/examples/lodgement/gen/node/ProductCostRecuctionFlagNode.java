package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ProductCostRecuctionFlagNode extends BooleanUiNode<ProductDescriptionNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ProductCostRecuctionFlagNode.class;
    }

    private ProductCostRecuctionFlagNodeComponent component;

    @Inject
    void createComponent(ProductCostRecuctionFlagNodeComponent.Builder builder) {
        this.component = builder.setProductCostRecuctionFlagNodeModule(new ProductCostRecuctionFlagNodeModule(this)).build();
    }

    private ProductCostRecuctionFlagNodeRuleProvider getRuleProvider() {
        return component.getProductCostRecuctionFlagNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public ProductCostRecuctionFlagNode(@NotNull ProductDescriptionNode parent, String name) {
        super(parent, name);
    }

}
