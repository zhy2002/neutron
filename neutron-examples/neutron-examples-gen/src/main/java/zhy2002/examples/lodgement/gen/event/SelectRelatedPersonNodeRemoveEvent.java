package zhy2002.examples.lodgement.gen.event;

import zhy2002.examples.lodgement.gen.node.SelectRelatedPersonNode;
import zhy2002.neutron.NodeRemoveEvent;


public class SelectRelatedPersonNodeRemoveEvent extends NodeRemoveEvent<SelectRelatedPersonNode> {
    public SelectRelatedPersonNodeRemoveEvent(SelectRelatedPersonNode target) {
        super(target);
    }
}