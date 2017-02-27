package zhy2002.examples.lodgement.gen.event;

import zhy2002.examples.lodgement.gen.node.AddressRefNode;
import zhy2002.neutron.NodeRemoveEvent;


public class AddressRefNodeRemoveEvent extends NodeRemoveEvent<AddressRefNode> {
    public AddressRefNodeRemoveEvent(AddressRefNode target) {
        super(target);
    }
}