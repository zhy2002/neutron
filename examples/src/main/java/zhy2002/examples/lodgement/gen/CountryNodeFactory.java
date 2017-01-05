package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class CountryNodeFactory implements ChildNodeFactory<CountryNode, AddressNode<?>> {

    @Override
    public CountryNode create(AddressNode<?> parent, String name) {
        return new CountryNode(parent, name);
    }
}
