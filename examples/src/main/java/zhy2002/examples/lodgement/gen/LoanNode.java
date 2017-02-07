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

public  class LoanNode extends ObjectUiNode<LoanListNode>
{
    private LoanTypeNode loanTypeNode;
    private LoanLenderNameNode loanLenderNameNode;
    private LoanLimitAmountNode loanLimitAmountNode;
    private LoanOwingAmountNode loanOwingAmountNode;
    private LoanMonthlyRepaymentNode loanMonthlyRepaymentNode;
    private LoanClearingFlagNode loanClearingFlagNode;
    private LoanBreakCostNode loanBreakCostNode;

    public LoanNode(LoanListNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public LoanTypeNode getLoanTypeNode() {
        return loanTypeNode;
    }

    @JsMethod
    public LoanLenderNameNode getLoanLenderNameNode() {
        return loanLenderNameNode;
    }

    @JsMethod
    public LoanLimitAmountNode getLoanLimitAmountNode() {
        return loanLimitAmountNode;
    }

    @JsMethod
    public LoanOwingAmountNode getLoanOwingAmountNode() {
        return loanOwingAmountNode;
    }

    @JsMethod
    public LoanMonthlyRepaymentNode getLoanMonthlyRepaymentNode() {
        return loanMonthlyRepaymentNode;
    }

    @JsMethod
    public LoanClearingFlagNode getLoanClearingFlagNode() {
        return loanClearingFlagNode;
    }

    @JsMethod
    public LoanBreakCostNode getLoanBreakCostNode() {
        return loanBreakCostNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        UiNodeContext<?> context = getContext();
        loanTypeNode = context.createChildNode(LoanTypeNode.class, this, "loanTypeNode");
        children.add(loanTypeNode);
        loanLenderNameNode = context.createChildNode(LoanLenderNameNode.class, this, "loanLenderNameNode");
        children.add(loanLenderNameNode);
        loanLimitAmountNode = context.createChildNode(LoanLimitAmountNode.class, this, "loanLimitAmountNode");
        children.add(loanLimitAmountNode);
        loanOwingAmountNode = context.createChildNode(LoanOwingAmountNode.class, this, "loanOwingAmountNode");
        children.add(loanOwingAmountNode);
        loanMonthlyRepaymentNode = context.createChildNode(LoanMonthlyRepaymentNode.class, this, "loanMonthlyRepaymentNode");
        children.add(loanMonthlyRepaymentNode);
        loanClearingFlagNode = context.createChildNode(LoanClearingFlagNode.class, this, "loanClearingFlagNode");
        children.add(loanClearingFlagNode);
        loanBreakCostNode = context.createChildNode(LoanBreakCostNode.class, this, "loanBreakCostNode");
        children.add(loanBreakCostNode);
        return children;
    }



}
