package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;

public class PersonTrustAddressNode extends AddressNode<PersonTrustNode>
{
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

    public PersonTrustAddressNode(PersonTrustNode parent, String name) {
        super(parent, name);
    }

}
