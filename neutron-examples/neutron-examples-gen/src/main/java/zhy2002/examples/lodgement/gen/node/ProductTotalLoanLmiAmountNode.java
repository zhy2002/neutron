package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class ProductTotalLoanLmiAmountNode extends BaseCurrencyNode<ProductsNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ProductTotalLoanLmiAmountNode.class;
    }

    private ProductTotalLoanLmiAmountNodeComponent component;

    @Inject
    void createComponent(ProductTotalLoanLmiAmountNodeComponent.Builder builder) {
        this.component = builder.setProductTotalLoanLmiAmountNodeModule(new ProductTotalLoanLmiAmountNodeModule(this)).build();
    }

    @Override
    protected ProductTotalLoanLmiAmountNodeRuleProvider getRuleProvider() {
        return component.getProductTotalLoanLmiAmountNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public ProductTotalLoanLmiAmountNode(@NotNull ProductsNode parent, String name) {
        super(parent, name);
    }

}
