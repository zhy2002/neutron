package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class SuburbNodeFactory implements ChildNodeFactory<SuburbNode, AddressNode<?>> {

    @Override
    public SuburbNode create(AddressNode<?> parent, String name) {
        return new SuburbNode(parent, name);
    }
}
