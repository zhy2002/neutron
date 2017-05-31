package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class ProductExpressConsentFlagNode extends BooleanUiNode<ProductFeaturesNode> {
    private ProductExpressConsentFlagNodeComponent component;

    public ProductExpressConsentFlagNode(@NotNull ProductFeaturesNode parent, String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return ProductExpressConsentFlagNode.class;
    }

    @Inject
    void createComponent(ProductExpressConsentFlagNodeComponent.Builder builder) {
        this.component = builder.setProductExpressConsentFlagNodeModule(new ProductExpressConsentFlagNodeModule(this)).build();
    }

    private RuleProvider<ProductExpressConsentFlagNode> getRuleProvider() {
        return component.getProductExpressConsentFlagNodeRuleProvider();
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

    private RuleProvider<ProductExpressConsentFlagNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
