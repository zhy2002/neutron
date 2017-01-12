package zhy2002.examples.lodgement.gen.event;

import zhy2002.examples.lodgement.gen.CurrentEmploymentNode;
import zhy2002.neutron.NodeRemoveEvent;


public class CurrentEmploymentNodeRemoveEvent extends NodeRemoveEvent<CurrentEmploymentNode> {
    public CurrentEmploymentNodeRemoveEvent(CurrentEmploymentNode target) {
        super(target);
    }
}