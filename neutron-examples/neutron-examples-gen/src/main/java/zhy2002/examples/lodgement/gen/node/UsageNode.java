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

    private UsedAsSecurityFlagNode usedAsSecurityFlagNode;
    private BeingPurchasedFlagNode beingPurchasedFlagNode;
    private OwnedOutrightFlagNode ownedOutrightFlagNode;
    private PrimarySecurityFlagNode primarySecurityFlagNode;
    private ApprovalInPrincipleFlagNode approvalInPrincipleFlagNode;
    private ExistingMortgageListNode existingMortgageListNode;

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

    private UsageNodeRuleProvider getRuleProvider() {
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

    @JsMethod
    public ExistingMortgageListNode getExistingMortgageListNode() {
        return existingMortgageListNode;
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
        existingMortgageListNode = childFactory.createExistingMortgageListNode();
        children.add(existingMortgageListNode);
        return children;
    }

}
