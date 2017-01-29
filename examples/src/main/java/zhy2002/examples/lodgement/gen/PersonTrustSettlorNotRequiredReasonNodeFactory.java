package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class PersonTrustSettlorNotRequiredReasonNodeFactory implements ChildNodeFactory<PersonTrustSettlorNotRequiredReasonNode, PersonTrustNode> {

    @Override
    public PersonTrustSettlorNotRequiredReasonNode create(PersonTrustNode parent, String name) {
        return new PersonTrustSettlorNotRequiredReasonNode(parent, name);
    }
}
