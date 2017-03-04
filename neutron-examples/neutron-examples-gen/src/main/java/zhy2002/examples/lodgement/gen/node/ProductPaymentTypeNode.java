package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class ProductPaymentTypeNode extends StringUiNode<ProductDescriptionNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ProductPaymentTypeNode.class;
    }

    private ProductPaymentTypeNodeComponent component;

    @Inject
    void createComponent(ProductPaymentTypeNodeComponent.Builder builder) {
        this.component = builder.setProductPaymentTypeNodeModule(new ProductPaymentTypeNodeModule(this)).build();
    }

    @Override
    protected ProductPaymentTypeNodeRuleProvider getRuleProvider() {
        return component.getProductPaymentTypeNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public ProductPaymentTypeNode(@NotNull ProductDescriptionNode parent, String name) {
        super(parent, name);
    }

}
