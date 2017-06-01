package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.StudentTypeNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class StudentTypeNode extends StringUiNode<UnemployedNode> {

    @Inject
    public StudentTypeNode(@Owner UnemployedNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return StudentTypeNode.class;
    }

    protected final StudentTypeNodeComponent getComponent() {
        return component;
    }


    private StudentTypeNodeComponent component;

    @Inject
    void createComponent(StudentTypeNodeComponent.Builder builder) {
        this.component = builder.setStudentTypeNodeModule(new StudentTypeNodeModule(this)).build();
    }

    private RuleProvider<StudentTypeNode> getRuleProvider() {
        return component.getStudentTypeNodeRuleProvider();
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

    private RuleProvider<StudentTypeNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
