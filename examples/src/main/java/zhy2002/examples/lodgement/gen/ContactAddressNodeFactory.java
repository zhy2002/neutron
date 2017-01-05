package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class ContactAddressNodeFactory implements ChildNodeFactory<ContactAddressNode, ContactNode> {

    @Override
    public ContactAddressNode create(ContactNode parent, String name) {
        return new ContactAddressNode(parent, name);
    }
}
