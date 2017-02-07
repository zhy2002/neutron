package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.lodgement.data.*;

public  class ExpenseNode extends ObjectUiNode<ExpensesNode>
{
    private ExpenseTypeNode expenseTypeNode;
    private ExpenseDescriptionNode expenseDescriptionNode;
    private ExpenseMonthlyRepaymentNode expenseMonthlyRepaymentNode;

    public ExpenseNode(ExpensesNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public ExpenseTypeNode getExpenseTypeNode() {
        return expenseTypeNode;
    }

    @JsMethod
    public ExpenseDescriptionNode getExpenseDescriptionNode() {
        return expenseDescriptionNode;
    }

    @JsMethod
    public ExpenseMonthlyRepaymentNode getExpenseMonthlyRepaymentNode() {
        return expenseMonthlyRepaymentNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        UiNodeContext<?> context = getContext();
        expenseTypeNode = context.createChildNode(ExpenseTypeNode.class, this, "expenseTypeNode");
        children.add(expenseTypeNode);
        expenseDescriptionNode = context.createChildNode(ExpenseDescriptionNode.class, this, "expenseDescriptionNode");
        children.add(expenseDescriptionNode);
        expenseMonthlyRepaymentNode = context.createChildNode(ExpenseMonthlyRepaymentNode.class, this, "expenseMonthlyRepaymentNode");
        children.add(expenseMonthlyRepaymentNode);
        return children;
    }



}
