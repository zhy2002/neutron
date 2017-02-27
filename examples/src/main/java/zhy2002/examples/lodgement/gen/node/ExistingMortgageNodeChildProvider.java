package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface ExistingMortgageNodeChildFactory {
    MortgageLenderInstitutionNode createMortgageLenderInstitutionNode();
    MortgqageUnpaidBalanceNode createMortgqageUnpaidBalanceNode();
    MortgageLimitAmountNode createMortgageLimitAmountNode();
    MortgageMonthlyRepaymentNode createMortgageMonthlyRepaymentNode();
    MortgageBorrowerRateNode createMortgageBorrowerRateNode();
    MortgageLoanTypeNode createMortgageLoanTypeNode();
    MortgageLoanTermExpiryDateNode createMortgageLoanTermExpiryDateNode();
    MortgageInterestOnlyExpiryDateNode createMortgageInterestOnlyExpiryDateNode();
    MortgageClearingFlagNode createMortgageClearingFlagNode();
    MortgageBreakFeeNode createMortgageBreakFeeNode();
    MortgageChargePositionNode createMortgageChargePositionNode();
    MortgageTermRemainingPeriodNode createMortgageTermRemainingPeriodNode();
    MortgageInterestOnlyRemainingPeriodNode createMortgageInterestOnlyRemainingPeriodNode();
}

@Singleton
public class ExistingMortgageNodeChildProvider {
    @Inject
    MembersInjector<MortgageLoanTypeNode> mortgageLoanTypeNodeInjector;
    @Inject
    MembersInjector<MortgageTermRemainingPeriodNode> mortgageTermRemainingPeriodNodeInjector;
    @Inject
    MembersInjector<MortgageLoanTermExpiryDateNode> mortgageLoanTermExpiryDateNodeInjector;
    @Inject
    MembersInjector<MortgageChargePositionNode> mortgageChargePositionNodeInjector;
    @Inject
    MembersInjector<MortgageInterestOnlyRemainingPeriodNode> mortgageInterestOnlyRemainingPeriodNodeInjector;
    @Inject
    MembersInjector<MortgqageUnpaidBalanceNode> mortgqageUnpaidBalanceNodeInjector;
    @Inject
    MembersInjector<MortgageLimitAmountNode> mortgageLimitAmountNodeInjector;
    @Inject
    MembersInjector<MortgageBreakFeeNode> mortgageBreakFeeNodeInjector;
    @Inject
    MembersInjector<MortgageLenderInstitutionNode> mortgageLenderInstitutionNodeInjector;
    @Inject
    MembersInjector<MortgageClearingFlagNode> mortgageClearingFlagNodeInjector;
    @Inject
    MembersInjector<MortgageMonthlyRepaymentNode> mortgageMonthlyRepaymentNodeInjector;
    @Inject
    MembersInjector<MortgageBorrowerRateNode> mortgageBorrowerRateNodeInjector;
    @Inject
    MembersInjector<MortgageInterestOnlyExpiryDateNode> mortgageInterestOnlyExpiryDateNodeInjector;

    @Inject
    protected ExistingMortgageNodeChildProvider () {}

    protected MembersInjector<MortgageLoanTypeNode> getMortgageLoanTypeNodeInjector() {
        return this.mortgageLoanTypeNodeInjector;
    }

    protected MembersInjector<MortgageTermRemainingPeriodNode> getMortgageTermRemainingPeriodNodeInjector() {
        return this.mortgageTermRemainingPeriodNodeInjector;
    }

    protected MembersInjector<MortgageLoanTermExpiryDateNode> getMortgageLoanTermExpiryDateNodeInjector() {
        return this.mortgageLoanTermExpiryDateNodeInjector;
    }

    protected MembersInjector<MortgageChargePositionNode> getMortgageChargePositionNodeInjector() {
        return this.mortgageChargePositionNodeInjector;
    }

    protected MembersInjector<MortgageInterestOnlyRemainingPeriodNode> getMortgageInterestOnlyRemainingPeriodNodeInjector() {
        return this.mortgageInterestOnlyRemainingPeriodNodeInjector;
    }

    protected MembersInjector<MortgqageUnpaidBalanceNode> getMortgqageUnpaidBalanceNodeInjector() {
        return this.mortgqageUnpaidBalanceNodeInjector;
    }

    protected MembersInjector<MortgageLimitAmountNode> getMortgageLimitAmountNodeInjector() {
        return this.mortgageLimitAmountNodeInjector;
    }

    protected MembersInjector<MortgageBreakFeeNode> getMortgageBreakFeeNodeInjector() {
        return this.mortgageBreakFeeNodeInjector;
    }

    protected MembersInjector<MortgageLenderInstitutionNode> getMortgageLenderInstitutionNodeInjector() {
        return this.mortgageLenderInstitutionNodeInjector;
    }

    protected MembersInjector<MortgageClearingFlagNode> getMortgageClearingFlagNodeInjector() {
        return this.mortgageClearingFlagNodeInjector;
    }

    protected MembersInjector<MortgageMonthlyRepaymentNode> getMortgageMonthlyRepaymentNodeInjector() {
        return this.mortgageMonthlyRepaymentNodeInjector;
    }

    protected MembersInjector<MortgageBorrowerRateNode> getMortgageBorrowerRateNodeInjector() {
        return this.mortgageBorrowerRateNodeInjector;
    }

    protected MembersInjector<MortgageInterestOnlyExpiryDateNode> getMortgageInterestOnlyExpiryDateNodeInjector() {
        return this.mortgageInterestOnlyExpiryDateNodeInjector;
    }

    protected MortgageLenderInstitutionNode newMortgageLenderInstitutionNode(
        ExistingMortgageNode parent,
        String name
    ) {
        return new MortgageLenderInstitutionNode(parent, name);
    }

    protected void configureMortgageLenderInstitutionNode(MortgageLenderInstitutionNode node) {
    }

    protected MortgqageUnpaidBalanceNode newMortgqageUnpaidBalanceNode(
        ExistingMortgageNode parent,
        String name
    ) {
        return new MortgqageUnpaidBalanceNode(parent, name);
    }

    protected void configureMortgqageUnpaidBalanceNode(MortgqageUnpaidBalanceNode node) {
    }

    protected MortgageLimitAmountNode newMortgageLimitAmountNode(
        ExistingMortgageNode parent,
        String name
    ) {
        return new MortgageLimitAmountNode(parent, name);
    }

    protected void configureMortgageLimitAmountNode(MortgageLimitAmountNode node) {
    }

    protected MortgageMonthlyRepaymentNode newMortgageMonthlyRepaymentNode(
        ExistingMortgageNode parent,
        String name
    ) {
        return new MortgageMonthlyRepaymentNode(parent, name);
    }

    protected void configureMortgageMonthlyRepaymentNode(MortgageMonthlyRepaymentNode node) {
    }

    protected MortgageBorrowerRateNode newMortgageBorrowerRateNode(
        ExistingMortgageNode parent,
        String name
    ) {
        return new MortgageBorrowerRateNode(parent, name);
    }

    protected void configureMortgageBorrowerRateNode(MortgageBorrowerRateNode node) {
    }

    protected MortgageLoanTypeNode newMortgageLoanTypeNode(
        ExistingMortgageNode parent,
        String name
    ) {
        return new MortgageLoanTypeNode(parent, name);
    }

    protected void configureMortgageLoanTypeNode(MortgageLoanTypeNode node) {
    }

    protected MortgageLoanTermExpiryDateNode newMortgageLoanTermExpiryDateNode(
        ExistingMortgageNode parent,
        String name
    ) {
        return new MortgageLoanTermExpiryDateNode(parent, name);
    }

    protected void configureMortgageLoanTermExpiryDateNode(MortgageLoanTermExpiryDateNode node) {
    }

    protected MortgageInterestOnlyExpiryDateNode newMortgageInterestOnlyExpiryDateNode(
        ExistingMortgageNode parent,
        String name
    ) {
        return new MortgageInterestOnlyExpiryDateNode(parent, name);
    }

    protected void configureMortgageInterestOnlyExpiryDateNode(MortgageInterestOnlyExpiryDateNode node) {
    }

    protected MortgageClearingFlagNode newMortgageClearingFlagNode(
        ExistingMortgageNode parent,
        String name
    ) {
        return new MortgageClearingFlagNode(parent, name);
    }

    protected void configureMortgageClearingFlagNode(MortgageClearingFlagNode node) {
    }

    protected MortgageBreakFeeNode newMortgageBreakFeeNode(
        ExistingMortgageNode parent,
        String name
    ) {
        return new MortgageBreakFeeNode(parent, name);
    }

    protected void configureMortgageBreakFeeNode(MortgageBreakFeeNode node) {
    }

    protected MortgageChargePositionNode newMortgageChargePositionNode(
        ExistingMortgageNode parent,
        String name
    ) {
        return new MortgageChargePositionNode(parent, name);
    }

    protected void configureMortgageChargePositionNode(MortgageChargePositionNode node) {
    }

    protected MortgageTermRemainingPeriodNode newMortgageTermRemainingPeriodNode(
        ExistingMortgageNode parent,
        String name
    ) {
        return new MortgageTermRemainingPeriodNode(parent, name);
    }

    protected void configureMortgageTermRemainingPeriodNode(MortgageTermRemainingPeriodNode node) {
    }

    protected MortgageInterestOnlyRemainingPeriodNode newMortgageInterestOnlyRemainingPeriodNode(
        ExistingMortgageNode parent,
        String name
    ) {
        return new MortgageInterestOnlyRemainingPeriodNode(parent, name);
    }

    protected void configureMortgageInterestOnlyRemainingPeriodNode(MortgageInterestOnlyRemainingPeriodNode node) {
    }

    ExistingMortgageNodeChildFactory createFactory(ExistingMortgageNode parent) {
        return new ExistingMortgageNodeChildFactoryImpl(parent);
    }

    private class ExistingMortgageNodeChildFactoryImpl implements ExistingMortgageNodeChildFactory {

        private final ExistingMortgageNode parent;
        
        private ExistingMortgageNodeChildFactoryImpl(ExistingMortgageNode parent) {
            this.parent = parent;
        }

        @Override
        public MortgageLenderInstitutionNode createMortgageLenderInstitutionNode() {
            MortgageLenderInstitutionNode node = newMortgageLenderInstitutionNode(parent, "mortgageLenderInstitutionNode");
            mortgageLenderInstitutionNodeInjector.injectMembers(node);
            configureMortgageLenderInstitutionNode(node);
            return node;
        }

        @Override
        public MortgqageUnpaidBalanceNode createMortgqageUnpaidBalanceNode() {
            MortgqageUnpaidBalanceNode node = newMortgqageUnpaidBalanceNode(parent, "mortgqageUnpaidBalanceNode");
            mortgqageUnpaidBalanceNodeInjector.injectMembers(node);
            configureMortgqageUnpaidBalanceNode(node);
            return node;
        }

        @Override
        public MortgageLimitAmountNode createMortgageLimitAmountNode() {
            MortgageLimitAmountNode node = newMortgageLimitAmountNode(parent, "mortgageLimitAmountNode");
            mortgageLimitAmountNodeInjector.injectMembers(node);
            configureMortgageLimitAmountNode(node);
            return node;
        }

        @Override
        public MortgageMonthlyRepaymentNode createMortgageMonthlyRepaymentNode() {
            MortgageMonthlyRepaymentNode node = newMortgageMonthlyRepaymentNode(parent, "mortgageMonthlyRepaymentNode");
            mortgageMonthlyRepaymentNodeInjector.injectMembers(node);
            configureMortgageMonthlyRepaymentNode(node);
            return node;
        }

        @Override
        public MortgageBorrowerRateNode createMortgageBorrowerRateNode() {
            MortgageBorrowerRateNode node = newMortgageBorrowerRateNode(parent, "mortgageBorrowerRateNode");
            mortgageBorrowerRateNodeInjector.injectMembers(node);
            configureMortgageBorrowerRateNode(node);
            return node;
        }

        @Override
        public MortgageLoanTypeNode createMortgageLoanTypeNode() {
            MortgageLoanTypeNode node = newMortgageLoanTypeNode(parent, "mortgageLoanTypeNode");
            mortgageLoanTypeNodeInjector.injectMembers(node);
            configureMortgageLoanTypeNode(node);
            return node;
        }

        @Override
        public MortgageLoanTermExpiryDateNode createMortgageLoanTermExpiryDateNode() {
            MortgageLoanTermExpiryDateNode node = newMortgageLoanTermExpiryDateNode(parent, "mortgageLoanTermExpiryDateNode");
            mortgageLoanTermExpiryDateNodeInjector.injectMembers(node);
            configureMortgageLoanTermExpiryDateNode(node);
            return node;
        }

        @Override
        public MortgageInterestOnlyExpiryDateNode createMortgageInterestOnlyExpiryDateNode() {
            MortgageInterestOnlyExpiryDateNode node = newMortgageInterestOnlyExpiryDateNode(parent, "mortgageInterestOnlyExpiryDateNode");
            mortgageInterestOnlyExpiryDateNodeInjector.injectMembers(node);
            configureMortgageInterestOnlyExpiryDateNode(node);
            return node;
        }

        @Override
        public MortgageClearingFlagNode createMortgageClearingFlagNode() {
            MortgageClearingFlagNode node = newMortgageClearingFlagNode(parent, "mortgageClearingFlagNode");
            mortgageClearingFlagNodeInjector.injectMembers(node);
            configureMortgageClearingFlagNode(node);
            return node;
        }

        @Override
        public MortgageBreakFeeNode createMortgageBreakFeeNode() {
            MortgageBreakFeeNode node = newMortgageBreakFeeNode(parent, "mortgageBreakFeeNode");
            mortgageBreakFeeNodeInjector.injectMembers(node);
            configureMortgageBreakFeeNode(node);
            return node;
        }

        @Override
        public MortgageChargePositionNode createMortgageChargePositionNode() {
            MortgageChargePositionNode node = newMortgageChargePositionNode(parent, "mortgageChargePositionNode");
            mortgageChargePositionNodeInjector.injectMembers(node);
            configureMortgageChargePositionNode(node);
            return node;
        }

        @Override
        public MortgageTermRemainingPeriodNode createMortgageTermRemainingPeriodNode() {
            MortgageTermRemainingPeriodNode node = newMortgageTermRemainingPeriodNode(parent, "mortgageTermRemainingPeriodNode");
            mortgageTermRemainingPeriodNodeInjector.injectMembers(node);
            configureMortgageTermRemainingPeriodNode(node);
            return node;
        }

        @Override
        public MortgageInterestOnlyRemainingPeriodNode createMortgageInterestOnlyRemainingPeriodNode() {
            MortgageInterestOnlyRemainingPeriodNode node = newMortgageInterestOnlyRemainingPeriodNode(parent, "mortgageInterestOnlyRemainingPeriodNode");
            mortgageInterestOnlyRemainingPeriodNodeInjector.injectMembers(node);
            configureMortgageInterestOnlyRemainingPeriodNode(node);
            return node;
        }

    }
}
