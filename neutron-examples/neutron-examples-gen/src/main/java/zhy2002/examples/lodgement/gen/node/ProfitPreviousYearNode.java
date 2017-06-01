package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class ProfitPreviousYearNode extends BigDecimalUiNode<SelfEmployedNode> {

    private ProfitPreviousYearNodeComponent component;

    @Inject
    public ProfitPreviousYearNode(@Owner SelfEmployedNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProfitPreviousYearNode.class;
    }

    @Inject
    void createComponent(ProfitPreviousYearNodeComponent.Builder builder) {
        this.component = builder.setProfitPreviousYearNodeModule(new ProfitPreviousYearNodeModule(this)).build();
    }

    private RuleProvider<ProfitPreviousYearNode> getRuleProvider() {
        return component.getProfitPreviousYearNodeRuleProvider();
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

    private RuleProvider<ProfitPreviousYearNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
