package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


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

    private ProductCardHodlerNameNodeRuleProvider getRuleProvider() {
        return component.getProductCardHodlerNameNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public ProductCardHodlerNameNode(@NotNull ProductCardHolderNode parent, String name) {
        super(parent, name);
    }

}
