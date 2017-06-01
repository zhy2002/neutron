package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ProductTotalSecurityAmountNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ProductTotalSecurityAmountNode extends BaseCurrencyNode<ProductsNode> {

    @Inject
    public ProductTotalSecurityAmountNode(@Owner ProductsNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProductTotalSecurityAmountNode.class;
    }

    protected final ProductTotalSecurityAmountNodeComponent getComponent() {
        return component;
    }


    private ProductTotalSecurityAmountNodeComponent component;

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
