package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class FeeAmountNode extends BaseCurrencyNode<ProductFeeNode> {

    private FeeAmountNodeComponent component;

    @Inject
    public FeeAmountNode(@Owner ProductFeeNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return FeeAmountNode.class;
    }

    @Inject
    void createComponent(FeeAmountNodeComponent.Builder builder) {
        this.component = builder.setFeeAmountNodeModule(new FeeAmountNodeModule(this)).build();
    }

    private RuleProvider<FeeAmountNode> getRuleProvider() {
        return component.getFeeAmountNodeRuleProvider();
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

    private RuleProvider<FeeAmountNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
