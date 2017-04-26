package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

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

    private RuleProvider<CurrentEmploymentNode> getRuleProvider() {
        return component.getCurrentEmploymentNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public CurrentEmploymentNode(@NotNull CurrentEmploymentListNode parent, String name) {
        super(parent, name);
    }

}
