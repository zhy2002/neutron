package zhy2002.examples.register.gen;

import zhy2002.neutron.*;

public class PropertyAddressNodeFactory implements ChildNodeFactory<PropertyAddressNode, PropertyDetailsNode> {

    @Override
    public PropertyAddressNode create(PropertyDetailsNode parent, String name) {
        return new PropertyAddressNode(parent, name);
    }
}
