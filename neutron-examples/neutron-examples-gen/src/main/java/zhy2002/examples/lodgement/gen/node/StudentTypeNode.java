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
    protected StudentTypeNode(@Owner UnemployedNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
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

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

}
