package zhy2002.examples.lodgement.gen.event;

import zhy2002.examples.lodgement.gen.node.CurrentEmploymentNode;
import zhy2002.neutron.NodeAddEvent;


public class CurrentEmploymentNodeAddEvent extends NodeAddEvent<CurrentEmploymentNode> {

    public CurrentEmploymentNodeAddEvent(CurrentEmploymentNode target) {
        super(target);
    }
}
