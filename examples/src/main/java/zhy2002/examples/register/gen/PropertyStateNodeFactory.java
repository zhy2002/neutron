package zhy2002.examples.register.gen;

import zhy2002.neutron.*;

public class PropertyStateNodeFactory implements ChildNodeFactory<PropertyStateNode, PropertyDetailsNode> {

    @Override
    public PropertyStateNode create(PropertyDetailsNode parent, String name) {
        return new PropertyStateNode(parent, name);
    }
}
