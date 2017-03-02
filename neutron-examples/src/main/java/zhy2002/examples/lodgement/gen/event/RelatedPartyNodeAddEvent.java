package zhy2002.examples.lodgement.gen.event;

import zhy2002.examples.lodgement.gen.node.RelatedPartyNode;
import zhy2002.neutron.NodeAddEvent;


public class RelatedPartyNodeAddEvent extends NodeAddEvent<RelatedPartyNode> {

    public RelatedPartyNodeAddEvent(RelatedPartyNode target) {
        super(target);
    }
}
