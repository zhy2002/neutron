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

public  class CreditCardNode extends ObjectUiNode<CreditCardListNode>
{
    private CreditCardTypeNode creditCardTypeNode;
    private CreditCardAmountOwingNode creditCardAmountOwingNode;
    private CreditCardLimitAmount creditCardLimitAmount;
    private CreditCardMonthlyRepayment creditCardMonthlyRepayment;
    private CreditCardClearingFlagNode creditCardClearingFlagNode;
    private CreditCardBreakCostNode creditCardBreakCostNode;
    private CreditCardLenderNameNode creditCardLenderNameNode;

    protected CreditCardNode(CreditCardListNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public CreditCardTypeNode getCreditCardTypeNode() {
        return creditCardTypeNode;
    }

    @JsMethod
    public CreditCardAmountOwingNode getCreditCardAmountOwingNode() {
        return creditCardAmountOwingNode;
    }

    @JsMethod
    public CreditCardLimitAmount getCreditCardLimitAmount() {
        return creditCardLimitAmount;
    }

    @JsMethod
    public CreditCardMonthlyRepayment getCreditCardMonthlyRepayment() {
        return creditCardMonthlyRepayment;
    }

    @JsMethod
    public CreditCardClearingFlagNode getCreditCardClearingFlagNode() {
        return creditCardClearingFlagNode;
    }

    @JsMethod
    public CreditCardBreakCostNode getCreditCardBreakCostNode() {
        return creditCardBreakCostNode;
    }

    @JsMethod
    public CreditCardLenderNameNode getCreditCardLenderNameNode() {
        return creditCardLenderNameNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        UiNodeContext<?> context = getContext();
        creditCardTypeNode = context.createChildNode(CreditCardTypeNode.class, this, "creditCardTypeNode");
        children.add(creditCardTypeNode);
        creditCardAmountOwingNode = context.createChildNode(CreditCardAmountOwingNode.class, this, "creditCardAmountOwingNode");
        children.add(creditCardAmountOwingNode);
        creditCardLimitAmount = context.createChildNode(CreditCardLimitAmount.class, this, "creditCardLimitAmount");
        children.add(creditCardLimitAmount);
        creditCardMonthlyRepayment = context.createChildNode(CreditCardMonthlyRepayment.class, this, "creditCardMonthlyRepayment");
        children.add(creditCardMonthlyRepayment);
        creditCardClearingFlagNode = context.createChildNode(CreditCardClearingFlagNode.class, this, "creditCardClearingFlagNode");
        children.add(creditCardClearingFlagNode);
        creditCardBreakCostNode = context.createChildNode(CreditCardBreakCostNode.class, this, "creditCardBreakCostNode");
        children.add(creditCardBreakCostNode);
        creditCardLenderNameNode = context.createChildNode(CreditCardLenderNameNode.class, this, "creditCardLenderNameNode");
        children.add(creditCardLenderNameNode);
        return children;
    }



}
