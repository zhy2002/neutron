package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.FirstNameNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class FirstNameNode extends StringUiNode<PersonGeneralNode> {

    @Inject
    public FirstNameNode(@Owner PersonGeneralNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return FirstNameNode.class;
    }

    protected final FirstNameNodeComponent getComponent() {
        return component;
    }


    private FirstNameNodeComponent component;

    @Inject
    void createComponent(FirstNameNodeComponent.Builder builder) {
        this.component = builder.setFirstNameNodeModule(new FirstNameNodeModule(this)).build();
    }

    private RuleProvider<FirstNameNode> getRuleProvider() {
        return component.getFirstNameNodeRuleProvider();
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

    private RuleProvider<FirstNameNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
