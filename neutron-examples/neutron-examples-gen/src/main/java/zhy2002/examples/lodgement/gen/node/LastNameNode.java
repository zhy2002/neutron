package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.LastNameNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class LastNameNode extends StringUiNode<PersonGeneralNode> {

    @Inject
    public LastNameNode(@Owner PersonGeneralNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return LastNameNode.class;
    }

    protected final LastNameNodeComponent getComponent() {
        return component;
    }


    private LastNameNodeComponent component;

    @Inject
    void createComponent(LastNameNodeComponent.Builder builder) {
        this.component = builder.setLastNameNodeModule(new LastNameNodeModule(this)).build();
    }

    private RuleProvider<LastNameNode> getRuleProvider() {
        return component.getLastNameNodeRuleProvider();
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

    private RuleProvider<LastNameNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
