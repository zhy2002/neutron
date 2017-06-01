package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.EmploymentEndedNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class EmploymentEndedNode extends MonthYearNode<EmployedNode> {

    @Inject
    public EmploymentEndedNode(@Owner EmployedNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return EmploymentEndedNode.class;
    }

    protected final EmploymentEndedNodeComponent getComponent() {
        return component;
    }


    private EmploymentEndedNodeComponent component;

    @Inject
    void createComponent(EmploymentEndedNodeComponent.Builder builder) {
        this.component = builder.setEmploymentEndedNodeModule(new EmploymentEndedNodeModule(this)).build();
    }

    private RuleProvider<EmploymentEndedNode> getRuleProvider() {
        return component.getEmploymentEndedNodeRuleProvider();
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

    private RuleProvider<EmploymentEndedNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
