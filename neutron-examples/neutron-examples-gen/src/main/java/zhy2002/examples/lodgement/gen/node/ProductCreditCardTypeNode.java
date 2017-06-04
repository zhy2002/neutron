package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ProductCreditCardTypeNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ProductCreditCardTypeNode extends StringUiNode<ProductFeaturesNode> {

    @Inject
    protected ProductCreditCardTypeNode(@Owner ProductFeaturesNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProductCreditCardTypeNode.class;
    }

    protected final ProductCreditCardTypeNodeComponent getComponent() {
        return component;
    }


    private ProductCreditCardTypeNodeComponent component;

    @Inject
    void createComponent(ProductCreditCardTypeNodeComponent.Builder builder) {
        this.component = builder.setProductCreditCardTypeNodeModule(new ProductCreditCardTypeNodeModule(this)).build();
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
