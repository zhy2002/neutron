package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class ExpenseNode extends ObjectUiNode<ExpenseListNode> {

    private ExpenseTypeNode expenseTypeNode;
    private ExpenseDescriptionNode expenseDescriptionNode;
    private ExpenseMonthlyRepaymentNode expenseMonthlyRepaymentNode;

    private ExpenseNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(ExpenseNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return ExpenseNode.class;
    }

    private ExpenseNodeComponent component;

    @Inject
    void createComponent(ExpenseNodeComponent.Builder builder) {
        this.component = builder.setExpenseNodeModule(new ExpenseNodeModule(this)).build();
    }

    @Override
    protected ExpenseNodeRuleProvider getRuleProvider() {
        return component.getExpenseNodeRuleProvider();
    }

    public ExpenseNode(@NotNull ExpenseListNode parent, String name) {
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
