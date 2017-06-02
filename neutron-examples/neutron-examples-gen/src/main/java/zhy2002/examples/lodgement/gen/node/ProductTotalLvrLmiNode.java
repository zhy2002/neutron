package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ProductTotalLvrLmiNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ProductTotalLvrLmiNode extends BasePercentageNode<ProductsNode> {

    @Inject
    protected ProductTotalLvrLmiNode(@Owner ProductsNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProductTotalLvrLmiNode.class;
    }

    protected final ProductTotalLvrLmiNodeComponent getComponent() {
        return component;
    }


    private ProductTotalLvrLmiNodeComponent component;

    @Inject
    void createComponent(ProductTotalLvrLmiNodeComponent.Builder builder) {
        this.component = builder.setProductTotalLvrLmiNodeModule(new ProductTotalLvrLmiNodeModule(this)).build();
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
