package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ProductFixedTermNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ProductFixedTermNode extends BigDecimalUiNode<ProductDescriptionNode> {

    @Inject
    protected ProductFixedTermNode(@Owner ProductDescriptionNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProductFixedTermNode.class;
    }

    protected final ProductFixedTermNodeComponent getComponent() {
        return component;
    }


    private ProductFixedTermNodeComponent component;

    @Inject
    void createComponent(ProductFixedTermNodeComponent.Builder builder) {
        this.component = builder.setProductFixedTermNodeModule(new ProductFixedTermNodeModule(this)).build();
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
