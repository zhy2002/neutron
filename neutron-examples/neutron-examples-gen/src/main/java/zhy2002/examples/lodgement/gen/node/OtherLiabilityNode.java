package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.OtherLiabilityNodeComponent;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class OtherLiabilityNode extends ObjectUiNode<OtherLiabilityListNode> {

    @Inject
    public OtherLiabilityNode(@Owner OtherLiabilityListNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return OtherLiabilityNode.class;
    }

    protected final OtherLiabilityNodeComponent getComponent() {
        return component;
    }


    private OtherLiabilityNodeComponent component;

    @Inject
    void createComponent(OtherLiabilityNodeComponent.Builder builder) {
        this.component = builder.setOtherLiabilityNodeModule(new OtherLiabilityNodeModule(this)).build();
    }

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

    //region children getters

    @JsMethod
    public OtherLiabilityTypeNode getOtherLiabilityTypeNode() {
        return (OtherLiabilityTypeNode)getChildByName("otherLiabilityTypeNode");
    }

    @JsMethod
    public OtherLiabilityDescriptionNode getOtherLiabilityDescriptionNode() {
        return (OtherLiabilityDescriptionNode)getChildByName("otherLiabilityDescriptionNode");
    }

    @JsMethod
    public OtherLiabilityLimitAmountNode getOtherLiabilityLimitAmountNode() {
        return (OtherLiabilityLimitAmountNode)getChildByName("otherLiabilityLimitAmountNode");
    }

    @JsMethod
    public OtherLiabilityAmountOwningNode getOtherLiabilityAmountOwningNode() {
        return (OtherLiabilityAmountOwningNode)getChildByName("otherLiabilityAmountOwningNode");
    }

    @JsMethod
    public OtherLiabilityMonthlyRepaymentNode getOtherLiabilityMonthlyRepaymentNode() {
        return (OtherLiabilityMonthlyRepaymentNode)getChildByName("otherLiabilityMonthlyRepaymentNode");
    }

    @JsMethod
    public OtherLiabilityClearingFlagNode getOtherLiabilityClearingFlagNode() {
        return (OtherLiabilityClearingFlagNode)getChildByName("otherLiabilityClearingFlagNode");
    }

    @JsMethod
    public OtherLiabilityBreakCostNode getOtherLiabilityBreakCostNode() {
        return (OtherLiabilityBreakCostNode)getChildByName("otherLiabilityBreakCostNode");
    }

    @JsMethod
    public OtherLiabilityOwnershipListNode getOwnershipListNode() {
        return (OtherLiabilityOwnershipListNode)getChildByName("ownershipListNode");
    }

    //endregion
    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("otherLiabilityTypeNode");
        children.add(getComponent().createOtherLiabilityTypeNode());
        setChildNodeIdentity("otherLiabilityDescriptionNode");
        children.add(getComponent().createOtherLiabilityDescriptionNode());
        setChildNodeIdentity("otherLiabilityLimitAmountNode");
        children.add(getComponent().createOtherLiabilityLimitAmountNode());
        setChildNodeIdentity("otherLiabilityAmountOwningNode");
        children.add(getComponent().createOtherLiabilityAmountOwningNode());
        setChildNodeIdentity("otherLiabilityMonthlyRepaymentNode");
        children.add(getComponent().createOtherLiabilityMonthlyRepaymentNode());
        setChildNodeIdentity("otherLiabilityClearingFlagNode");
        children.add(getComponent().createOtherLiabilityClearingFlagNode());
        setChildNodeIdentity("otherLiabilityBreakCostNode");
        children.add(getComponent().createOtherLiabilityBreakCostNode());
        setChildNodeIdentity("ownershipListNode");
        children.add(getComponent().createOtherLiabilityOwnershipListNode());
        setChildNodeIdentity(null);
        return children;
    }

}
