package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class ProductExpressConsentFlagNode extends BooleanUiNode<ProductFeaturesNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ProductExpressConsentFlagNode.class;
    }

    private ProductExpressConsentFlagNodeComponent component;

    @Inject
    void createComponent(ProductExpressConsentFlagNodeComponent.Builder builder) {
        this.component = builder.setProductExpressConsentFlagNodeModule(new ProductExpressConsentFlagNodeModule(this)).build();
    }

    @Override
    protected ProductExpressConsentFlagNodeRuleProvider getRuleProvider() {
        return component.getProductExpressConsentFlagNodeRuleProvider();
    }

    public ProductExpressConsentFlagNode(@NotNull ProductFeaturesNode parent, String name) {
        super(parent, name);
    }

}
