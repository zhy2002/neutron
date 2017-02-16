package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.lodgement.data.*;

public class ExpenseNode extends ObjectUiNode<ExpenseListNode>
{
    private ExpenseTypeNode expenseTypeNode;
    private ExpenseDescriptionNode expenseDescriptionNode;
    private ExpenseMonthlyRepaymentNode expenseMonthlyRepaymentNode;

    private ExpenseNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(ExpenseNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    public ExpenseNode(ExpenseListNode parent, String name) {
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
        expenseTypeNode = childFactory.createExpenseTypeNode();
        children.add(expenseTypeNode);
        expenseDescriptionNode = childFactory.createExpenseDescriptionNode();
        children.add(expenseDescriptionNode);
        expenseMonthlyRepaymentNode = childFactory.createExpenseMonthlyRepaymentNode();
        children.add(expenseMonthlyRepaymentNode);
        return children;
    }

}
