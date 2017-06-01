package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class OtherLiabilityBreakCostNode extends BaseCurrencyNode<OtherLiabilityNode> {

    private OtherLiabilityBreakCostNodeComponent component;

    @Inject
    public OtherLiabilityBreakCostNode(@Owner OtherLiabilityNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return OtherLiabilityBreakCostNode.class;
    }

    @Inject
    void createComponent(OtherLiabilityBreakCostNodeComponent.Builder builder) {
        this.component = builder.setOtherLiabilityBreakCostNodeModule(new OtherLiabilityBreakCostNodeModule(this)).build();
    }

    private RuleProvider<OtherLiabilityBreakCostNode> getRuleProvider() {
        return component.getOtherLiabilityBreakCostNodeRuleProvider();
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

    private RuleProvider<OtherLiabilityBreakCostNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
