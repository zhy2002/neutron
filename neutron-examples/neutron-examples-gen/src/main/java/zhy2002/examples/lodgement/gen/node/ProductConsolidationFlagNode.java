package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ProductConsolidationFlagNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ProductConsolidationFlagNode extends BooleanUiNode<ProductDescriptionNode> {

    @Inject
    public ProductConsolidationFlagNode(@Owner ProductDescriptionNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProductConsolidationFlagNode.class;
    }

    protected final ProductConsolidationFlagNodeComponent getComponent() {
        return component;
    }


    private ProductConsolidationFlagNodeComponent component;

    @Inject
    void createComponent(ProductConsolidationFlagNodeComponent.Builder builder) {
        this.component = builder.setProductConsolidationFlagNodeModule(new ProductConsolidationFlagNodeModule(this)).build();
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
