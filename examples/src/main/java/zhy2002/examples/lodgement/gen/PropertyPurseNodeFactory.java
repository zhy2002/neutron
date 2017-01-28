package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class PropertyPurseNodeFactory implements ChildNodeFactory<PropertyPurseNode, PropertyNode> {

    @Override
    public PropertyPurseNode create(PropertyNode parent, String name) {
        return new PropertyPurseNode(parent, name);
    }
}
