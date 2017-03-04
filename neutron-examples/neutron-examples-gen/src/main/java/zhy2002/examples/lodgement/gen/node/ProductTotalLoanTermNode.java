package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class ProductTotalLoanTermNode extends BigDecimalUiNode<ProductDescriptionNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ProductTotalLoanTermNode.class;
    }

    private ProductTotalLoanTermNodeComponent component;

    @Inject
    void createComponent(ProductTotalLoanTermNodeComponent.Builder builder) {
        this.component = builder.setProductTotalLoanTermNodeModule(new ProductTotalLoanTermNodeModule(this)).build();
    }

    @Override
    protected ProductTotalLoanTermNodeRuleProvider getRuleProvider() {
        return component.getProductTotalLoanTermNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public ProductTotalLoanTermNode(@NotNull ProductDescriptionNode parent, String name) {
        super(parent, name);
    }

}
