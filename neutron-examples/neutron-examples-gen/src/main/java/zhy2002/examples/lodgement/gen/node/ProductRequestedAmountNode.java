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
    protected ProductRequestedAmountNode(@Owner ProductDescriptionNode parent) {
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

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

}
