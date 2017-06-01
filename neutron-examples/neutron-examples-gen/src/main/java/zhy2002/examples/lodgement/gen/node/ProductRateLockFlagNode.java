package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ProductRateLockFlagNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ProductRateLockFlagNode extends BooleanUiNode<ProductFeaturesNode> {

    @Inject
    public ProductRateLockFlagNode(@Owner ProductFeaturesNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProductRateLockFlagNode.class;
    }

    protected final ProductRateLockFlagNodeComponent getComponent() {
        return component;
    }


    private ProductRateLockFlagNodeComponent component;

    @Inject
    void createComponent(ProductRateLockFlagNodeComponent.Builder builder) {
        this.component = builder.setProductRateLockFlagNodeModule(new ProductRateLockFlagNodeModule(this)).build();
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
