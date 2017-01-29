package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class PersonTrustCountryNodeFactory implements ChildNodeFactory<PersonTrustCountryNode, PersonTrustNode> {

    @Override
    public PersonTrustCountryNode create(PersonTrustNode parent, String name) {
        return new PersonTrustCountryNode(parent, name);
    }
}
