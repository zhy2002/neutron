package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class AddressLineNodeFactory implements ChildNodeFactory<AddressLineNode, AddressNode<?>> {

    @Override
    public AddressLineNode create(AddressNode<?> parent, String name) {
        return new AddressLineNode(parent, name);
    }
}
