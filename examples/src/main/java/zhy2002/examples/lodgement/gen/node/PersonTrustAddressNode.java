package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class PersonTrustAddressNode extends AddressNode<PersonTrustNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return PersonTrustAddressNode.class;
    }

    private PersonTrustAddressNodeComponent component;

    @Inject
    void createComponent(PersonTrustAddressNodeComponent.Builder builder) {
        this.component = builder.setPersonTrustAddressNodeModule(new PersonTrustAddressNodeModule(this)).build();
    }

    @Override
    protected PersonTrustAddressNodeRuleProvider getRuleProvider() {
        return component.getPersonTrustAddressNodeRuleProvider();
    }

    public PersonTrustAddressNode(@NotNull PersonTrustNode parent, String name) {
        super(parent, name);
    }

}