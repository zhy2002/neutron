package zhy2002.examples.lodgement.gen.event;

import zhy2002.examples.lodgement.gen.node.AddressRefUiNode;
import zhy2002.neutron.NodeRemoveEvent;


public class AddressRefUiNodeRemoveEvent extends NodeRemoveEvent<AddressRefUiNode> {
    public AddressRefUiNodeRemoveEvent(AddressRefUiNode target) {
        super(target);
    }
}