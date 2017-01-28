package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class ExpensesNodeFactory implements ChildNodeFactory<ExpensesNode, FinancialPositionNode> {

    @Override
    public ExpensesNode create(FinancialPositionNode parent, String name) {
        return new ExpensesNode(parent, name);
    }
}
