package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class PersonTelephoneNode extends TelephoneNode<PersonContactNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return PersonTelephoneNode.class;
    }

    private PersonTelephoneNodeComponent component;

    @Inject
    void createComponent(PersonTelephoneNodeComponent.Builder builder) {
        this.component = builder.setPersonTelephoneNodeModule(new PersonTelephoneNodeModule(this)).build();
    }

    @Override
    protected PersonTelephoneNodeRuleProvider getRuleProvider() {
        return component.getPersonTelephoneNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public PersonTelephoneNode(@NotNull PersonContactNode parent, String name) {
        super(parent, name);
    }

}
