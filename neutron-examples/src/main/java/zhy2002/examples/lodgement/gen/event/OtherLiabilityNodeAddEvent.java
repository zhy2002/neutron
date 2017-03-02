package zhy2002.examples.lodgement.gen.event;

import zhy2002.examples.lodgement.gen.node.OtherLiabilityNode;
import zhy2002.neutron.NodeAddEvent;


public class OtherLiabilityNodeAddEvent extends NodeAddEvent<OtherLiabilityNode> {

    public OtherLiabilityNodeAddEvent(OtherLiabilityNode target) {
        super(target);
    }
}
