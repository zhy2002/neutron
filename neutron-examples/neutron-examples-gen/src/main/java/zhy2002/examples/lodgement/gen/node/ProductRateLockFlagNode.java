package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ProductRateLockFlagNode extends BooleanUiNode<ProductFeaturesNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ProductRateLockFlagNode.class;
    }

    private ProductRateLockFlagNodeComponent component;

    @Inject
    void createComponent(ProductRateLockFlagNodeComponent.Builder builder) {
        this.component = builder.setProductRateLockFlagNodeModule(new ProductRateLockFlagNodeModule(this)).build();
    }

    private ProductRateLockFlagNodeRuleProvider getRuleProvider() {
        return component.getProductRateLockFlagNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public ProductRateLockFlagNode(@NotNull ProductFeaturesNode parent, String name) {
        super(parent, name);
    }

}
