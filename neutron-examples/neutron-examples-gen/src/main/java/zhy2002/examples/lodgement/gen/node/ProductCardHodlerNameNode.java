package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ProductCardHodlerNameNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ProductCardHodlerNameNode extends StringUiNode<ProductCardHolderNode> {

    @Inject
    public ProductCardHodlerNameNode(@Owner ProductCardHolderNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProductCardHodlerNameNode.class;
    }

    protected final ProductCardHodlerNameNodeComponent getComponent() {
        return component;
    }


    private ProductCardHodlerNameNodeComponent component;

    @Inject
    void createComponent(ProductCardHodlerNameNodeComponent.Builder builder) {
        this.component = builder.setProductCardHodlerNameNodeModule(new ProductCardHodlerNameNodeModule(this)).build();
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
