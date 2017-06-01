package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.LoanNodeComponent;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class LoanNode extends ObjectUiNode<LoanListNode> {

    @Inject
    public LoanNode(@Owner LoanListNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return LoanNode.class;
    }

    protected final LoanNodeComponent getComponent() {
        return component;
    }


    private LoanNodeComponent component;

    @Inject
    void createComponent(LoanNodeComponent.Builder builder) {
        this.component = builder.setLoanNodeModule(new LoanNodeModule(this)).build();
    }

    private RuleProvider<LoanNode> getRuleProvider() {
        return component.getLoanNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }

    //region children getters

    @JsMethod
    public LoanTypeNode getLoanTypeNode() {
        return (LoanTypeNode)getChildByName("loanTypeNode");
    }

    @JsMethod
    public LoanLenderNameNode getLoanLenderNameNode() {
        return (LoanLenderNameNode)getChildByName("loanLenderNameNode");
    }

    @JsMethod
    public LoanLimitAmountNode getLoanLimitAmountNode() {
        return (LoanLimitAmountNode)getChildByName("loanLimitAmountNode");
    }

    @JsMethod
    public LoanOwingAmountNode getLoanOwingAmountNode() {
        return (LoanOwingAmountNode)getChildByName("loanOwingAmountNode");
    }

    @JsMethod
    public LoanMonthlyRepaymentNode getLoanMonthlyRepaymentNode() {
        return (LoanMonthlyRepaymentNode)getChildByName("loanMonthlyRepaymentNode");
    }

    @JsMethod
    public LoanClearingFlagNode getLoanClearingFlagNode() {
        return (LoanClearingFlagNode)getChildByName("loanClearingFlagNode");
    }

    @JsMethod
    public LoanBreakCostNode getLoanBreakCostNode() {
        return (LoanBreakCostNode)getChildByName("loanBreakCostNode");
    }

    @JsMethod
    public LoanOwnershipListNode getOwnershipListNode() {
        return (LoanOwnershipListNode)getChildByName("ownershipListNode");
    }

    //endregion
    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("loanTypeNode");
        children.add(getComponent().createLoanTypeNode());
        setChildNodeIdentity("loanLenderNameNode");
        children.add(getComponent().createLoanLenderNameNode());
        setChildNodeIdentity("loanLimitAmountNode");
        children.add(getComponent().createLoanLimitAmountNode());
        setChildNodeIdentity("loanOwingAmountNode");
        children.add(getComponent().createLoanOwingAmountNode());
        setChildNodeIdentity("loanMonthlyRepaymentNode");
        children.add(getComponent().createLoanMonthlyRepaymentNode());
        setChildNodeIdentity("loanClearingFlagNode");
        children.add(getComponent().createLoanClearingFlagNode());
        setChildNodeIdentity("loanBreakCostNode");
        children.add(getComponent().createLoanBreakCostNode());
        setChildNodeIdentity("ownershipListNode");
        children.add(getComponent().createLoanOwnershipListNode());
        setChildNodeIdentity(null);
        return children;
    }

}
