package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.PersonTrustNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class PersonTrustNode extends BaseTrustNode<PersonNode> {

    @Inject
    public PersonTrustNode(@Owner PersonNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return PersonTrustNode.class;
    }

    protected final PersonTrustNodeComponent getComponent() {
        return component;
    }


    private PersonTrustNodeComponent component;

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
