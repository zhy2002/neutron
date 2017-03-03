package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class ProductTotalSecurityAmountNode extends BaseCurrencyNode<ProductsNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ProductTotalSecurityAmountNode.class;
    }

    private ProductTotalSecurityAmountNodeComponent component;

    @Inject
    void createComponent(ProductTotalSecurityAmountNodeComponent.Builder builder) {
        this.component = builder.setProductTotalSecurityAmountNodeModule(new ProductTotalSecurityAmountNodeModule(this)).build();
    }

    @Override
    protected ProductTotalSecurityAmountNodeRuleProvider getRuleProvider() {
        return component.getProductTotalSecurityAmountNodeRuleProvider();
    }

    public ProductTotalSecurityAmountNode(@NotNull ProductsNode parent, String name) {
        super(parent, name);
    }

}
