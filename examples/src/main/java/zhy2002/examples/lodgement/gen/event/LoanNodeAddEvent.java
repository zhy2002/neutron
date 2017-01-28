package zhy2002.examples.lodgement.gen.event;

import zhy2002.examples.lodgement.gen.LoanNode;
import zhy2002.neutron.NodeAddEvent;


public class LoanNodeAddEvent extends NodeAddEvent<LoanNode> {

    public LoanNodeAddEvent(LoanNode target) {
        super(target);
    }
}
