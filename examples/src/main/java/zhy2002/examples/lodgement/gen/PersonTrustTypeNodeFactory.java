package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class PersonTrustTypeNodeFactory implements ChildNodeFactory<PersonTrustTypeNode, PersonTrustNode> {

    @Override
    public PersonTrustTypeNode create(PersonTrustNode parent, String name) {
        return new PersonTrustTypeNode(parent, name);
    }
}
