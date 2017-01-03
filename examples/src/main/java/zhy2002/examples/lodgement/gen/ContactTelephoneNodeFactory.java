package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class ContactTelephoneNodeFactory implements ChildNodeFactory<ContactTelephoneNode, ContactNode> {

    @Override
    public ContactTelephoneNode create(ContactNode parent, String name) {
        return new ContactTelephoneNode(parent, name);
    }
}
