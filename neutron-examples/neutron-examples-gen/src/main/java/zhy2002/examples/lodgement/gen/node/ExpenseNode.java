package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ExpenseNode extends ObjectUiNode<ExpenseListNode> {

    private ExpenseTypeNode expenseTypeNode;
    private ExpenseDescriptionNode expenseDescriptionNode;
    private ExpenseMonthlyRepaymentNode expenseMonthlyRepaymentNode;
    private ExpenseOwnershipListNode ownershipListNode;

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

    private ExpenseNodeRuleProvider getRuleProvider() {
        return component.getExpenseNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
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

    @JsMethod
    public ExpenseOwnershipListNode getOwnershipListNode() {
        return ownershipListNode;
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
        ownershipListNode = childFactory.createOwnershipListNode();
        children.add(ownershipListNode);
        return children;
    }

}
