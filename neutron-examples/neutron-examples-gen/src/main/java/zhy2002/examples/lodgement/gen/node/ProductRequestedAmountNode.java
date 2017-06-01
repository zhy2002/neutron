package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ProductRequestedAmountNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ProductRequestedAmountNode extends BaseCurrencyNode<ProductDescriptionNode> {

    @Inject
    public ProductRequestedAmountNode(@Owner ProductDescriptionNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProductRequestedAmountNode.class;
    }

    protected final ProductRequestedAmountNodeComponent getComponent() {
        return component;
    }


    private ProductRequestedAmountNodeComponent component;

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
