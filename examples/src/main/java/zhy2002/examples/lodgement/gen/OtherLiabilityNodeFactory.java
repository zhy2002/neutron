package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class OtherLiabilityNodeFactory implements ChildNodeFactory<OtherLiabilityNode, OtherLiabilityListNode> {

    @Override
    public OtherLiabilityNode create(OtherLiabilityListNode parent, String name) {
        return new OtherLiabilityNode(parent, name);
    }
}
