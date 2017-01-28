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

public  class UsageNode extends ObjectUiNode<RealEstateNode>
{
    private UsedAsSecurityFlagNode usedAsSecurityFlagNode;
    private BeingPurchasedFlagNode beingPurchasedFlagNode;
    private OwnedOutrightFlagNode ownedOutrightFlagNode;
    private PrimarySecurityFlagNode primarySecurityFlagNode;
    private ApprovalInPrincipleFlagNode approvalInPrincipleFlagNode;

    protected UsageNode(RealEstateNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public UsedAsSecurityFlagNode getUsedAsSecurityFlagNode() {
        return usedAsSecurityFlagNode;
    }

    @JsMethod
    public BeingPurchasedFlagNode getBeingPurchasedFlagNode() {
        return beingPurchasedFlagNode;
    }

    @JsMethod
    public OwnedOutrightFlagNode getOwnedOutrightFlagNode() {
        return ownedOutrightFlagNode;
    }

    @JsMethod
    public PrimarySecurityFlagNode getPrimarySecurityFlagNode() {
        return primarySecurityFlagNode;
    }

    @JsMethod
    public ApprovalInPrincipleFlagNode getApprovalInPrincipleFlagNode() {
        return approvalInPrincipleFlagNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        UiNodeContext<?> context = getContext();
        usedAsSecurityFlagNode = context.createChildNode(UsedAsSecurityFlagNode.class, this, "usedAsSecurityFlagNode");
        children.add(usedAsSecurityFlagNode);
        beingPurchasedFlagNode = context.createChildNode(BeingPurchasedFlagNode.class, this, "beingPurchasedFlagNode");
        children.add(beingPurchasedFlagNode);
        ownedOutrightFlagNode = context.createChildNode(OwnedOutrightFlagNode.class, this, "ownedOutrightFlagNode");
        children.add(ownedOutrightFlagNode);
        primarySecurityFlagNode = context.createChildNode(PrimarySecurityFlagNode.class, this, "primarySecurityFlagNode");
        children.add(primarySecurityFlagNode);
        approvalInPrincipleFlagNode = context.createChildNode(ApprovalInPrincipleFlagNode.class, this, "approvalInPrincipleFlagNode");
        children.add(approvalInPrincipleFlagNode);
        return children;
    }



}
