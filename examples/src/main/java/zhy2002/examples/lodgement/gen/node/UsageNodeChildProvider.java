package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface UsageNodeChildFactory {
    UsedAsSecurityFlagNode createUsedAsSecurityFlagNode();
    BeingPurchasedFlagNode createBeingPurchasedFlagNode();
    OwnedOutrightFlagNode createOwnedOutrightFlagNode();
    PrimarySecurityFlagNode createPrimarySecurityFlagNode();
    ApprovalInPrincipleFlagNode createApprovalInPrincipleFlagNode();
}

@Singleton
public class UsageNodeChildProvider {
    @Inject
    MembersInjector<OwnedOutrightFlagNode> ownedOutrightFlagNodeInjector;
    @Inject
    MembersInjector<ApprovalInPrincipleFlagNode> approvalInPrincipleFlagNodeInjector;
    @Inject
    MembersInjector<PrimarySecurityFlagNode> primarySecurityFlagNodeInjector;
    @Inject
    MembersInjector<BeingPurchasedFlagNode> beingPurchasedFlagNodeInjector;
    @Inject
    MembersInjector<UsedAsSecurityFlagNode> usedAsSecurityFlagNodeInjector;

    @Inject
    protected UsageNodeChildProvider () {}

    protected MembersInjector<OwnedOutrightFlagNode> getOwnedOutrightFlagNodeInjector() {
        return this.ownedOutrightFlagNodeInjector;
    }

    protected MembersInjector<ApprovalInPrincipleFlagNode> getApprovalInPrincipleFlagNodeInjector() {
        return this.approvalInPrincipleFlagNodeInjector;
    }

    protected MembersInjector<PrimarySecurityFlagNode> getPrimarySecurityFlagNodeInjector() {
        return this.primarySecurityFlagNodeInjector;
    }

    protected MembersInjector<BeingPurchasedFlagNode> getBeingPurchasedFlagNodeInjector() {
        return this.beingPurchasedFlagNodeInjector;
    }

    protected MembersInjector<UsedAsSecurityFlagNode> getUsedAsSecurityFlagNodeInjector() {
        return this.usedAsSecurityFlagNodeInjector;
    }

    protected UsedAsSecurityFlagNode newUsedAsSecurityFlagNode(
        UsageNode parent,
        String name
    ) {
        return new UsedAsSecurityFlagNode(parent, name);
    }

    protected void configureUsedAsSecurityFlagNode(UsedAsSecurityFlagNode node) {
    }

    protected BeingPurchasedFlagNode newBeingPurchasedFlagNode(
        UsageNode parent,
        String name
    ) {
        return new BeingPurchasedFlagNode(parent, name);
    }

    protected void configureBeingPurchasedFlagNode(BeingPurchasedFlagNode node) {
    }

    protected OwnedOutrightFlagNode newOwnedOutrightFlagNode(
        UsageNode parent,
        String name
    ) {
        return new OwnedOutrightFlagNode(parent, name);
    }

    protected void configureOwnedOutrightFlagNode(OwnedOutrightFlagNode node) {
    }

    protected PrimarySecurityFlagNode newPrimarySecurityFlagNode(
        UsageNode parent,
        String name
    ) {
        return new PrimarySecurityFlagNode(parent, name);
    }

    protected void configurePrimarySecurityFlagNode(PrimarySecurityFlagNode node) {
    }

    protected ApprovalInPrincipleFlagNode newApprovalInPrincipleFlagNode(
        UsageNode parent,
        String name
    ) {
        return new ApprovalInPrincipleFlagNode(parent, name);
    }

    protected void configureApprovalInPrincipleFlagNode(ApprovalInPrincipleFlagNode node) {
    }

    UsageNodeChildFactory createFactory(UsageNode parent) {
        return new UsageNodeChildFactoryImpl(parent);
    }

    private class UsageNodeChildFactoryImpl implements UsageNodeChildFactory {

        private final UsageNode parent;
        
        private UsageNodeChildFactoryImpl(UsageNode parent) {
            this.parent = parent;
        }

        @Override
        public UsedAsSecurityFlagNode createUsedAsSecurityFlagNode() {
            UsedAsSecurityFlagNode node = newUsedAsSecurityFlagNode(parent, "usedAsSecurityFlagNode");
            usedAsSecurityFlagNodeInjector.injectMembers(node);
            configureUsedAsSecurityFlagNode(node);
            return node;
        }

        @Override
        public BeingPurchasedFlagNode createBeingPurchasedFlagNode() {
            BeingPurchasedFlagNode node = newBeingPurchasedFlagNode(parent, "beingPurchasedFlagNode");
            beingPurchasedFlagNodeInjector.injectMembers(node);
            configureBeingPurchasedFlagNode(node);
            return node;
        }

        @Override
        public OwnedOutrightFlagNode createOwnedOutrightFlagNode() {
            OwnedOutrightFlagNode node = newOwnedOutrightFlagNode(parent, "ownedOutrightFlagNode");
            ownedOutrightFlagNodeInjector.injectMembers(node);
            configureOwnedOutrightFlagNode(node);
            return node;
        }

        @Override
        public PrimarySecurityFlagNode createPrimarySecurityFlagNode() {
            PrimarySecurityFlagNode node = newPrimarySecurityFlagNode(parent, "primarySecurityFlagNode");
            primarySecurityFlagNodeInjector.injectMembers(node);
            configurePrimarySecurityFlagNode(node);
            return node;
        }

        @Override
        public ApprovalInPrincipleFlagNode createApprovalInPrincipleFlagNode() {
            ApprovalInPrincipleFlagNode node = newApprovalInPrincipleFlagNode(parent, "approvalInPrincipleFlagNode");
            approvalInPrincipleFlagNodeInjector.injectMembers(node);
            configureApprovalInPrincipleFlagNode(node);
            return node;
        }

    }
}
