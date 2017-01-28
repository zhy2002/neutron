package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class ExpenseNodeFactory implements ChildNodeFactory<ExpenseNode, ExpensesNode> {

    @Override
    public ExpenseNode create(ExpensesNode parent, String name) {
        return new ExpenseNode(parent, name);
    }
}
