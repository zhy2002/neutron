package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ProductTotalLvrNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ProductTotalLvrNode extends BasePercentageNode<ProductsNode> {

    @Inject
    protected ProductTotalLvrNode(@Owner ProductsNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProductTotalLvrNode.class;
    }

    protected final ProductTotalLvrNodeComponent getComponent() {
        return component;
    }


    private ProductTotalLvrNodeComponent component;

    @Inject
    void createComponent(ProductTotalLvrNodeComponent.Builder builder) {
        this.component = builder.setProductTotalLvrNodeModule(new ProductTotalLvrNodeModule(this)).build();
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
