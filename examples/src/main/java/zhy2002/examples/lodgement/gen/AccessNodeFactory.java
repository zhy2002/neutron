package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class AccessNodeFactory implements ChildNodeFactory<AccessNode, RealEstateNode> {

    @Override
    public AccessNode create(RealEstateNode parent, String name) {
        return new AccessNode(parent, name);
    }
}
