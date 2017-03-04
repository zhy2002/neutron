package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class ProductCardHodlerNameNode extends StringUiNode<ProductCardHolderNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ProductCardHodlerNameNode.class;
    }

    private ProductCardHodlerNameNodeComponent component;

    @Inject
    void createComponent(ProductCardHodlerNameNodeComponent.Builder builder) {
        this.component = builder.setProductCardHodlerNameNodeModule(new ProductCardHodlerNameNodeModule(this)).build();
    }

    @Override
    protected ProductCardHodlerNameNodeRuleProvider getRuleProvider() {
        return component.getProductCardHodlerNameNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public ProductCardHodlerNameNode(@NotNull ProductCardHolderNode parent, String name) {
        super(parent, name);
    }

}
