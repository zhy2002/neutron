package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ProductSpecificFeaturesFlagNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ProductSpecificFeaturesFlagNode extends BooleanUiNode<ProductDescriptionNode> {

    @Inject
    protected ProductSpecificFeaturesFlagNode(@Owner ProductDescriptionNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProductSpecificFeaturesFlagNode.class;
    }

    protected final ProductSpecificFeaturesFlagNodeComponent getComponent() {
        return component;
    }


    private ProductSpecificFeaturesFlagNodeComponent component;

    @Inject
    void createComponent(ProductSpecificFeaturesFlagNodeComponent.Builder builder) {
        this.component = builder.setProductSpecificFeaturesFlagNodeModule(new ProductSpecificFeaturesFlagNodeModule(this)).build();
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
