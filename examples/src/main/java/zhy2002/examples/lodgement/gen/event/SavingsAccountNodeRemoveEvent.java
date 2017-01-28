package zhy2002.examples.lodgement.gen.event;

import zhy2002.examples.lodgement.gen.SavingsAccountNode;
import zhy2002.neutron.NodeRemoveEvent;


public class SavingsAccountNodeRemoveEvent extends NodeRemoveEvent<SavingsAccountNode> {
    public SavingsAccountNodeRemoveEvent(SavingsAccountNode target) {
        super(target);
    }
}