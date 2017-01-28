package zhy2002.examples.lodgement.gen.event;

import zhy2002.examples.lodgement.gen.CreditCardNode;
import zhy2002.neutron.NodeAddEvent;


public class CreditCardNodeAddEvent extends NodeAddEvent<CreditCardNode> {

    public CreditCardNodeAddEvent(CreditCardNode target) {
        super(target);
    }
}
