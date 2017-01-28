package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class ContactAddressNodeFactory implements ChildNodeFactory<ContactAddressNode, PersonContactNode> {

    @Override
    public ContactAddressNode create(PersonContactNode parent, String name) {
        return new ContactAddressNode(parent, name);
    }
}
