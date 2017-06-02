package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ProductCreditCardFlagNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ProductCreditCardFlagNode extends BooleanUiNode<ProductFeaturesNode> {

    @Inject
    protected ProductCreditCardFlagNode(@Owner ProductFeaturesNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProductCreditCardFlagNode.class;
    }

    protected final ProductCreditCardFlagNodeComponent getComponent() {
        return component;
    }


    private ProductCreditCardFlagNodeComponent component;

    @Inject
    void createComponent(ProductCreditCardFlagNodeComponent.Builder builder) {
        this.component = builder.setProductCreditCardFlagNodeModule(new ProductCreditCardFlagNodeModule(this)).build();
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
