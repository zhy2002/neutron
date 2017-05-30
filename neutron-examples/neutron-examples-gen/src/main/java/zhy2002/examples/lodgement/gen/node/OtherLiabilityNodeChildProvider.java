package zhy2002.examples.lodgement.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;


interface OtherLiabilityNodeChildFactory {
    OtherLiabilityTypeNode createOtherLiabilityTypeNode();
    OtherLiabilityDescriptionNode createOtherLiabilityDescriptionNode();
    OtherLiabilityLimitAmountNode createOtherLiabilityLimitAmountNode();
    OtherLiabilityAmountOwningNode createOtherLiabilityAmountOwningNode();
    OtherLiabilityMonthlyRepaymentNode createOtherLiabilityMonthlyRepaymentNode();
    OtherLiabilityClearingFlagNode createOtherLiabilityClearingFlagNode();
    OtherLiabilityBreakCostNode createOtherLiabilityBreakCostNode();
    OtherLiabilityOwnershipListNode createOwnershipListNode();
}

@Singleton
public class OtherLiabilityNodeChildProvider {
    @Inject
    MembersInjector<OtherLiabilityAmountOwningNode> otherLiabilityAmountOwningNodeInjector;
    @Inject
    MembersInjector<OtherLiabilityBreakCostNode> otherLiabilityBreakCostNodeInjector;
    @Inject
    MembersInjector<OtherLiabilityLimitAmountNode> otherLiabilityLimitAmountNodeInjector;
    @Inject
    MembersInjector<OtherLiabilityMonthlyRepaymentNode> otherLiabilityMonthlyRepaymentNodeInjector;
    @Inject
    MembersInjector<OtherLiabilityClearingFlagNode> otherLiabilityClearingFlagNodeInjector;
    @Inject
    MembersInjector<OtherLiabilityDescriptionNode> otherLiabilityDescriptionNodeInjector;
    @Inject
    MembersInjector<OtherLiabilityTypeNode> otherLiabilityTypeNodeInjector;
    @Inject
    MembersInjector<OtherLiabilityOwnershipListNode> otherLiabilityOwnershipListNodeInjector;

    @Inject
    protected OtherLiabilityNodeChildProvider () {}

    protected MembersInjector<OtherLiabilityAmountOwningNode> getOtherLiabilityAmountOwningNodeInjector() {
        return this.otherLiabilityAmountOwningNodeInjector;
    }

    protected MembersInjector<OtherLiabilityBreakCostNode> getOtherLiabilityBreakCostNodeInjector() {
        return this.otherLiabilityBreakCostNodeInjector;
    }

    protected MembersInjector<OtherLiabilityLimitAmountNode> getOtherLiabilityLimitAmountNodeInjector() {
        return this.otherLiabilityLimitAmountNodeInjector;
    }

    protected MembersInjector<OtherLiabilityMonthlyRepaymentNode> getOtherLiabilityMonthlyRepaymentNodeInjector() {
        return this.otherLiabilityMonthlyRepaymentNodeInjector;
    }

    protected MembersInjector<OtherLiabilityClearingFlagNode> getOtherLiabilityClearingFlagNodeInjector() {
        return this.otherLiabilityClearingFlagNodeInjector;
    }

    protected MembersInjector<OtherLiabilityDescriptionNode> getOtherLiabilityDescriptionNodeInjector() {
        return this.otherLiabilityDescriptionNodeInjector;
    }

    protected MembersInjector<OtherLiabilityTypeNode> getOtherLiabilityTypeNodeInjector() {
        return this.otherLiabilityTypeNodeInjector;
    }

    protected MembersInjector<OtherLiabilityOwnershipListNode> getOtherLiabilityOwnershipListNodeInjector() {
        return this.otherLiabilityOwnershipListNodeInjector;
    }

    protected OtherLiabilityTypeNode newOtherLiabilityTypeNode(
        OtherLiabilityNode parent,
        String name
    ) {
        return new OtherLiabilityTypeNode(parent, name);
    }

    protected void configureOtherLiabilityTypeNode(OtherLiabilityTypeNode node) {
    }

    @OtherLiabilityTypeNodeScope
    public static class OtherLiabilityTypeNodeRuleProvider implements RuleProvider<OtherLiabilityTypeNode> {

        @Inject
        public OtherLiabilityTypeNodeRuleProvider() {

        }

        @Override
        public void initializeState(OtherLiabilityTypeNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected OtherLiabilityDescriptionNode newOtherLiabilityDescriptionNode(
        OtherLiabilityNode parent,
        String name
    ) {
        return new OtherLiabilityDescriptionNode(parent, name);
    }

    protected void configureOtherLiabilityDescriptionNode(OtherLiabilityDescriptionNode node) {
    }

    @OtherLiabilityDescriptionNodeScope
    public static class OtherLiabilityDescriptionNodeRuleProvider implements RuleProvider<OtherLiabilityDescriptionNode> {

        @Inject
        public OtherLiabilityDescriptionNodeRuleProvider() {

        }

        @Override
        public void initializeState(OtherLiabilityDescriptionNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected OtherLiabilityLimitAmountNode newOtherLiabilityLimitAmountNode(
        OtherLiabilityNode parent,
        String name
    ) {
        return new OtherLiabilityLimitAmountNode(parent, name);
    }

    protected void configureOtherLiabilityLimitAmountNode(OtherLiabilityLimitAmountNode node) {
    }

    @OtherLiabilityLimitAmountNodeScope
    public static class OtherLiabilityLimitAmountNodeRuleProvider implements RuleProvider<OtherLiabilityLimitAmountNode> {

        @Inject
        public OtherLiabilityLimitAmountNodeRuleProvider() {

        }

        @Override
        public void initializeState(OtherLiabilityLimitAmountNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected OtherLiabilityAmountOwningNode newOtherLiabilityAmountOwningNode(
        OtherLiabilityNode parent,
        String name
    ) {
        return new OtherLiabilityAmountOwningNode(parent, name);
    }

    protected void configureOtherLiabilityAmountOwningNode(OtherLiabilityAmountOwningNode node) {
    }

    @OtherLiabilityAmountOwningNodeScope
    public static class OtherLiabilityAmountOwningNodeRuleProvider implements RuleProvider<OtherLiabilityAmountOwningNode> {

        @Inject
        public OtherLiabilityAmountOwningNodeRuleProvider() {

        }

        @Override
        public void initializeState(OtherLiabilityAmountOwningNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected OtherLiabilityMonthlyRepaymentNode newOtherLiabilityMonthlyRepaymentNode(
        OtherLiabilityNode parent,
        String name
    ) {
        return new OtherLiabilityMonthlyRepaymentNode(parent, name);
    }

    protected void configureOtherLiabilityMonthlyRepaymentNode(OtherLiabilityMonthlyRepaymentNode node) {
    }

    @OtherLiabilityMonthlyRepaymentNodeScope
    public static class OtherLiabilityMonthlyRepaymentNodeRuleProvider implements RuleProvider<OtherLiabilityMonthlyRepaymentNode> {

        @Inject
        public OtherLiabilityMonthlyRepaymentNodeRuleProvider() {

        }

        @Override
        public void initializeState(OtherLiabilityMonthlyRepaymentNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected OtherLiabilityClearingFlagNode newOtherLiabilityClearingFlagNode(
        OtherLiabilityNode parent,
        String name
    ) {
        return new OtherLiabilityClearingFlagNode(parent, name);
    }

    protected void configureOtherLiabilityClearingFlagNode(OtherLiabilityClearingFlagNode node) {
    }

    @OtherLiabilityClearingFlagNodeScope
    public static class OtherLiabilityClearingFlagNodeRuleProvider implements RuleProvider<OtherLiabilityClearingFlagNode> {

        @Inject
        public OtherLiabilityClearingFlagNodeRuleProvider() {

        }

        @Override
        public void initializeState(OtherLiabilityClearingFlagNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected OtherLiabilityBreakCostNode newOtherLiabilityBreakCostNode(
        OtherLiabilityNode parent,
        String name
    ) {
        return new OtherLiabilityBreakCostNode(parent, name);
    }

    protected void configureOtherLiabilityBreakCostNode(OtherLiabilityBreakCostNode node) {
    }

    @OtherLiabilityBreakCostNodeScope
    public static class OtherLiabilityBreakCostNodeRuleProvider implements RuleProvider<OtherLiabilityBreakCostNode> {

        @Inject
        public OtherLiabilityBreakCostNodeRuleProvider() {

        }

        @Override
        public void initializeState(OtherLiabilityBreakCostNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected OtherLiabilityOwnershipListNode newOwnershipListNode(
        OtherLiabilityNode parent,
        String name
    ) {
        return new OtherLiabilityOwnershipListNode(parent, name);
    }

    protected void configureOwnershipListNode(OtherLiabilityOwnershipListNode node) {
    }

    @OtherLiabilityOwnershipListNodeScope
    public static class OwnershipListNodeRuleProvider implements RuleProvider<OtherLiabilityOwnershipListNode> {

        @Inject
        public OwnershipListNodeRuleProvider() {

        }

        @Override
        public void initializeState(OtherLiabilityOwnershipListNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    OtherLiabilityNodeChildFactory createFactory(OtherLiabilityNode parent) {
        return new OtherLiabilityNodeChildFactoryImpl(parent);
    }

    private class OtherLiabilityNodeChildFactoryImpl implements OtherLiabilityNodeChildFactory {

        private final OtherLiabilityNode parent;
        
        private OtherLiabilityNodeChildFactoryImpl(OtherLiabilityNode parent) {
            this.parent = parent;
        }

        @Override
        public OtherLiabilityTypeNode createOtherLiabilityTypeNode() {
            OtherLiabilityTypeNode node = newOtherLiabilityTypeNode(parent, "otherLiabilityTypeNode");
            otherLiabilityTypeNodeInjector.injectMembers(node);
            configureOtherLiabilityTypeNode(node);
            return node;
        }

        @Override
        public OtherLiabilityDescriptionNode createOtherLiabilityDescriptionNode() {
            OtherLiabilityDescriptionNode node = newOtherLiabilityDescriptionNode(parent, "otherLiabilityDescriptionNode");
            otherLiabilityDescriptionNodeInjector.injectMembers(node);
            configureOtherLiabilityDescriptionNode(node);
            return node;
        }

        @Override
        public OtherLiabilityLimitAmountNode createOtherLiabilityLimitAmountNode() {
            OtherLiabilityLimitAmountNode node = newOtherLiabilityLimitAmountNode(parent, "otherLiabilityLimitAmountNode");
            otherLiabilityLimitAmountNodeInjector.injectMembers(node);
            configureOtherLiabilityLimitAmountNode(node);
            return node;
        }

        @Override
        public OtherLiabilityAmountOwningNode createOtherLiabilityAmountOwningNode() {
            OtherLiabilityAmountOwningNode node = newOtherLiabilityAmountOwningNode(parent, "otherLiabilityAmountOwningNode");
            otherLiabilityAmountOwningNodeInjector.injectMembers(node);
            configureOtherLiabilityAmountOwningNode(node);
            return node;
        }

        @Override
        public OtherLiabilityMonthlyRepaymentNode createOtherLiabilityMonthlyRepaymentNode() {
            OtherLiabilityMonthlyRepaymentNode node = newOtherLiabilityMonthlyRepaymentNode(parent, "otherLiabilityMonthlyRepaymentNode");
            otherLiabilityMonthlyRepaymentNodeInjector.injectMembers(node);
            configureOtherLiabilityMonthlyRepaymentNode(node);
            return node;
        }

        @Override
        public OtherLiabilityClearingFlagNode createOtherLiabilityClearingFlagNode() {
            OtherLiabilityClearingFlagNode node = newOtherLiabilityClearingFlagNode(parent, "otherLiabilityClearingFlagNode");
            otherLiabilityClearingFlagNodeInjector.injectMembers(node);
            configureOtherLiabilityClearingFlagNode(node);
            return node;
        }

        @Override
        public OtherLiabilityBreakCostNode createOtherLiabilityBreakCostNode() {
            OtherLiabilityBreakCostNode node = newOtherLiabilityBreakCostNode(parent, "otherLiabilityBreakCostNode");
            otherLiabilityBreakCostNodeInjector.injectMembers(node);
            configureOtherLiabilityBreakCostNode(node);
            return node;
        }

        @Override
        public OtherLiabilityOwnershipListNode createOwnershipListNode() {
            OtherLiabilityOwnershipListNode node = newOwnershipListNode(parent, "ownershipListNode");
            otherLiabilityOwnershipListNodeInjector.injectMembers(node);
            configureOwnershipListNode(node);
            return node;
        }

    }
}
