package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class ProductSpecificFeaturesFlagNode extends BooleanUiNode<ProductDescriptionNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ProductSpecificFeaturesFlagNode.class;
    }

    private ProductSpecificFeaturesFlagNodeComponent component;

    @Inject
    void createComponent(ProductSpecificFeaturesFlagNodeComponent.Builder builder) {
        this.component = builder.setProductSpecificFeaturesFlagNodeModule(new ProductSpecificFeaturesFlagNodeModule(this)).build();
    }

    @Override
    protected ProductSpecificFeaturesFlagNodeRuleProvider getRuleProvider() {
        return component.getProductSpecificFeaturesFlagNodeRuleProvider();
    }

    public ProductSpecificFeaturesFlagNode(@NotNull ProductDescriptionNode parent, String name) {
        super(parent, name);
    }

}
