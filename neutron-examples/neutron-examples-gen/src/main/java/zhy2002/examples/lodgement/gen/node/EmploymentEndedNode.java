package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class EmploymentEndedNode extends MonthYearNode<EmployedNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return EmploymentEndedNode.class;
    }

    private EmploymentEndedNodeComponent component;

    @Inject
    void createComponent(EmploymentEndedNodeComponent.Builder builder) {
        this.component = builder.setEmploymentEndedNodeModule(new EmploymentEndedNodeModule(this)).build();
    }

    private EmploymentEndedNodeRuleProvider getRuleProvider() {
        return component.getEmploymentEndedNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public EmploymentEndedNode(@NotNull EmployedNode parent, String name) {
        super(parent, name);
    }

}
