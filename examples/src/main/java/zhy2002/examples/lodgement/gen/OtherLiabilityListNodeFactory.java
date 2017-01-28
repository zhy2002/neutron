package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class OtherLiabilityListNodeFactory implements ChildNodeFactory<OtherLiabilityListNode, LiabilitiesNode> {

    @Override
    public OtherLiabilityListNode create(LiabilitiesNode parent, String name) {
        return new OtherLiabilityListNode(parent, name);
    }
}
