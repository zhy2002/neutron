package zhy2002.examples.lodgement.gen.event;

import zhy2002.examples.lodgement.gen.node.ExistingMortgageNode;
import zhy2002.neutron.NodeAddEvent;


public class ExistingMortgageNodeAddEvent extends NodeAddEvent<ExistingMortgageNode> {

    public ExistingMortgageNodeAddEvent(ExistingMortgageNode target) {
        super(target);
    }
}
