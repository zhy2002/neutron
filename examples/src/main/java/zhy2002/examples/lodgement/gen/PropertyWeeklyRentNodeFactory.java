package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class PropertyWeeklyRentNodeFactory implements ChildNodeFactory<PropertyWeeklyRentNode, PropertyNode> {

    @Override
    public PropertyWeeklyRentNode create(PropertyNode parent, String name) {
        return new PropertyWeeklyRentNode(parent, name);
    }
}
