package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class AgeOfDependantsNode extends ObjectUiNode<PersonGeneralNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return AgeOfDependantsNode.class;
    }

    private AgeOfDependantsNodeComponent component;

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


    public AgeOfDependantsNode(@NotNull PersonGeneralNode parent, String name) {
        super(parent, name);
    }

}