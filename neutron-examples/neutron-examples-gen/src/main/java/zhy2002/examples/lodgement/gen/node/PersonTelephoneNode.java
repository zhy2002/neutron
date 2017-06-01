package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.PersonTelephoneNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class PersonTelephoneNode extends TelephoneNode<PersonContactNode> {

    @Inject
    public PersonTelephoneNode(@Owner PersonContactNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return PersonTelephoneNode.class;
    }

    protected final PersonTelephoneNodeComponent getComponent() {
        return component;
    }


    private PersonTelephoneNodeComponent component;

    @Inject
    void createComponent(PersonTelephoneNodeComponent.Builder builder) {
        this.component = builder.setPersonTelephoneNodeModule(new PersonTelephoneNodeModule(this)).build();
    }

    private RuleProvider<PersonTelephoneNode> getRuleProvider() {
        return component.getPersonTelephoneNodeRuleProvider();
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

    private RuleProvider<PersonTelephoneNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
