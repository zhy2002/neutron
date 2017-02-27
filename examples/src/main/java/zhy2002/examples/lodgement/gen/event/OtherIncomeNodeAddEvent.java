package zhy2002.examples.lodgement.gen.event;

import zhy2002.examples.lodgement.gen.node.OtherIncomeNode;
import zhy2002.neutron.NodeAddEvent;


public class OtherIncomeNodeAddEvent extends NodeAddEvent<OtherIncomeNode> {

    public OtherIncomeNodeAddEvent(OtherIncomeNode target) {
        super(target);
    }
}
