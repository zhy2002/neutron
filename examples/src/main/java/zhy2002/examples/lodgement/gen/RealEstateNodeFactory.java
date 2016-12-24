package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.ChildNodeFactory;

public class RealEstateNodeFactory implements ChildNodeFactory<RealEstateNode, RealEstateListNode> {

    @Override
    public RealEstateNode create(RealEstateListNode parent, String name) {
        return new RealEstateNode(parent, name);
    }
}
