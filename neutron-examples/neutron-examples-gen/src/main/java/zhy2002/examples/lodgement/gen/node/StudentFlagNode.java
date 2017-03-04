package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class StudentFlagNode extends YesNoOptionNode<UnemployedNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return StudentFlagNode.class;
    }

    private StudentFlagNodeComponent component;

    @Inject
    void createComponent(StudentFlagNodeComponent.Builder builder) {
        this.component = builder.setStudentFlagNodeModule(new StudentFlagNodeModule(this)).build();
    }

    @Override
    protected StudentFlagNodeRuleProvider getRuleProvider() {
        return component.getStudentFlagNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public StudentFlagNode(@NotNull UnemployedNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setRequired(true);
    }

}
