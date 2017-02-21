package zhy2002.examples.lodgement.gen.event;

import zhy2002.examples.lodgement.gen.OwnershipNode;
import zhy2002.neutron.NodeRemoveEvent;


public class OwnershipNodeRemoveEvent extends NodeRemoveEvent<OwnershipNode> {
    public OwnershipNodeRemoveEvent(OwnershipNode target) {
        super(target);
    }
}