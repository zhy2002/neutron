package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class EstimatedMarketValueNodeFactory implements ChildNodeFactory<EstimatedMarketValueNode, PropertyNode> {

    @Override
    public EstimatedMarketValueNode create(PropertyNode parent, String name) {
        return new EstimatedMarketValueNode(parent, name);
    }
}
