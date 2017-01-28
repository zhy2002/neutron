package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class PersonPrivacyNodeFactory implements ChildNodeFactory<PersonPrivacyNode, PersonNode> {

    @Override
    public PersonPrivacyNode create(PersonNode parent, String name) {
        return new PersonPrivacyNode(parent, name);
    }
}
