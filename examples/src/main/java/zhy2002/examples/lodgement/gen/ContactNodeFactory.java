package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.ChildNodeFactory;

public class ContactNodeFactory implements ChildNodeFactory<ContactNode, PersonNode> {

    @Override
    public ContactNode create(PersonNode parent, String name) {
        return new ContactNode(parent, name);
    }
}
