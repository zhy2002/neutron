package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class PersonTrustAddressNodeFactory implements ChildNodeFactory<PersonTrustAddressNode, PersonTrustNode> {

    @Override
    public PersonTrustAddressNode create(PersonTrustNode parent, String name) {
        return new PersonTrustAddressNode(parent, name);
    }
}
