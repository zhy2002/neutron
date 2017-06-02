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
    protected ProductTransactionAccountFlagNode(@Owner ProductFeaturesNode parent) {
        super(parent);
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

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

}
