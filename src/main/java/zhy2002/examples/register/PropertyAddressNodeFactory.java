package zhy2002.examples.register;

import zhy2002.neutron.ChildNodeFactory;

public class PropertyAddressNodeFactory extends ChildNodeFactory<PropertyAddressNode, PropertyDetailsNode> {
    @Override
    public PropertyAddressNode create(PropertyDetailsNode parent, String name) {
        return new PropertyAddressNode(parent, name);
    }
}
