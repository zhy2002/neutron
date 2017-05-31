package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class ProductTotalSecurityAmountNode extends BaseCurrencyNode<ProductsNode> {
    private ProductTotalSecurityAmountNodeComponent component;

    public ProductTotalSecurityAmountNode(@NotNull ProductsNode parent, String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return ProductTotalSecurityAmountNode.class;
    }

    @Inject
    void createComponent(ProductTotalSecurityAmountNodeComponent.Builder builder) {
        this.component = builder.setProductTotalSecurityAmountNodeModule(new ProductTotalSecurityAmountNodeModule(this)).build();
    }

    private RuleProvider<ProductTotalSecurityAmountNode> getRuleProvider() {
        return component.getProductTotalSecurityAmountNodeRuleProvider();
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

    private RuleProvider<ProductTotalSecurityAmountNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
