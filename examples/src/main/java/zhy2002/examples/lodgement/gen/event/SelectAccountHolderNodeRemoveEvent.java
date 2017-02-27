package zhy2002.examples.lodgement.gen.event;

import zhy2002.examples.lodgement.gen.node.SelectAccountHolderNode;
import zhy2002.neutron.NodeRemoveEvent;


public class SelectAccountHolderNodeRemoveEvent extends NodeRemoveEvent<SelectAccountHolderNode> {
    public SelectAccountHolderNodeRemoveEvent(SelectAccountHolderNode target) {
        super(target);
    }
}