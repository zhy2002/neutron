package zhy2002.examples.lodgement.gen.event;

import zhy2002.examples.lodgement.gen.node.RealEstateNode;
import zhy2002.neutron.NodeAddEvent;


public class RealEstateNodeAddEvent extends NodeAddEvent<RealEstateNode> {

    public RealEstateNodeAddEvent(RealEstateNode target) {
        super(target);
    }
}
