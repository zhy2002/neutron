package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class ProductRepaymentFrequencyNode extends StringUiNode<ProductFeaturesNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ProductRepaymentFrequencyNode.class;
    }

    private ProductRepaymentFrequencyNodeComponent component;

    @Inject
    void createComponent(ProductRepaymentFrequencyNodeComponent.Builder builder) {
        this.component = builder.setProductRepaymentFrequencyNodeModule(new ProductRepaymentFrequencyNodeModule(this)).build();
    }

    @Override
    protected ProductRepaymentFrequencyNodeRuleProvider getRuleProvider() {
        return component.getProductRepaymentFrequencyNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public ProductRepaymentFrequencyNode(@NotNull ProductFeaturesNode parent, String name) {
        super(parent, name);
    }

}
