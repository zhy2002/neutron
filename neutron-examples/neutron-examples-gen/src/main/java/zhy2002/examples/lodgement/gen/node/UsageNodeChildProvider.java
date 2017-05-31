package zhy2002.examples.lodgement.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;
import zhy2002.neutron.di.ComponentScope;


interface UsageNodeChildFactory {
    UsedAsSecurityFlagNode createUsedAsSecurityFlagNode();
    BeingPurchasedFlagNode createBeingPurchasedFlagNode();
    OwnedOutrightFlagNode createOwnedOutrightFlagNode();
    PrimarySecurityFlagNode createPrimarySecurityFlagNode();
    ApprovalInPrincipleFlagNode createApprovalInPrincipleFlagNode();
    ExistingMortgageListNode createExistingMortgageListNode();
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
    MembersInjector<ExistingMortgageListNode> existingMortgageListNodeInjector;

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

    protected MembersInjector<ExistingMortgageListNode> getExistingMortgageListNodeInjector() {
        return this.existingMortgageListNodeInjector;
    }

    protected UsedAsSecurityFlagNode newUsedAsSecurityFlagNode(
        UsageNode parent,
        String name
    ) {
        return new UsedAsSecurityFlagNode(parent, name);
    }

    protected void configureUsedAsSecurityFlagNode(UsedAsSecurityFlagNode node) {
    }

    @ComponentScope
    public static class UsedAsSecurityFlagNodeRuleProvider implements RuleProvider<UsedAsSecurityFlagNode> {

        @Inject
        public UsedAsSecurityFlagNodeRuleProvider() {

        }

        @Override
        public void initializeState(UsedAsSecurityFlagNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected BeingPurchasedFlagNode newBeingPurchasedFlagNode(
        UsageNode parent,
        String name
    ) {
        return new BeingPurchasedFlagNode(parent, name);
    }

    protected void configureBeingPurchasedFlagNode(BeingPurchasedFlagNode node) {
    }

    @ComponentScope
    public static class BeingPurchasedFlagNodeRuleProvider implements RuleProvider<BeingPurchasedFlagNode> {

        @Inject
        public BeingPurchasedFlagNodeRuleProvider() {

        }

        @Override
        public void initializeState(BeingPurchasedFlagNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected OwnedOutrightFlagNode newOwnedOutrightFlagNode(
        UsageNode parent,
        String name
    ) {
        return new OwnedOutrightFlagNode(parent, name);
    }

    protected void configureOwnedOutrightFlagNode(OwnedOutrightFlagNode node) {
    }

    @ComponentScope
    public static class OwnedOutrightFlagNodeRuleProvider implements RuleProvider<OwnedOutrightFlagNode> {

        @Inject
        public OwnedOutrightFlagNodeRuleProvider() {

        }

        @Override
        public void initializeState(OwnedOutrightFlagNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected PrimarySecurityFlagNode newPrimarySecurityFlagNode(
        UsageNode parent,
        String name
    ) {
        return new PrimarySecurityFlagNode(parent, name);
    }

    protected void configurePrimarySecurityFlagNode(PrimarySecurityFlagNode node) {
    }

    @ComponentScope
    public static class PrimarySecurityFlagNodeRuleProvider implements RuleProvider<PrimarySecurityFlagNode> {

        @Inject
        public PrimarySecurityFlagNodeRuleProvider() {

        }

        @Override
        public void initializeState(PrimarySecurityFlagNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected ApprovalInPrincipleFlagNode newApprovalInPrincipleFlagNode(
        UsageNode parent,
        String name
    ) {
        return new ApprovalInPrincipleFlagNode(parent, name);
    }

    protected void configureApprovalInPrincipleFlagNode(ApprovalInPrincipleFlagNode node) {
    }

    @ComponentScope
    public static class ApprovalInPrincipleFlagNodeRuleProvider implements RuleProvider<ApprovalInPrincipleFlagNode> {

        @Inject
        public ApprovalInPrincipleFlagNodeRuleProvider() {

        }

        @Override
        public void initializeState(ApprovalInPrincipleFlagNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected ExistingMortgageListNode newExistingMortgageListNode(
        UsageNode parent,
        String name
    ) {
        return new ExistingMortgageListNode(parent, name);
    }

    protected void configureExistingMortgageListNode(ExistingMortgageListNode node) {
    }

    @ComponentScope
    public static class ExistingMortgageListNodeRuleProvider implements RuleProvider<ExistingMortgageListNode> {

        @Inject
        public ExistingMortgageListNodeRuleProvider() {

        }

        @Override
        public void initializeState(ExistingMortgageListNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
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

        @Override
        public ExistingMortgageListNode createExistingMortgageListNode() {
            ExistingMortgageListNode node = newExistingMortgageListNode(parent, "existingMortgageListNode");
            existingMortgageListNodeInjector.injectMembers(node);
            configureExistingMortgageListNode(node);
            return node;
        }

    }
}
