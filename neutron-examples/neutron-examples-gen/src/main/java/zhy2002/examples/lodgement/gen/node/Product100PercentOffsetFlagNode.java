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

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

}
