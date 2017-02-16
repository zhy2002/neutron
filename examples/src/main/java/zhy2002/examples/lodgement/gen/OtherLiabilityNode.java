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

public class OtherLiabilityNode extends ObjectUiNode<OtherLiabilityListNode>
{
    private OtherLiabilityTypeNode otherLiabilityTypeNode;
    private OtherLiabilityDescriptionNode otherLiabilityDescriptionNode;
    private OtherLiabilityLimitAmountNode otherLiabilityLimitAmountNode;
    private OtherLiabilityAmountOwningNode otherLiabilityAmountOwningNode;
    private OtherLiabilityMonthlyRepaymentNode otherLiabilityMonthlyRepaymentNode;
    private OtherLiabilityClearingFlagNode otherLiabilityClearingFlagNode;
    private OtherLiabilityBreakCostNode otherLiabilityBreakCostNode;

    private OtherLiabilityNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(OtherLiabilityNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    public OtherLiabilityNode(OtherLiabilityListNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public OtherLiabilityTypeNode getOtherLiabilityTypeNode() {
        return otherLiabilityTypeNode;
    }

    @JsMethod
    public OtherLiabilityDescriptionNode getOtherLiabilityDescriptionNode() {
        return otherLiabilityDescriptionNode;
    }

    @JsMethod
    public OtherLiabilityLimitAmountNode getOtherLiabilityLimitAmountNode() {
        return otherLiabilityLimitAmountNode;
    }

    @JsMethod
    public OtherLiabilityAmountOwningNode getOtherLiabilityAmountOwningNode() {
        return otherLiabilityAmountOwningNode;
    }

    @JsMethod
    public OtherLiabilityMonthlyRepaymentNode getOtherLiabilityMonthlyRepaymentNode() {
        return otherLiabilityMonthlyRepaymentNode;
    }

    @JsMethod
    public OtherLiabilityClearingFlagNode getOtherLiabilityClearingFlagNode() {
        return otherLiabilityClearingFlagNode;
    }

    @JsMethod
    public OtherLiabilityBreakCostNode getOtherLiabilityBreakCostNode() {
        return otherLiabilityBreakCostNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        otherLiabilityTypeNode = childFactory.createOtherLiabilityTypeNode();
        children.add(otherLiabilityTypeNode);
        otherLiabilityDescriptionNode = childFactory.createOtherLiabilityDescriptionNode();
        children.add(otherLiabilityDescriptionNode);
        otherLiabilityLimitAmountNode = childFactory.createOtherLiabilityLimitAmountNode();
        children.add(otherLiabilityLimitAmountNode);
        otherLiabilityAmountOwningNode = childFactory.createOtherLiabilityAmountOwningNode();
        children.add(otherLiabilityAmountOwningNode);
        otherLiabilityMonthlyRepaymentNode = childFactory.createOtherLiabilityMonthlyRepaymentNode();
        children.add(otherLiabilityMonthlyRepaymentNode);
        otherLiabilityClearingFlagNode = childFactory.createOtherLiabilityClearingFlagNode();
        children.add(otherLiabilityClearingFlagNode);
        otherLiabilityBreakCostNode = childFactory.createOtherLiabilityBreakCostNode();
        children.add(otherLiabilityBreakCostNode);
        return children;
    }

}
