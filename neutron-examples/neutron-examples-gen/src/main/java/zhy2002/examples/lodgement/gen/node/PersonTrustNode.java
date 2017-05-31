package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class PersonTrustNode extends BaseTrustNode<PersonNode> {
    private PersonTrustNodeComponent component;

    public PersonTrustNode(@NotNull PersonNode parent, String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return PersonTrustNode.class;
    }

    @Inject
    void createComponent(PersonTrustNodeComponent.Builder builder) {
        this.component = builder.setPersonTrustNodeModule(new PersonTrustNodeModule(this)).build();
    }

    private RuleProvider<PersonTrustNode> getRuleProvider() {
        return component.getPersonTrustNodeRuleProvider();
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

    private RuleProvider<PersonTrustNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
