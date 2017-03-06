package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ProductCreditCardLimitNode extends BaseCurrencyNode<ProductFeaturesNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ProductCreditCardLimitNode.class;
    }

    private ProductCreditCardLimitNodeComponent component;

    @Inject
    void createComponent(ProductCreditCardLimitNodeComponent.Builder builder) {
        this.component = builder.setProductCreditCardLimitNodeModule(new ProductCreditCardLimitNodeModule(this)).build();
    }

    private ProductCreditCardLimitNodeRuleProvider getRuleProvider() {
        return component.getProductCreditCardLimitNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public ProductCreditCardLimitNode(@NotNull ProductFeaturesNode parent, String name) {
        super(parent, name);
    }

}
