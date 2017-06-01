package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ProductExpressConsentFlagNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ProductExpressConsentFlagNode extends BooleanUiNode<ProductFeaturesNode> {

    @Inject
    public ProductExpressConsentFlagNode(@Owner ProductFeaturesNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProductExpressConsentFlagNode.class;
    }

    protected final ProductExpressConsentFlagNodeComponent getComponent() {
        return component;
    }


    private ProductExpressConsentFlagNodeComponent component;

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
