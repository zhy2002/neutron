package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ProductPaymentTypeNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ProductPaymentTypeNode extends StringUiNode<ProductDescriptionNode> {

    @Inject
    protected ProductPaymentTypeNode(@Owner ProductDescriptionNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProductPaymentTypeNode.class;
    }

    protected final ProductPaymentTypeNodeComponent getComponent() {
        return component;
    }


    private ProductPaymentTypeNodeComponent component;

    @Inject
    void createComponent(ProductPaymentTypeNodeComponent.Builder builder) {
        this.component = builder.setProductPaymentTypeNodeModule(new ProductPaymentTypeNodeModule(this)).build();
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
