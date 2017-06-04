package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ProductInterestOnlyTermNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ProductInterestOnlyTermNode extends BigDecimalUiNode<ProductDescriptionNode> {

    @Inject
    protected ProductInterestOnlyTermNode(@Owner ProductDescriptionNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProductInterestOnlyTermNode.class;
    }

    protected final ProductInterestOnlyTermNodeComponent getComponent() {
        return component;
    }


    private ProductInterestOnlyTermNodeComponent component;

    @Inject
    void createComponent(ProductInterestOnlyTermNodeComponent.Builder builder) {
        this.component = builder.setProductInterestOnlyTermNodeModule(new ProductInterestOnlyTermNodeModule(this)).build();
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
