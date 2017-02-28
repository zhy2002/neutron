package zhy2002.examples.lodgement.gen.event;

import zhy2002.examples.lodgement.gen.node.SelectRelatedPersonNode;
import zhy2002.neutron.NodeAddEvent;


public class SelectRelatedPersonNodeAddEvent extends NodeAddEvent<SelectRelatedPersonNode> {

    public SelectRelatedPersonNodeAddEvent(SelectRelatedPersonNode target) {
        super(target);
    }
}
