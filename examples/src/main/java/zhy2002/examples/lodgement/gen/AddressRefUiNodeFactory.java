package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class AddressRefUiNodeFactory implements ChildNodeFactory<AddressRefUiNode, AddressListNode> {

    @Override
    public AddressRefUiNode create(AddressListNode parent, String name) {
        return new AddressRefUiNode(parent, name);
    }
}
