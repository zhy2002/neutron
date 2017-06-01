package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class ProductTotalLoanTermNode extends BigDecimalUiNode<ProductDescriptionNode> {

    private ProductTotalLoanTermNodeComponent component;

    @Inject
    public ProductTotalLoanTermNode(@Owner ProductDescriptionNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProductTotalLoanTermNode.class;
    }

    @Inject
    void createComponent(ProductTotalLoanTermNodeComponent.Builder builder) {
        this.component = builder.setProductTotalLoanTermNodeModule(new ProductTotalLoanTermNodeModule(this)).build();
    }

    private RuleProvider<ProductTotalLoanTermNode> getRuleProvider() {
        return component.getProductTotalLoanTermNodeRuleProvider();
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

    private RuleProvider<ProductTotalLoanTermNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
