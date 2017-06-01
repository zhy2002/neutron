package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class AgeOfDependantsNode extends ObjectUiNode<PersonGeneralNode> {

    private AgeOfDependantsNodeComponent component;

    @Inject
    public AgeOfDependantsNode(@Owner PersonGeneralNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return AgeOfDependantsNode.class;
    }

    @Inject
    void createComponent(AgeOfDependantsNodeComponent.Builder builder) {
        this.component = builder.setAgeOfDependantsNodeModule(new AgeOfDependantsNodeModule(this)).build();
    }

    private RuleProvider<AgeOfDependantsNode> getRuleProvider() {
        return component.getAgeOfDependantsNodeRuleProvider();
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

    private RuleProvider<AgeOfDependantsNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
