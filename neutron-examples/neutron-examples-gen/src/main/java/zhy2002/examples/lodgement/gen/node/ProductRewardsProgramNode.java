package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ProductRewardsProgramNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ProductRewardsProgramNode extends StringUiNode<ProductCardHolderNode> {

    @Inject
    protected ProductRewardsProgramNode(@Owner ProductCardHolderNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProductRewardsProgramNode.class;
    }

    protected final ProductRewardsProgramNodeComponent getComponent() {
        return component;
    }


    private ProductRewardsProgramNodeComponent component;

    @Inject
    void createComponent(ProductRewardsProgramNodeComponent.Builder builder) {
        this.component = builder.setProductRewardsProgramNodeModule(new ProductRewardsProgramNodeModule(this)).build();
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
