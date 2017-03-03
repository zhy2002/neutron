package zhy2002.examples.lodgement.gen.event;

import zhy2002.examples.lodgement.gen.node.OtherIncomeNode;
import zhy2002.neutron.NodeRemoveEvent;


public class OtherIncomeNodeRemoveEvent extends NodeRemoveEvent<OtherIncomeNode> {
    public OtherIncomeNodeRemoveEvent(OtherIncomeNode target) {
        super(target);
    }
}