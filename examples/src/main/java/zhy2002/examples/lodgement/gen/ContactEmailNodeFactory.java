package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class ContactEmailNodeFactory implements ChildNodeFactory<ContactEmailNode, ContactNode> {

    @Override
    public ContactEmailNode create(ContactNode parent, String name) {
        return new ContactEmailNode(parent, name);
    }
}
