package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class ProductOptOutReasonNode extends StringUiNode<ProductFeaturesNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ProductOptOutReasonNode.class;
    }

    private ProductOptOutReasonNodeComponent component;

    @Inject
    void createComponent(ProductOptOutReasonNodeComponent.Builder builder) {
        this.component = builder.setProductOptOutReasonNodeModule(new ProductOptOutReasonNodeModule(this)).build();
    }

    @Override
    protected ProductOptOutReasonNodeRuleProvider getRuleProvider() {
        return component.getProductOptOutReasonNodeRuleProvider();
    }

    public ProductOptOutReasonNode(@NotNull ProductFeaturesNode parent, String name) {
        super(parent, name);
    }

}