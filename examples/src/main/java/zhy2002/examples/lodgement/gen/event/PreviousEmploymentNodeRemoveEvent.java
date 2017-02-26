package zhy2002.examples.lodgement.gen.event;

import zhy2002.examples.lodgement.gen.node.PreviousEmploymentNode;
import zhy2002.neutron.NodeRemoveEvent;


public class PreviousEmploymentNodeRemoveEvent extends NodeRemoveEvent<PreviousEmploymentNode> {
    public PreviousEmploymentNodeRemoveEvent(PreviousEmploymentNode target) {
        super(target);
    }
}