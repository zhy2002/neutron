package zhy2002.examples.lodgement.gen.event;

import zhy2002.examples.lodgement.gen.PreviousEmploymentNode;
import zhy2002.neutron.NodeAddEvent;


public class PreviousEmploymentNodeAddEvent extends NodeAddEvent<PreviousEmploymentNode> {

    public PreviousEmploymentNodeAddEvent(PreviousEmploymentNode target) {
        super(target);
    }
}
