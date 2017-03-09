package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class OtherLiabilityBreakCostNode extends BaseCurrencyNode<OtherLiabilityNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return OtherLiabilityBreakCostNode.class;
    }

    private OtherLiabilityBreakCostNodeComponent component;

    @Inject
    void createComponent(OtherLiabilityBreakCostNodeComponent.Builder builder) {
        this.component = builder.setOtherLiabilityBreakCostNodeModule(new OtherLiabilityBreakCostNodeModule(this)).build();
    }

    private OtherLiabilityBreakCostNodeRuleProvider getRuleProvider() {
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

    public OtherLiabilityBreakCostNode(@NotNull OtherLiabilityNode parent, String name) {
        super(parent, name);
    }

}
