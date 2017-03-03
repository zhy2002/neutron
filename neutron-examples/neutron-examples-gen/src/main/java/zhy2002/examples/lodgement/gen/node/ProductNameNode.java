package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class ProductNameNode extends StringUiNode<ProductDescriptionNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ProductNameNode.class;
    }

    private ProductNameNodeComponent component;

    @Inject
    void createComponent(ProductNameNodeComponent.Builder builder) {
        this.component = builder.setProductNameNodeModule(new ProductNameNodeModule(this)).build();
    }

    @Override
    protected ProductNameNodeRuleProvider getRuleProvider() {
        return component.getProductNameNodeRuleProvider();
    }

    public ProductNameNode(@NotNull ProductDescriptionNode parent, String name) {
        super(parent, name);
    }

}
