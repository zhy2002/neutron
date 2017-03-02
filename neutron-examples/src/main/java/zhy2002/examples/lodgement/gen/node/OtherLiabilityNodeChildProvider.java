package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface OtherLiabilityNodeChildFactory {
    OtherLiabilityTypeNode createOtherLiabilityTypeNode();
    OtherLiabilityDescriptionNode createOtherLiabilityDescriptionNode();
    OtherLiabilityLimitAmountNode createOtherLiabilityLimitAmountNode();
    OtherLiabilityAmountOwningNode createOtherLiabilityAmountOwningNode();
    OtherLiabilityMonthlyRepaymentNode createOtherLiabilityMonthlyRepaymentNode();
    OtherLiabilityClearingFlagNode createOtherLiabilityClearingFlagNode();
    OtherLiabilityBreakCostNode createOtherLiabilityBreakCostNode();
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

    protected OtherLiabilityTypeNode newOtherLiabilityTypeNode(
        OtherLiabilityNode parent,
        String name
    ) {
        return new OtherLiabilityTypeNode(parent, name);
    }

    protected void configureOtherLiabilityTypeNode(OtherLiabilityTypeNode node) {
    }

    protected OtherLiabilityDescriptionNode newOtherLiabilityDescriptionNode(
        OtherLiabilityNode parent,
        String name
    ) {
        return new OtherLiabilityDescriptionNode(parent, name);
    }

    protected void configureOtherLiabilityDescriptionNode(OtherLiabilityDescriptionNode node) {
    }

    protected OtherLiabilityLimitAmountNode newOtherLiabilityLimitAmountNode(
        OtherLiabilityNode parent,
        String name
    ) {
        return new OtherLiabilityLimitAmountNode(parent, name);
    }

    protected void configureOtherLiabilityLimitAmountNode(OtherLiabilityLimitAmountNode node) {
    }

    protected OtherLiabilityAmountOwningNode newOtherLiabilityAmountOwningNode(
        OtherLiabilityNode parent,
        String name
    ) {
        return new OtherLiabilityAmountOwningNode(parent, name);
    }

    protected void configureOtherLiabilityAmountOwningNode(OtherLiabilityAmountOwningNode node) {
    }

    protected OtherLiabilityMonthlyRepaymentNode newOtherLiabilityMonthlyRepaymentNode(
        OtherLiabilityNode parent,
        String name
    ) {
        return new OtherLiabilityMonthlyRepaymentNode(parent, name);
    }

    protected void configureOtherLiabilityMonthlyRepaymentNode(OtherLiabilityMonthlyRepaymentNode node) {
    }

    protected OtherLiabilityClearingFlagNode newOtherLiabilityClearingFlagNode(
        OtherLiabilityNode parent,
        String name
    ) {
        return new OtherLiabilityClearingFlagNode(parent, name);
    }

    protected void configureOtherLiabilityClearingFlagNode(OtherLiabilityClearingFlagNode node) {
    }

    protected OtherLiabilityBreakCostNode newOtherLiabilityBreakCostNode(
        OtherLiabilityNode parent,
        String name
    ) {
        return new OtherLiabilityBreakCostNode(parent, name);
    }

    protected void configureOtherLiabilityBreakCostNode(OtherLiabilityBreakCostNode node) {
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

    }
}
