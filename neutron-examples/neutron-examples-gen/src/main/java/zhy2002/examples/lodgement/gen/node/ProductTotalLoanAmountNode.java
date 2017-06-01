package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class ProductTotalLoanAmountNode extends BaseCurrencyNode<ProductsNode> {

    @Inject
    public ProductTotalLoanAmountNode(@Owner ProductsNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProductTotalLoanAmountNode.class;
    }

    private ProductTotalLoanAmountNodeComponent component;

    @Inject
    void createComponent(ProductTotalLoanAmountNodeComponent.Builder builder) {
        this.component = builder.setProductTotalLoanAmountNodeModule(new ProductTotalLoanAmountNodeModule(this)).build();
    }

    private RuleProvider<ProductTotalLoanAmountNode> getRuleProvider() {
        return component.getProductTotalLoanAmountNodeRuleProvider();
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

    private RuleProvider<ProductTotalLoanAmountNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
