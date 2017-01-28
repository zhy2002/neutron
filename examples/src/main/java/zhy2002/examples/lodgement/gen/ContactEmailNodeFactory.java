package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class ContactEmailNodeFactory implements ChildNodeFactory<ContactEmailNode, PersonContactNode> {

    @Override
    public ContactEmailNode create(PersonContactNode parent, String name) {
        return new ContactEmailNode(parent, name);
    }
}
