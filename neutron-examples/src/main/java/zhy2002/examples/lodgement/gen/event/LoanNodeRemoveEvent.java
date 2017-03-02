package zhy2002.examples.lodgement.gen.event;

import zhy2002.examples.lodgement.gen.node.LoanNode;
import zhy2002.neutron.NodeRemoveEvent;


public class LoanNodeRemoveEvent extends NodeRemoveEvent<LoanNode> {
    public LoanNodeRemoveEvent(LoanNode target) {
        super(target);
    }
}