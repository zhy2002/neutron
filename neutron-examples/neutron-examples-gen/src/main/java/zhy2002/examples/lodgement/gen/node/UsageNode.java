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

public class UsageNode extends ObjectUiNode<RealEstateNode> {

    private UsageNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(UsageNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return UsageNode.class;
    }

    private UsageNodeComponent component;

    @Inject
    void createComponent(UsageNodeComponent.Builder builder) {
        this.component = builder.setUsageNodeModule(new UsageNodeModule(this)).build();
    }

    private RuleProvider<UsageNode> getRuleProvider() {
        return component.getUsageNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
        getInstanceRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
        getInstanceRuleProvider().createRules(createdRules);
    }

    private RuleProvider<UsageNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }


    public UsageNode(@NotNull RealEstateNode parent, String name) {
        super(parent, name);
    }

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

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("usedAsSecurityFlagNode");
        children.add(childFactory.createUsedAsSecurityFlagNode());
        setChildNodeIdentity("beingPurchasedFlagNode");
        children.add(childFactory.createBeingPurchasedFlagNode());
        setChildNodeIdentity("ownedOutrightFlagNode");
        children.add(childFactory.createOwnedOutrightFlagNode());
        setChildNodeIdentity("primarySecurityFlagNode");
        children.add(childFactory.createPrimarySecurityFlagNode());
        setChildNodeIdentity("approvalInPrincipleFlagNode");
        children.add(childFactory.createApprovalInPrincipleFlagNode());
        setChildNodeIdentity("existingMortgageListNode");
        children.add(childFactory.createExistingMortgageListNode());
        setChildNodeIdentity(null);
        return children;
    }

}
