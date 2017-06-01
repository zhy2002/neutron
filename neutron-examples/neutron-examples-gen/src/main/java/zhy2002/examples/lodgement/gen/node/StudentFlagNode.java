package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class StudentFlagNode extends YesNoOptionNode<UnemployedNode> {

    private StudentFlagNodeComponent component;

    @Inject
    public StudentFlagNode(@Owner UnemployedNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return StudentFlagNode.class;
    }

    @Inject
    void createComponent(StudentFlagNodeComponent.Builder builder) {
        this.component = builder.setStudentFlagNodeModule(new StudentFlagNodeModule(this)).build();
    }

    private RuleProvider<StudentFlagNode> getRuleProvider() {
        return component.getStudentFlagNodeRuleProvider();
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

    private RuleProvider<StudentFlagNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
