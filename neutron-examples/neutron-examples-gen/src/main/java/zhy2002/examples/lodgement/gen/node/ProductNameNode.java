package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ProductNameNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ProductNameNode extends StringUiNode<ProductDescriptionNode> {

    @Inject
    protected ProductNameNode(@Owner ProductDescriptionNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProductNameNode.class;
    }

    protected final ProductNameNodeComponent getComponent() {
        return component;
    }


    private ProductNameNodeComponent component;

    @Inject
    void createComponent(ProductNameNodeComponent.Builder builder) {
        this.component = builder.setProductNameNodeModule(new ProductNameNodeModule(this)).build();
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
