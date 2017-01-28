package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class RentedFlagNodeFactory implements ChildNodeFactory<RentedFlagNode, PropertyNode> {

    @Override
    public RentedFlagNode create(PropertyNode parent, String name) {
        return new RentedFlagNode(parent, name);
    }
}
