package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.Product100PercentOffsetFlagNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class Product100PercentOffsetFlagNode extends BooleanUiNode<ProductFeaturesNode> {

    @Inject
    public Product100PercentOffsetFlagNode(@Owner ProductFeaturesNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return Product100PercentOffsetFlagNode.class;
    }

    protected final Product100PercentOffsetFlagNodeComponent getComponent() {
        return component;
    }


    private Product100PercentOffsetFlagNodeComponent component;

    @Inject
    void createComponent(Product100PercentOffsetFlagNodeComponent.Builder builder) {
        this.component = builder.setProduct100PercentOffsetFlagNodeModule(new Product100PercentOffsetFlagNodeModule(this)).build();
    }

    private RuleProvider<Product100PercentOffsetFlagNode> getRuleProvider() {
        return component.getProduct100PercentOffsetFlagNodeRuleProvider();
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

    private RuleProvider<Product100PercentOffsetFlagNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
