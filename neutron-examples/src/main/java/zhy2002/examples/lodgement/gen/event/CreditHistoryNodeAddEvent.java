package zhy2002.examples.lodgement.gen.event;

import zhy2002.examples.lodgement.gen.node.CreditHistoryNode;
import zhy2002.neutron.NodeAddEvent;


public class CreditHistoryNodeAddEvent extends NodeAddEvent<CreditHistoryNode> {

    public CreditHistoryNodeAddEvent(CreditHistoryNode target) {
        super(target);
    }
}
