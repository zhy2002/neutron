package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class PersonTrustNameNodeFactory implements ChildNodeFactory<PersonTrustNameNode, PersonTrustNode> {

    @Override
    public PersonTrustNameNode create(PersonTrustNode parent, String name) {
        return new PersonTrustNameNode(parent, name);
    }
}
