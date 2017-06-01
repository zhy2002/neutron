package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class ProductOptOutReasonNode extends StringUiNode<ProductFeaturesNode> {

    private ProductOptOutReasonNodeComponent component;

    @Inject
    public ProductOptOutReasonNode(@Owner ProductFeaturesNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProductOptOutReasonNode.class;
    }

    @Inject
    void createComponent(ProductOptOutReasonNodeComponent.Builder builder) {
        this.component = builder.setProductOptOutReasonNodeModule(new ProductOptOutReasonNodeModule(this)).build();
    }

    private RuleProvider<ProductOptOutReasonNode> getRuleProvider() {
        return component.getProductOptOutReasonNodeRuleProvider();
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

    private RuleProvider<ProductOptOutReasonNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
