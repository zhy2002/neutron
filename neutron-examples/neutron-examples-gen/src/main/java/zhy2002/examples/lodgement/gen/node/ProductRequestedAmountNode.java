package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class ProductRequestedAmountNode extends BaseCurrencyNode<ProductDescriptionNode> {
    private ProductRequestedAmountNodeComponent component;

    public ProductRequestedAmountNode(@NotNull ProductDescriptionNode parent, String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return ProductRequestedAmountNode.class;
    }

    @Inject
    void createComponent(ProductRequestedAmountNodeComponent.Builder builder) {
        this.component = builder.setProductRequestedAmountNodeModule(new ProductRequestedAmountNodeModule(this)).build();
    }

    private RuleProvider<ProductRequestedAmountNode> getRuleProvider() {
        return component.getProductRequestedAmountNodeRuleProvider();
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

    private RuleProvider<ProductRequestedAmountNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
