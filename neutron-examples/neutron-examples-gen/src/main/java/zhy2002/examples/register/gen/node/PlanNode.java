package zhy2002.examples.register.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.register.data.*;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.examples.register.gen.di.*;
import java.util.List;

public class PlanNode extends StringUiNode<RegisterNode> {
    private PlanNodeComponent component;

    public PlanNode(@NotNull RegisterNode parent, String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return PlanNode.class;
    }

    @Inject
    void createComponent(PlanNodeComponent.Builder builder) {
        this.component = builder.setPlanNodeModule(new PlanNodeModule(this)).build();
    }

    private RuleProvider<PlanNode> getRuleProvider() {
        return component.getPlanNodeRuleProvider();
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

    private RuleProvider<PlanNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
