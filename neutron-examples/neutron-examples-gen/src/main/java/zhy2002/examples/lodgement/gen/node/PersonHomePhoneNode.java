package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class PersonHomePhoneNode extends TelephoneNode<PersonContactNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return PersonHomePhoneNode.class;
    }

    private PersonHomePhoneNodeComponent component;

    @Inject
    void createComponent(PersonHomePhoneNodeComponent.Builder builder) {
        this.component = builder.setPersonHomePhoneNodeModule(new PersonHomePhoneNodeModule(this)).build();
    }

    @Override
    protected PersonHomePhoneNodeRuleProvider getRuleProvider() {
        return component.getPersonHomePhoneNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public PersonHomePhoneNode(@NotNull PersonContactNode parent, String name) {
        super(parent, name);
    }

}
