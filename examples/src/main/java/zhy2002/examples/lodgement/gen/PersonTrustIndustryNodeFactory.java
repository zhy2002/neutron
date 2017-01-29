package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class PersonTrustIndustryNodeFactory implements ChildNodeFactory<PersonTrustIndustryNode, PersonTrustNode> {

    @Override
    public PersonTrustIndustryNode create(PersonTrustNode parent, String name) {
        return new PersonTrustIndustryNode(parent, name);
    }
}
