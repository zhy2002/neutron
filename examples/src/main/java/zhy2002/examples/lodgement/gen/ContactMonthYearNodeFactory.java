package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class ContactMonthYearNodeFactory implements ChildNodeFactory<ContactMonthYearNode, PersonContactNode> {

    @Override
    public ContactMonthYearNode create(PersonContactNode parent, String name) {
        return new ContactMonthYearNode(parent, name);
    }
}
