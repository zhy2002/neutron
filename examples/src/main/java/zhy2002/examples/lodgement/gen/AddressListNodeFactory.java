package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class AddressListNodeFactory implements ChildNodeFactory<AddressListNode, ApplicationNode> {

    @Override
    public AddressListNode create(ApplicationNode parent, String name) {
        return new AddressListNode(parent, name);
    }
}
