package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class ExpenseDescriptionNodeFactory implements ChildNodeFactory<ExpenseDescriptionNode, ExpenseNode> {

    @Override
    public ExpenseDescriptionNode create(ExpenseNode parent, String name) {
        return new ExpenseDescriptionNode(parent, name);
    }
}
