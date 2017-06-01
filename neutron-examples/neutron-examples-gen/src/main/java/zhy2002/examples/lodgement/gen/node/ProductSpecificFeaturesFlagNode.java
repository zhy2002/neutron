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
    public ProductSpecificFeaturesFlagNode(@Owner ProductDescriptionNode parent, @ChildName String name) {
        super(parent, name);
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
