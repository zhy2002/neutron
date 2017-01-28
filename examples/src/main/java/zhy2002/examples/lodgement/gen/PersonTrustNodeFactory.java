package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class PersonTrustNodeFactory implements ChildNodeFactory<PersonTrustNode, PersonNode> {

    @Override
    public PersonTrustNode create(PersonNode parent, String name) {
        return new PersonTrustNode(parent, name);
    }
}
