package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class OtherLiabilityTypeNodeFactory implements ChildNodeFactory<OtherLiabilityTypeNode, OtherLiabilityNode> {

    @Override
    public OtherLiabilityTypeNode create(OtherLiabilityNode parent, String name) {
        return new OtherLiabilityTypeNode(parent, name);
    }
}
