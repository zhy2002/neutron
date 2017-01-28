package zhy2002.examples.lodgement.gen.event;

import zhy2002.examples.lodgement.gen.ExpenseNode;
import zhy2002.neutron.NodeRemoveEvent;


public class ExpenseNodeRemoveEvent extends NodeRemoveEvent<ExpenseNode> {
    public ExpenseNodeRemoveEvent(ExpenseNode target) {
        super(target);
    }
}