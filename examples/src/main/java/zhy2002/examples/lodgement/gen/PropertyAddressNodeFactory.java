package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class PropertyAddressNodeFactory implements ChildNodeFactory<PropertyAddressNode, PropertyNode> {

    @Override
    public PropertyAddressNode create(PropertyNode parent, String name) {
        return new PropertyAddressNode(parent, name);
    }
}
