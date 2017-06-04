package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ProductGroupNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ProductGroupNode extends StringUiNode<ProductDescriptionNode> {

    @Inject
    protected ProductGroupNode(@Owner ProductDescriptionNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProductGroupNode.class;
    }

    protected final ProductGroupNodeComponent getComponent() {
        return component;
    }


    private ProductGroupNodeComponent component;

    @Inject
    void createComponent(ProductGroupNodeComponent.Builder builder) {
        this.component = builder.setProductGroupNodeModule(new ProductGroupNodeModule(this)).build();
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
