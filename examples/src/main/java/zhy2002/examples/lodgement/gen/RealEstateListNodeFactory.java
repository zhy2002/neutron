package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class RealEstateListNodeFactory implements ChildNodeFactory<RealEstateListNode, ApplicationNode> {

    @Override
    public RealEstateListNode create(ApplicationNode parent, String name) {
        return new RealEstateListNode(parent, name);
    }
}
