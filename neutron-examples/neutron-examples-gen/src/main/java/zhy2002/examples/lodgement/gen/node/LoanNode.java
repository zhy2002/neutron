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

public class LoanNode extends ObjectUiNode<LoanListNode> {

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


    public LoanNode(@NotNull LoanListNode parent, String name) {
        super(parent, name);
    }

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

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        children.add(childFactory.createLoanTypeNode());
        children.add(childFactory.createLoanLenderNameNode());
        children.add(childFactory.createLoanLimitAmountNode());
        children.add(childFactory.createLoanOwingAmountNode());
        children.add(childFactory.createLoanMonthlyRepaymentNode());
        children.add(childFactory.createLoanClearingFlagNode());
        children.add(childFactory.createLoanBreakCostNode());
        children.add(childFactory.createOwnershipListNode());
        return children;
    }

}
