package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class ProductSpecificFeaturesFlagNode extends BooleanUiNode<ProductDescriptionNode> {
    private ProductSpecificFeaturesFlagNodeComponent component;

    public ProductSpecificFeaturesFlagNode(@NotNull ProductDescriptionNode parent, String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return ProductSpecificFeaturesFlagNode.class;
    }

    @Inject
    void createComponent(ProductSpecificFeaturesFlagNodeComponent.Builder builder) {
        this.component = builder.setProductSpecificFeaturesFlagNodeModule(new ProductSpecificFeaturesFlagNodeModule(this)).build();
    }

    private RuleProvider<ProductSpecificFeaturesFlagNode> getRuleProvider() {
        return component.getProductSpecificFeaturesFlagNodeRuleProvider();
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

    private RuleProvider<ProductSpecificFeaturesFlagNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
