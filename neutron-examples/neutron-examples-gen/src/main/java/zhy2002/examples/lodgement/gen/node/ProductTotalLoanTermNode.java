package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


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

    private ProductTotalLoanTermNodeRuleProvider getRuleProvider() {
        return component.getProductTotalLoanTermNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public ProductTotalLoanTermNode(@NotNull ProductDescriptionNode parent, String name) {
        super(parent, name);
    }

}
