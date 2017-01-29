package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class PersonTrustRegistrationDateNodeFactory implements ChildNodeFactory<PersonTrustRegistrationDateNode, PersonTrustNode> {

    @Override
    public PersonTrustRegistrationDateNode create(PersonTrustNode parent, String name) {
        return new PersonTrustRegistrationDateNode(parent, name);
    }
}
