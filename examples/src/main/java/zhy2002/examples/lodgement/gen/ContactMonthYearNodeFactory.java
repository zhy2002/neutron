package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class ContactMonthYearNodeFactory implements ChildNodeFactory<ContactMonthYearNode, ContactNode> {

    @Override
    public ContactMonthYearNode create(ContactNode parent, String name) {
        return new ContactMonthYearNode(parent, name);
    }
}
