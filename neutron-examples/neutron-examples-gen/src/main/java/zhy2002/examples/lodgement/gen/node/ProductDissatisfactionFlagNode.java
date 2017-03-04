package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class ProductDissatisfactionFlagNode extends BooleanUiNode<ProductDescriptionNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ProductDissatisfactionFlagNode.class;
    }

    private ProductDissatisfactionFlagNodeComponent component;

    @Inject
    void createComponent(ProductDissatisfactionFlagNodeComponent.Builder builder) {
        this.component = builder.setProductDissatisfactionFlagNodeModule(new ProductDissatisfactionFlagNodeModule(this)).build();
    }

    @Override
    protected ProductDissatisfactionFlagNodeRuleProvider getRuleProvider() {
        return component.getProductDissatisfactionFlagNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public ProductDissatisfactionFlagNode(@NotNull ProductDescriptionNode parent, String name) {
        super(parent, name);
    }

}
