package zhy2002.examples.lodgement.gen.event;

import zhy2002.examples.lodgement.gen.node.RealEstateNode;
import zhy2002.neutron.NodeRemoveEvent;


public class RealEstateNodeRemoveEvent extends NodeRemoveEvent<RealEstateNode> {
    public RealEstateNodeRemoveEvent(RealEstateNode target) {
        super(target);
    }
}