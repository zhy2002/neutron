package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class ProductConstructionApplicationFlagNode extends BooleanUiNode<ProductDescriptionNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ProductConstructionApplicationFlagNode.class;
    }

    private ProductConstructionApplicationFlagNodeComponent component;

    @Inject
    void createComponent(ProductConstructionApplicationFlagNodeComponent.Builder builder) {
        this.component = builder.setProductConstructionApplicationFlagNodeModule(new ProductConstructionApplicationFlagNodeModule(this)).build();
    }

    @Override
    protected ProductConstructionApplicationFlagNodeRuleProvider getRuleProvider() {
        return component.getProductConstructionApplicationFlagNodeRuleProvider();
    }

    public ProductConstructionApplicationFlagNode(@NotNull ProductDescriptionNode parent, String name) {
        super(parent, name);
    }

}
