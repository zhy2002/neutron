package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class PropertyTypeNodeFactory implements ChildNodeFactory<PropertyTypeNode, PropertyNode> {

    @Override
    public PropertyTypeNode create(PropertyNode parent, String name) {
        return new PropertyTypeNode(parent, name);
    }
}
