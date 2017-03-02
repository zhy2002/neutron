package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class LoanNode extends ObjectUiNode<LoanListNode> {

    private LoanTypeNode loanTypeNode;
    private LoanLenderNameNode loanLenderNameNode;
    private LoanLimitAmountNode loanLimitAmountNode;
    private LoanOwingAmountNode loanOwingAmountNode;
    private LoanMonthlyRepaymentNode loanMonthlyRepaymentNode;
    private LoanClearingFlagNode loanClearingFlagNode;
    private LoanBreakCostNode loanBreakCostNode;

    private LoanNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(LoanNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return LoanNode.class;
    }

    private LoanNodeComponent component;

    @Inject
    void createComponent(LoanNodeComponent.Builder builder) {
        this.component = builder.setLoanNodeModule(new LoanNodeModule(this)).build();
    }

    @Override
    protected LoanNodeRuleProvider getRuleProvider() {
        return component.getLoanNodeRuleProvider();
    }

    public LoanNode(@NotNull LoanListNode parent, String name) {
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
        loanTypeNode = childFactory.createLoanTypeNode();
        children.add(loanTypeNode);
        loanLenderNameNode = childFactory.createLoanLenderNameNode();
        children.add(loanLenderNameNode);
        loanLimitAmountNode = childFactory.createLoanLimitAmountNode();
        children.add(loanLimitAmountNode);
        loanOwingAmountNode = childFactory.createLoanOwingAmountNode();
        children.add(loanOwingAmountNode);
        loanMonthlyRepaymentNode = childFactory.createLoanMonthlyRepaymentNode();
        children.add(loanMonthlyRepaymentNode);
        loanClearingFlagNode = childFactory.createLoanClearingFlagNode();
        children.add(loanClearingFlagNode);
        loanBreakCostNode = childFactory.createLoanBreakCostNode();
        children.add(loanBreakCostNode);
        return children;
    }

}