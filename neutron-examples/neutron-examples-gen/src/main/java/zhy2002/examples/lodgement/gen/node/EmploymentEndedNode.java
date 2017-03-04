package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


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

    @Override
    protected EmploymentEndedNodeRuleProvider getRuleProvider() {
        return component.getEmploymentEndedNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public EmploymentEndedNode(@NotNull EmployedNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setRequired(true);
    }

}
