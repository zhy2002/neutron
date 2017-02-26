package zhy2002.examples.lodgement.gen.event;

import zhy2002.examples.lodgement.gen.node.CreditCardNode;
import zhy2002.neutron.NodeRemoveEvent;


public class CreditCardNodeRemoveEvent extends NodeRemoveEvent<CreditCardNode> {
    public CreditCardNodeRemoveEvent(CreditCardNode target) {
        super(target);
    }
}