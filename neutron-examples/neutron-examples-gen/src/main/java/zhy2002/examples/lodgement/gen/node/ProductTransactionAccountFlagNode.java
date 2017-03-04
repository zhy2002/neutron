package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class ProductTransactionAccountFlagNode extends BooleanUiNode<ProductFeaturesNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ProductTransactionAccountFlagNode.class;
    }

    private ProductTransactionAccountFlagNodeComponent component;

    @Inject
    void createComponent(ProductTransactionAccountFlagNodeComponent.Builder builder) {
        this.component = builder.setProductTransactionAccountFlagNodeModule(new ProductTransactionAccountFlagNodeModule(this)).build();
    }

    @Override
    protected ProductTransactionAccountFlagNodeRuleProvider getRuleProvider() {
        return component.getProductTransactionAccountFlagNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public ProductTransactionAccountFlagNode(@NotNull ProductFeaturesNode parent, String name) {
        super(parent, name);
    }

}
