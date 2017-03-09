package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ProductCreditCardTypeNode extends StringUiNode<ProductFeaturesNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ProductCreditCardTypeNode.class;
    }

    private ProductCreditCardTypeNodeComponent component;

    @Inject
    void createComponent(ProductCreditCardTypeNodeComponent.Builder builder) {
        this.component = builder.setProductCreditCardTypeNodeModule(new ProductCreditCardTypeNodeModule(this)).build();
    }

    private ProductCreditCardTypeNodeRuleProvider getRuleProvider() {
        return component.getProductCreditCardTypeNodeRuleProvider();
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

    private RuleProvider<ProductCreditCardTypeNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    public ProductCreditCardTypeNode(@NotNull ProductFeaturesNode parent, String name) {
        super(parent, name);
    }

}
