package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class ContactTelephoneNodeFactory implements ChildNodeFactory<ContactTelephoneNode, PersonContactNode> {

    @Override
    public ContactTelephoneNode create(PersonContactNode parent, String name) {
        return new ContactTelephoneNode(parent, name);
    }
}
