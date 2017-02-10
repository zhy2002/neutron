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

public class LoanNode extends ObjectUiNode<LoanListNode>
{
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

    @Inject
    void receiveClassRegistry(ClassRegistryImpl classRegistry) {
        UiNodeConfig<LoanNode> config = classRegistry.getUiNodeConfig(LoanNode.class, getName());
        if (config != null) {
            this.setStatusListener(new ConfigBindingNodeStatusListener<>(this, config));
        }
    }

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
