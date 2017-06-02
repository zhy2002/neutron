package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ProductCostRecuctionFlagNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ProductCostRecuctionFlagNode extends BooleanUiNode<ProductDescriptionNode> {

    @Inject
    protected ProductCostRecuctionFlagNode(@Owner ProductDescriptionNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProductCostRecuctionFlagNode.class;
    }

    protected final ProductCostRecuctionFlagNodeComponent getComponent() {
        return component;
    }


    private ProductCostRecuctionFlagNodeComponent component;

    @Inject
    void createComponent(ProductCostRecuctionFlagNodeComponent.Builder builder) {
        this.component = builder.setProductCostRecuctionFlagNodeModule(new ProductCostRecuctionFlagNodeModule(this)).build();
    }

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

}
