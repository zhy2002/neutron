package zhy2002.examples.lodgement.gen.event;

import zhy2002.examples.lodgement.gen.node.RelatedPartyNode;
import zhy2002.neutron.NodeRemoveEvent;


public class RelatedPartyNodeRemoveEvent extends NodeRemoveEvent<RelatedPartyNode> {
    public RelatedPartyNodeRemoveEvent(RelatedPartyNode target) {
        super(target);
    }
}