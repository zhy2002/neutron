package zhy2002.examples.lodgement.gen.event;

import zhy2002.examples.lodgement.gen.node.AddressRefNode;
import zhy2002.neutron.NodeAddEvent;


public class AddressRefNodeAddEvent extends NodeAddEvent<AddressRefNode> {

    public AddressRefNodeAddEvent(AddressRefNode target) {
        super(target);
    }
}
