package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class ProductConsolidationFlagNode extends BooleanUiNode<ProductDescriptionNode> {
    private ProductConsolidationFlagNodeComponent component;

    public ProductConsolidationFlagNode(@NotNull ProductDescriptionNode parent, String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return ProductConsolidationFlagNode.class;
    }

    @Inject
    void createComponent(ProductConsolidationFlagNodeComponent.Builder builder) {
        this.component = builder.setProductConsolidationFlagNodeModule(new ProductConsolidationFlagNodeModule(this)).build();
    }

    private RuleProvider<ProductConsolidationFlagNode> getRuleProvider() {
        return component.getProductConsolidationFlagNodeRuleProvider();
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

    private RuleProvider<ProductConsolidationFlagNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
