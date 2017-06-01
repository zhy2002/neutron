package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.StudentFlagNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class StudentFlagNode extends YesNoOptionNode<UnemployedNode> {

    @Inject
    public StudentFlagNode(@Owner UnemployedNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return StudentFlagNode.class;
    }

    protected final StudentFlagNodeComponent getComponent() {
        return component;
    }


    private StudentFlagNodeComponent component;

    @Inject
    void createComponent(StudentFlagNodeComponent.Builder builder) {
        this.component = builder.setStudentFlagNodeModule(new StudentFlagNodeModule(this)).build();
    }

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

}
