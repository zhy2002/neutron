package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class UsageNodeFactory implements ChildNodeFactory<UsageNode, RealEstateNode> {

    @Override
    public UsageNode create(RealEstateNode parent, String name) {
        return new UsageNode(parent, name);
    }
}
