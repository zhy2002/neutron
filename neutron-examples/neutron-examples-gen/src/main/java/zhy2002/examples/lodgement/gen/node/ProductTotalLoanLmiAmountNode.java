package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

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

    private RuleProvider<ProductTotalLoanLmiAmountNode> getRuleProvider() {
        return component.getProductTotalLoanLmiAmountNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
        getInstanceRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
        getInstanceRuleProvider().createRules(createdRules);
    }

    private RuleProvider<ProductTotalLoanLmiAmountNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }


    public ProductTotalLoanLmiAmountNode(@NotNull ProductsNode parent, String name) {
        super(parent, name);
    }

}
