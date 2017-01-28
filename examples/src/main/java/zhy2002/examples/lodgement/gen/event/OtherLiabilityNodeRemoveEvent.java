package zhy2002.examples.lodgement.gen.event;

import zhy2002.examples.lodgement.gen.OtherLiabilityNode;
import zhy2002.neutron.NodeRemoveEvent;


public class OtherLiabilityNodeRemoveEvent extends NodeRemoveEvent<OtherLiabilityNode> {
    public OtherLiabilityNodeRemoveEvent(OtherLiabilityNode target) {
        super(target);
    }
}