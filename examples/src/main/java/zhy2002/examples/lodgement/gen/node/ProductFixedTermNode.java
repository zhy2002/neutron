package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class ProductFixedTermNode extends BigDecimalUiNode<ProductDescriptionNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ProductFixedTermNode.class;
    }

    private ProductFixedTermNodeComponent component;

    @Inject
    void createComponent(ProductFixedTermNodeComponent.Builder builder) {
        this.component = builder.setProductFixedTermNodeModule(new ProductFixedTermNodeModule(this)).build();
    }

    @Override
    protected ProductFixedTermNodeRuleProvider getRuleProvider() {
        return component.getProductFixedTermNodeRuleProvider();
    }

    public ProductFixedTermNode(@NotNull ProductDescriptionNode parent, String name) {
        super(parent, name);
    }

}
