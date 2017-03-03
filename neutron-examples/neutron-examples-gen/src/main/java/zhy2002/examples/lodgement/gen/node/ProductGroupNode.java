package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class ProductGroupNode extends StringUiNode<ProductDescriptionNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ProductGroupNode.class;
    }

    private ProductGroupNodeComponent component;

    @Inject
    void createComponent(ProductGroupNodeComponent.Builder builder) {
        this.component = builder.setProductGroupNodeModule(new ProductGroupNodeModule(this)).build();
    }

    @Override
    protected ProductGroupNodeRuleProvider getRuleProvider() {
        return component.getProductGroupNodeRuleProvider();
    }

    public ProductGroupNode(@NotNull ProductDescriptionNode parent, String name) {
        super(parent, name);
    }

}
