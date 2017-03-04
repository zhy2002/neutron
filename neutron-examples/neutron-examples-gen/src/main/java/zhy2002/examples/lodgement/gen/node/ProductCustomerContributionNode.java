package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class ProductCustomerContributionNode extends ObjectUiNode<ProductsNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ProductCustomerContributionNode.class;
    }

    private ProductCustomerContributionNodeComponent component;

    @Inject
    void createComponent(ProductCustomerContributionNodeComponent.Builder builder) {
        this.component = builder.setProductCustomerContributionNodeModule(new ProductCustomerContributionNodeModule(this)).build();
    }

    @Override
    protected ProductCustomerContributionNodeRuleProvider getRuleProvider() {
        return component.getProductCustomerContributionNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public ProductCustomerContributionNode(@NotNull ProductsNode parent, String name) {
        super(parent, name);
    }

}
