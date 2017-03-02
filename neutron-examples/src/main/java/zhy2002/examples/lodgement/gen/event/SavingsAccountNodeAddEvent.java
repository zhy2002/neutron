package zhy2002.examples.lodgement.gen.event;

import zhy2002.examples.lodgement.gen.node.SavingsAccountNode;
import zhy2002.neutron.NodeAddEvent;


public class SavingsAccountNodeAddEvent extends NodeAddEvent<SavingsAccountNode> {

    public SavingsAccountNodeAddEvent(SavingsAccountNode target) {
        super(target);
    }
}
