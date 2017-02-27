package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class ProductLoanPrimaryPurposeNode extends StringUiNode<ProductDescriptionNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ProductLoanPrimaryPurposeNode.class;
    }

    private ProductLoanPrimaryPurposeNodeComponent component;

    @Inject
    void createComponent(ProductLoanPrimaryPurposeNodeComponent.Builder builder) {
        this.component = builder.setProductLoanPrimaryPurposeNodeModule(new ProductLoanPrimaryPurposeNodeModule(this)).build();
    }

    @Override
    protected ProductLoanPrimaryPurposeNodeRuleProvider getRuleProvider() {
        return component.getProductLoanPrimaryPurposeNodeRuleProvider();
    }

    public ProductLoanPrimaryPurposeNode(@NotNull ProductDescriptionNode parent, String name) {
        super(parent, name);
    }

}
