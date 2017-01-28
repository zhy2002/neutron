package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class PropertyNodeFactory implements ChildNodeFactory<PropertyNode, RealEstateNode> {

    @Override
    public PropertyNode create(RealEstateNode parent, String name) {
        return new PropertyNode(parent, name);
    }
}
