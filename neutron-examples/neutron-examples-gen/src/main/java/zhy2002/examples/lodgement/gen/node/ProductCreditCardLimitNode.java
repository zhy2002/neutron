package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ProductCreditCardLimitNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ProductCreditCardLimitNode extends BaseCurrencyNode<ProductFeaturesNode> {

    @Inject
    public ProductCreditCardLimitNode(@Owner ProductFeaturesNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProductCreditCardLimitNode.class;
    }

    protected final ProductCreditCardLimitNodeComponent getComponent() {
        return component;
    }


    private ProductCreditCardLimitNodeComponent component;

    @Inject
    void createComponent(ProductCreditCardLimitNodeComponent.Builder builder) {
        this.component = builder.setProductCreditCardLimitNodeModule(new ProductCreditCardLimitNodeModule(this)).build();
    }

    private RuleProvider<ProductCreditCardLimitNode> getRuleProvider() {
        return component.getProductCreditCardLimitNodeRuleProvider();
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

    private RuleProvider<ProductCreditCardLimitNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
