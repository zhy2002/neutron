package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class OtherLiabilityMarketValueNodeFactory implements ChildNodeFactory<OtherLiabilityMarketValueNode, OtherLiabilityNode> {

    @Override
    public OtherLiabilityMarketValueNode create(OtherLiabilityNode parent, String name) {
        return new OtherLiabilityMarketValueNode(parent, name);
    }
}
