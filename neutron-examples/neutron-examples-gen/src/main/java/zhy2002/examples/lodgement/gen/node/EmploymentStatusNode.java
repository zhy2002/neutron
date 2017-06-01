package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.EmploymentStatusNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class EmploymentStatusNode extends StringUiNode<EmployedNode> {

    @Inject
    public EmploymentStatusNode(@Owner EmployedNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return EmploymentStatusNode.class;
    }

    protected final EmploymentStatusNodeComponent getComponent() {
        return component;
    }


    private EmploymentStatusNodeComponent component;

    @Inject
    void createComponent(EmploymentStatusNodeComponent.Builder builder) {
        this.component = builder.setEmploymentStatusNodeModule(new EmploymentStatusNodeModule(this)).build();
    }

    private RuleProvider<EmploymentStatusNode> getRuleProvider() {
        return component.getEmploymentStatusNodeRuleProvider();
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

    private RuleProvider<EmploymentStatusNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
