package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ProductCreditCardFlagNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ProductCreditCardFlagNode extends BooleanUiNode<ProductFeaturesNode> {

    @Inject
    public ProductCreditCardFlagNode(@Owner ProductFeaturesNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProductCreditCardFlagNode.class;
    }

    protected final ProductCreditCardFlagNodeComponent getComponent() {
        return component;
    }


    private ProductCreditCardFlagNodeComponent component;

    @Inject
    void createComponent(ProductCreditCardFlagNodeComponent.Builder builder) {
        this.component = builder.setProductCreditCardFlagNodeModule(new ProductCreditCardFlagNodeModule(this)).build();
    }

    private RuleProvider<ProductCreditCardFlagNode> getRuleProvider() {
        return component.getProductCreditCardFlagNodeRuleProvider();
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

    private RuleProvider<ProductCreditCardFlagNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
