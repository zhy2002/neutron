package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class EmploymentStartedNode extends MonthYearNode<EmployedNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return EmploymentStartedNode.class;
    }

    private EmploymentStartedNodeComponent component;

    @Inject
    void createComponent(EmploymentStartedNodeComponent.Builder builder) {
        this.component = builder.setEmploymentStartedNodeModule(new EmploymentStartedNodeModule(this)).build();
    }

    private RuleProvider<EmploymentStartedNode> getRuleProvider() {
        return component.getEmploymentStartedNodeRuleProvider();
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

    private RuleProvider<EmploymentStartedNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }


    public EmploymentStartedNode(@NotNull EmployedNode parent, String name) {
        super(parent, name);
    }

}
