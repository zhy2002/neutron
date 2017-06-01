package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.UsageNodeComponent;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class UsageNode extends ObjectUiNode<RealEstateNode> {

    @Inject
    public UsageNode(@Owner RealEstateNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return UsageNode.class;
    }

    protected final UsageNodeComponent getComponent() {
        return component;
    }


    private UsageNodeComponent component;

    @Inject
    void createComponent(UsageNodeComponent.Builder builder) {
        this.component = builder.setUsageNodeModule(new UsageNodeModule(this)).build();
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
    public UsedAsSecurityFlagNode getUsedAsSecurityFlagNode() {
        return (UsedAsSecurityFlagNode)getChildByName("usedAsSecurityFlagNode");
    }

    @JsMethod
    public BeingPurchasedFlagNode getBeingPurchasedFlagNode() {
        return (BeingPurchasedFlagNode)getChildByName("beingPurchasedFlagNode");
    }

    @JsMethod
    public OwnedOutrightFlagNode getOwnedOutrightFlagNode() {
        return (OwnedOutrightFlagNode)getChildByName("ownedOutrightFlagNode");
    }

    @JsMethod
    public PrimarySecurityFlagNode getPrimarySecurityFlagNode() {
        return (PrimarySecurityFlagNode)getChildByName("primarySecurityFlagNode");
    }

    @JsMethod
    public ApprovalInPrincipleFlagNode getApprovalInPrincipleFlagNode() {
        return (ApprovalInPrincipleFlagNode)getChildByName("approvalInPrincipleFlagNode");
    }

    @JsMethod
    public ExistingMortgageListNode getExistingMortgageListNode() {
        return (ExistingMortgageListNode)getChildByName("existingMortgageListNode");
    }

    //endregion
    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("usedAsSecurityFlagNode");
        children.add(getComponent().createUsedAsSecurityFlagNode());
        setChildNodeIdentity("beingPurchasedFlagNode");
        children.add(getComponent().createBeingPurchasedFlagNode());
        setChildNodeIdentity("ownedOutrightFlagNode");
        children.add(getComponent().createOwnedOutrightFlagNode());
        setChildNodeIdentity("primarySecurityFlagNode");
        children.add(getComponent().createPrimarySecurityFlagNode());
        setChildNodeIdentity("approvalInPrincipleFlagNode");
        children.add(getComponent().createApprovalInPrincipleFlagNode());
        setChildNodeIdentity("existingMortgageListNode");
        children.add(getComponent().createExistingMortgageListNode());
        setChildNodeIdentity(null);
        return children;
    }

}
