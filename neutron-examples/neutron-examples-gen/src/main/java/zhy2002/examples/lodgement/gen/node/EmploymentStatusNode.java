package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class EmploymentStatusNode extends StringUiNode<EmployedNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return EmploymentStatusNode.class;
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

    public EmploymentStatusNode(@NotNull EmployedNode parent, String name) {
        super(parent, name);
    }

}
