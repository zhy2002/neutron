package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


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

    private ProductSpecificFeaturesFlagNodeRuleProvider getRuleProvider() {
        return component.getProductSpecificFeaturesFlagNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public ProductSpecificFeaturesFlagNode(@NotNull ProductDescriptionNode parent, String name) {
        super(parent, name);
    }

}
