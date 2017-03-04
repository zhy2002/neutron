package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class ProductTotalLoanAmountNode extends BaseCurrencyNode<ProductsNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ProductTotalLoanAmountNode.class;
    }

    private ProductTotalLoanAmountNodeComponent component;

    @Inject
    void createComponent(ProductTotalLoanAmountNodeComponent.Builder builder) {
        this.component = builder.setProductTotalLoanAmountNodeModule(new ProductTotalLoanAmountNodeModule(this)).build();
    }

    @Override
    protected ProductTotalLoanAmountNodeRuleProvider getRuleProvider() {
        return component.getProductTotalLoanAmountNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public ProductTotalLoanAmountNode(@NotNull ProductsNode parent, String name) {
        super(parent, name);
    }

}
