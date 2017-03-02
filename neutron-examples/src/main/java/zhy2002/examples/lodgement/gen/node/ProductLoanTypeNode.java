package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class ProductLoanTypeNode extends StringUiNode<ProductsNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ProductLoanTypeNode.class;
    }

    private ProductLoanTypeNodeComponent component;

    @Inject
    void createComponent(ProductLoanTypeNodeComponent.Builder builder) {
        this.component = builder.setProductLoanTypeNodeModule(new ProductLoanTypeNodeModule(this)).build();
    }

    @Override
    protected ProductLoanTypeNodeRuleProvider getRuleProvider() {
        return component.getProductLoanTypeNodeRuleProvider();
    }

    public ProductLoanTypeNode(@NotNull ProductsNode parent, String name) {
        super(parent, name);
    }

}
