package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class PersonAddressNode extends AddressNode<PersonContactNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return PersonAddressNode.class;
    }

    private PersonAddressNodeComponent component;

    @Inject
    void createComponent(PersonAddressNodeComponent.Builder builder) {
        this.component = builder.setPersonAddressNodeModule(new PersonAddressNodeModule(this)).build();
    }

    @Override
    protected PersonAddressNodeRuleProvider getRuleProvider() {
        return component.getPersonAddressNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public PersonAddressNode(@NotNull PersonContactNode parent, String name) {
        super(parent, name);
    }

}
