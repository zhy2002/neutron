package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class ProductInterestOnlyTermNode extends BigDecimalUiNode<ProductDescriptionNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ProductInterestOnlyTermNode.class;
    }

    private ProductInterestOnlyTermNodeComponent component;

    @Inject
    void createComponent(ProductInterestOnlyTermNodeComponent.Builder builder) {
        this.component = builder.setProductInterestOnlyTermNodeModule(new ProductInterestOnlyTermNodeModule(this)).build();
    }

    @Override
    protected ProductInterestOnlyTermNodeRuleProvider getRuleProvider() {
        return component.getProductInterestOnlyTermNodeRuleProvider();
    }

    public ProductInterestOnlyTermNode(@NotNull ProductDescriptionNode parent, String name) {
        super(parent, name);
    }

}
