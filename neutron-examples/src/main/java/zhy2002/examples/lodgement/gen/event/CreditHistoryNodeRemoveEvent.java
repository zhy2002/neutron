package zhy2002.examples.lodgement.gen.event;

import zhy2002.examples.lodgement.gen.node.CreditHistoryNode;
import zhy2002.neutron.NodeRemoveEvent;


public class CreditHistoryNodeRemoveEvent extends NodeRemoveEvent<CreditHistoryNode> {
    public CreditHistoryNodeRemoveEvent(CreditHistoryNode target) {
        super(target);
    }
}