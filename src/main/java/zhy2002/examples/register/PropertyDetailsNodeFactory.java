package zhy2002.examples.register;

import zhy2002.neutron.ChildNodeFactory;

public class PropertyDetailsNodeFactory implements ChildNodeFactory<PropertyDetailsNode, RegisterNode> {

    @Override
    public PropertyDetailsNode create(RegisterNode parent, String name) {
        return new PropertyDetailsNode(parent, name);
    }
}
