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
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;

public class UsageNode extends ObjectUiNode<RealEstateNode>
{
    private UsedAsSecurityFlagNode usedAsSecurityFlagNode;
    private BeingPurchasedFlagNode beingPurchasedFlagNode;
    private OwnedOutrightFlagNode ownedOutrightFlagNode;
    private PrimarySecurityFlagNode primarySecurityFlagNode;
    private ApprovalInPrincipleFlagNode approvalInPrincipleFlagNode;

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

    @Override
    protected UsageNodeRuleProvider getRuleProvider() {
        return component.getUsageNodeRuleProvider();
    }

    public UsageNode(RealEstateNode parent, String name) {
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
        usedAsSecurityFlagNode = childFactory.createUsedAsSecurityFlagNode();
        children.add(usedAsSecurityFlagNode);
        beingPurchasedFlagNode = childFactory.createBeingPurchasedFlagNode();
        children.add(beingPurchasedFlagNode);
        ownedOutrightFlagNode = childFactory.createOwnedOutrightFlagNode();
        children.add(ownedOutrightFlagNode);
        primarySecurityFlagNode = childFactory.createPrimarySecurityFlagNode();
        children.add(primarySecurityFlagNode);
        approvalInPrincipleFlagNode = childFactory.createApprovalInPrincipleFlagNode();
        children.add(approvalInPrincipleFlagNode);
        return children;
    }

}
