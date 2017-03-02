package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class CurrentEmploymentNode extends EmploymentNode<CurrentEmploymentListNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return CurrentEmploymentNode.class;
    }

    private CurrentEmploymentNodeComponent component;

    @Inject
    void createComponent(CurrentEmploymentNodeComponent.Builder builder) {
        this.component = builder.setCurrentEmploymentNodeModule(new CurrentEmploymentNodeModule(this)).build();
    }

    @Override
    protected CurrentEmploymentNodeRuleProvider getRuleProvider() {
        return component.getCurrentEmploymentNodeRuleProvider();
    }

    public CurrentEmploymentNode(@NotNull CurrentEmploymentListNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setNodeLabel("Employment");
    }

}
