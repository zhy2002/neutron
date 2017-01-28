package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class ExpenseMonthlyRepaymentNodeFactory implements ChildNodeFactory<ExpenseMonthlyRepaymentNode, ExpenseNode> {

    @Override
    public ExpenseMonthlyRepaymentNode create(ExpenseNode parent, String name) {
        return new ExpenseMonthlyRepaymentNode(parent, name);
    }
}
