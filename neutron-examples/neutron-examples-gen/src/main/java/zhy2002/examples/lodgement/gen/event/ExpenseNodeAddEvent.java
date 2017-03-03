package zhy2002.examples.lodgement.gen.event;

import zhy2002.examples.lodgement.gen.node.ExpenseNode;
import zhy2002.neutron.NodeAddEvent;


public class ExpenseNodeAddEvent extends NodeAddEvent<ExpenseNode> {

    public ExpenseNodeAddEvent(ExpenseNode target) {
        super(target);
    }
}
