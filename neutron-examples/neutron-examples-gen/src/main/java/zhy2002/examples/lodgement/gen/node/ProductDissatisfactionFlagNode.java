package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ProductDissatisfactionFlagNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ProductDissatisfactionFlagNode extends BooleanUiNode<ProductDescriptionNode> {

    @Inject
    public ProductDissatisfactionFlagNode(@Owner ProductDescriptionNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProductDissatisfactionFlagNode.class;
    }

    protected final ProductDissatisfactionFlagNodeComponent getComponent() {
        return component;
    }


    private ProductDissatisfactionFlagNodeComponent component;

    @Inject
    void createComponent(ProductDissatisfactionFlagNodeComponent.Builder builder) {
        this.component = builder.setProductDissatisfactionFlagNodeModule(new ProductDissatisfactionFlagNodeModule(this)).build();
    }

    private RuleProvider<ProductDissatisfactionFlagNode> getRuleProvider() {
        return component.getProductDissatisfactionFlagNodeRuleProvider();
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

    private RuleProvider<ProductDissatisfactionFlagNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
