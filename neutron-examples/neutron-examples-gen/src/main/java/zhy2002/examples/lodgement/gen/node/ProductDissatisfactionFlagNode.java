package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ProductDissatisfactionFlagNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ProductDissatisfactionFlagNode extends BooleanUiNode<ProductDescriptionNode> {

    @Inject
    protected ProductDissatisfactionFlagNode(@Owner ProductDescriptionNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProductDissatisfactionFlagNode.class;
    }

    protected final ProductDissatisfactionFlagNodeComponent getComponent() {
        return component;
    }


    private ProductDissatisfactionFlagNodeComponent component;

    @Inject
    void createComponent(ProductDissatisfactionFlagNodeComponent.Builder builder) {
        this.component = builder.setProductDissatisfactionFlagNodeModule(new ProductDissatisfactionFlagNodeModule(this)).build();
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
