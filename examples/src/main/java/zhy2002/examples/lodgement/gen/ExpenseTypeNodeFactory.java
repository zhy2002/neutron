package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class ExpenseTypeNodeFactory implements ChildNodeFactory<ExpenseTypeNode, ExpenseNode> {

    @Override
    public ExpenseTypeNode create(ExpenseNode parent, String name) {
        return new ExpenseTypeNode(parent, name);
    }
}
