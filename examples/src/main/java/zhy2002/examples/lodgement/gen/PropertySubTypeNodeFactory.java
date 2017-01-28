package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class PropertySubTypeNodeFactory implements ChildNodeFactory<PropertySubTypeNode, PropertyNode> {

    @Override
    public PropertySubTypeNode create(PropertyNode parent, String name) {
        return new PropertySubTypeNode(parent, name);
    }
}
