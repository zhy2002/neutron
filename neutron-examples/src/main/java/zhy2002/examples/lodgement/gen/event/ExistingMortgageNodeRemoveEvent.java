package zhy2002.examples.lodgement.gen.event;

import zhy2002.examples.lodgement.gen.node.ExistingMortgageNode;
import zhy2002.neutron.NodeRemoveEvent;


public class ExistingMortgageNodeRemoveEvent extends NodeRemoveEvent<ExistingMortgageNode> {
    public ExistingMortgageNodeRemoveEvent(ExistingMortgageNode target) {
        super(target);
    }
}