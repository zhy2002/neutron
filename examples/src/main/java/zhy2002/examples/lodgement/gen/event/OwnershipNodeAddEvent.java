package zhy2002.examples.lodgement.gen.event;

import zhy2002.examples.lodgement.gen.node.OwnershipNode;
import zhy2002.neutron.NodeAddEvent;


public class OwnershipNodeAddEvent extends NodeAddEvent<OwnershipNode> {

    public OwnershipNodeAddEvent(OwnershipNode target) {
        super(target);
    }
}
