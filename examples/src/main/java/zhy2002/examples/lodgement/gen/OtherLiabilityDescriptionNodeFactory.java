package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class OtherLiabilityDescriptionNodeFactory implements ChildNodeFactory<OtherLiabilityDescriptionNode, OtherLiabilityNode> {

    @Override
    public OtherLiabilityDescriptionNode create(OtherLiabilityNode parent, String name) {
        return new OtherLiabilityDescriptionNode(parent, name);
    }
}
