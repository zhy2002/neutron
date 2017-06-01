package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class NextOfKinNode extends ReferenceUiNode<PersonGeneralNode> {

    private NextOfKinNodeComponent component;

    @Inject
    public NextOfKinNode(@Owner PersonGeneralNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return NextOfKinNode.class;
    }

    @Inject
    void createComponent(NextOfKinNodeComponent.Builder builder) {
        this.component = builder.setNextOfKinNodeModule(new NextOfKinNodeModule(this)).build();
    }

    private RuleProvider<NextOfKinNode> getRuleProvider() {
        return component.getNextOfKinNodeRuleProvider();
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

    private RuleProvider<NextOfKinNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
