package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ProductRepaymentFrequencyNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class ProductRepaymentFrequencyNode extends StringUiNode<ProductFeaturesNode> {

    @Inject
    public ProductRepaymentFrequencyNode(@Owner ProductFeaturesNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProductRepaymentFrequencyNode.class;
    }

    protected final ProductRepaymentFrequencyNodeComponent getComponent() {
        return component;
    }


    private ProductRepaymentFrequencyNodeComponent component;

    @Inject
    void createComponent(ProductRepaymentFrequencyNodeComponent.Builder builder) {
        this.component = builder.setProductRepaymentFrequencyNodeModule(new ProductRepaymentFrequencyNodeModule(this)).build();
    }

    private RuleProvider<ProductRepaymentFrequencyNode> getRuleProvider() {
        return component.getProductRepaymentFrequencyNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
        getInstanceRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
        getInstanceRuleProvider().createRules(createdRules);
    }

    private RuleProvider<ProductRepaymentFrequencyNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
