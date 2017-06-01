package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.CurrentEmploymentNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class CurrentEmploymentNode extends EmploymentNode<CurrentEmploymentListNode> {

    @Inject
    public CurrentEmploymentNode(@Owner CurrentEmploymentListNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return CurrentEmploymentNode.class;
    }

    protected final CurrentEmploymentNodeComponent getComponent() {
        return component;
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

}
