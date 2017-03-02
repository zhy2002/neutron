package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class ProductFeesNode extends ObjectUiNode<ProductsNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ProductFeesNode.class;
    }

    private ProductFeesNodeComponent component;

    @Inject
    void createComponent(ProductFeesNodeComponent.Builder builder) {
        this.component = builder.setProductFeesNodeModule(new ProductFeesNodeModule(this)).build();
    }

    @Override
    protected ProductFeesNodeRuleProvider getRuleProvider() {
        return component.getProductFeesNodeRuleProvider();
    }

    public ProductFeesNode(@NotNull ProductsNode parent, String name) {
        super(parent, name);
    }

}
