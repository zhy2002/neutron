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

public class OtherLiabilityNode extends ObjectUiNode<OtherLiabilityListNode> {

    private OtherLiabilityNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(OtherLiabilityNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return OtherLiabilityNode.class;
    }

    private OtherLiabilityNodeComponent component;

    @Inject
    void createComponent(OtherLiabilityNodeComponent.Builder builder) {
        this.component = builder.setOtherLiabilityNodeModule(new OtherLiabilityNodeModule(this)).build();
    }

    private RuleProvider<OtherLiabilityNode> getRuleProvider() {
        return component.getOtherLiabilityNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public OtherLiabilityNode(@NotNull OtherLiabilityListNode parent, String name) {
        super(parent, name);
    }

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

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        children.add(childFactory.createOtherLiabilityTypeNode());
        children.add(childFactory.createOtherLiabilityDescriptionNode());
        children.add(childFactory.createOtherLiabilityLimitAmountNode());
        children.add(childFactory.createOtherLiabilityAmountOwningNode());
        children.add(childFactory.createOtherLiabilityMonthlyRepaymentNode());
        children.add(childFactory.createOtherLiabilityClearingFlagNode());
        children.add(childFactory.createOtherLiabilityBreakCostNode());
        children.add(childFactory.createOwnershipListNode());
        return children;
    }

}
