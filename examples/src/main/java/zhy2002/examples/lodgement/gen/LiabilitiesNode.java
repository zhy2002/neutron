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

public  class LiabilitiesNode extends ObjectUiNode<FinancialPositionNode>
{
    private CreditCardListNode creditCardListNode;
    private LoanListNode loanListNode;
    private OtherLiabilityListNode otherLiabilityListNode;

    protected LiabilitiesNode(FinancialPositionNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public CreditCardListNode getCreditCardListNode() {
        return creditCardListNode;
    }

    @JsMethod
    public LoanListNode getLoanListNode() {
        return loanListNode;
    }

    @JsMethod
    public OtherLiabilityListNode getOtherLiabilityListNode() {
        return otherLiabilityListNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        UiNodeContext<?> context = getContext();
        creditCardListNode = context.createChildNode(CreditCardListNode.class, this, "creditCardListNode");
        children.add(creditCardListNode);
        loanListNode = context.createChildNode(LoanListNode.class, this, "loanListNode");
        children.add(loanListNode);
        otherLiabilityListNode = context.createChildNode(OtherLiabilityListNode.class, this, "otherLiabilityListNode");
        children.add(otherLiabilityListNode);
        return children;
    }



}
