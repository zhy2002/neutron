package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ProductTransactionAccountFlagNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ProductTransactionAccountFlagNode extends BooleanUiNode<ProductFeaturesNode> {

    @Inject
    public ProductTransactionAccountFlagNode(@Owner ProductFeaturesNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProductTransactionAccountFlagNode.class;
    }

    protected final ProductTransactionAccountFlagNodeComponent getComponent() {
        return component;
    }


    private ProductTransactionAccountFlagNodeComponent component;

    @Inject
    void createComponent(ProductTransactionAccountFlagNodeComponent.Builder builder) {
        this.component = builder.setProductTransactionAccountFlagNodeModule(new ProductTransactionAccountFlagNodeModule(this)).build();
    }

    private RuleProvider<ProductTransactionAccountFlagNode> getRuleProvider() {
        return component.getProductTransactionAccountFlagNodeRuleProvider();
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

    private RuleProvider<ProductTransactionAccountFlagNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
