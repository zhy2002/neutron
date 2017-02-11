package zhy2002.examples.lodgement.gen;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface LoanNodeChildFactory {
    LoanTypeNode createLoanTypeNode();
    LoanLenderNameNode createLoanLenderNameNode();
    LoanLimitAmountNode createLoanLimitAmountNode();
    LoanOwingAmountNode createLoanOwingAmountNode();
    LoanMonthlyRepaymentNode createLoanMonthlyRepaymentNode();
    LoanClearingFlagNode createLoanClearingFlagNode();
    LoanBreakCostNode createLoanBreakCostNode();
}

@Singleton
public class LoanNodeChildProvider {
    @Inject
    MembersInjector<LoanTypeNode> loanTypeNodeInjector;
    @Inject
    MembersInjector<LoanOwingAmountNode> loanOwingAmountNodeInjector;
    @Inject
    MembersInjector<LoanLimitAmountNode> loanLimitAmountNodeInjector;
    @Inject
    MembersInjector<LoanMonthlyRepaymentNode> loanMonthlyRepaymentNodeInjector;
    @Inject
    MembersInjector<LoanClearingFlagNode> loanClearingFlagNodeInjector;
    @Inject
    MembersInjector<LoanBreakCostNode> loanBreakCostNodeInjector;
    @Inject
    MembersInjector<LoanLenderNameNode> loanLenderNameNodeInjector;

    @Inject
    protected LoanNodeChildProvider () {}

    protected MembersInjector<LoanTypeNode> getLoanTypeNodeInjector() {
        return this.loanTypeNodeInjector;
    }

    protected MembersInjector<LoanOwingAmountNode> getLoanOwingAmountNodeInjector() {
        return this.loanOwingAmountNodeInjector;
    }

    protected MembersInjector<LoanLimitAmountNode> getLoanLimitAmountNodeInjector() {
        return this.loanLimitAmountNodeInjector;
    }

    protected MembersInjector<LoanMonthlyRepaymentNode> getLoanMonthlyRepaymentNodeInjector() {
        return this.loanMonthlyRepaymentNodeInjector;
    }

    protected MembersInjector<LoanClearingFlagNode> getLoanClearingFlagNodeInjector() {
        return this.loanClearingFlagNodeInjector;
    }

    protected MembersInjector<LoanBreakCostNode> getLoanBreakCostNodeInjector() {
        return this.loanBreakCostNodeInjector;
    }

    protected MembersInjector<LoanLenderNameNode> getLoanLenderNameNodeInjector() {
        return this.loanLenderNameNodeInjector;
    }

    protected LoanTypeNode newLoanTypeNode(
        LoanNode parent,
        String name
    ) {
        return new LoanTypeNode(parent, name);
    }

    protected void configureLoanTypeNode(LoanTypeNode node) {
    }

    protected LoanLenderNameNode newLoanLenderNameNode(
        LoanNode parent,
        String name
    ) {
        return new LoanLenderNameNode(parent, name);
    }

    protected void configureLoanLenderNameNode(LoanLenderNameNode node) {
    }

    protected LoanLimitAmountNode newLoanLimitAmountNode(
        LoanNode parent,
        String name
    ) {
        return new LoanLimitAmountNode(parent, name);
    }

    protected void configureLoanLimitAmountNode(LoanLimitAmountNode node) {
    }

    protected LoanOwingAmountNode newLoanOwingAmountNode(
        LoanNode parent,
        String name
    ) {
        return new LoanOwingAmountNode(parent, name);
    }

    protected void configureLoanOwingAmountNode(LoanOwingAmountNode node) {
    }

    protected LoanMonthlyRepaymentNode newLoanMonthlyRepaymentNode(
        LoanNode parent,
        String name
    ) {
        return new LoanMonthlyRepaymentNode(parent, name);
    }

    protected void configureLoanMonthlyRepaymentNode(LoanMonthlyRepaymentNode node) {
    }

    protected LoanClearingFlagNode newLoanClearingFlagNode(
        LoanNode parent,
        String name
    ) {
        return new LoanClearingFlagNode(parent, name);
    }

    protected void configureLoanClearingFlagNode(LoanClearingFlagNode node) {
    }

    protected LoanBreakCostNode newLoanBreakCostNode(
        LoanNode parent,
        String name
    ) {
        return new LoanBreakCostNode(parent, name);
    }

    protected void configureLoanBreakCostNode(LoanBreakCostNode node) {
    }

    LoanNodeChildFactory createFactory(LoanNode parent) {
        return new LoanNodeChildFactoryImpl(parent);
    }

    private class LoanNodeChildFactoryImpl implements LoanNodeChildFactory {

        private final LoanNode parent;
        
        private LoanNodeChildFactoryImpl(LoanNode parent) {
            this.parent = parent;
        }

        @Override
        public LoanTypeNode createLoanTypeNode() {
            LoanTypeNode node = newLoanTypeNode(parent, "loanTypeNode");
            loanTypeNodeInjector.injectMembers(node);
            configureLoanTypeNode(node);
            return node;
        }

        @Override
        public LoanLenderNameNode createLoanLenderNameNode() {
            LoanLenderNameNode node = newLoanLenderNameNode(parent, "loanLenderNameNode");
            loanLenderNameNodeInjector.injectMembers(node);
            configureLoanLenderNameNode(node);
            return node;
        }

        @Override
        public LoanLimitAmountNode createLoanLimitAmountNode() {
            LoanLimitAmountNode node = newLoanLimitAmountNode(parent, "loanLimitAmountNode");
            loanLimitAmountNodeInjector.injectMembers(node);
            configureLoanLimitAmountNode(node);
            return node;
        }

        @Override
        public LoanOwingAmountNode createLoanOwingAmountNode() {
            LoanOwingAmountNode node = newLoanOwingAmountNode(parent, "loanOwingAmountNode");
            loanOwingAmountNodeInjector.injectMembers(node);
            configureLoanOwingAmountNode(node);
            return node;
        }

        @Override
        public LoanMonthlyRepaymentNode createLoanMonthlyRepaymentNode() {
            LoanMonthlyRepaymentNode node = newLoanMonthlyRepaymentNode(parent, "loanMonthlyRepaymentNode");
            loanMonthlyRepaymentNodeInjector.injectMembers(node);
            configureLoanMonthlyRepaymentNode(node);
            return node;
        }

        @Override
        public LoanClearingFlagNode createLoanClearingFlagNode() {
            LoanClearingFlagNode node = newLoanClearingFlagNode(parent, "loanClearingFlagNode");
            loanClearingFlagNodeInjector.injectMembers(node);
            configureLoanClearingFlagNode(node);
            return node;
        }

        @Override
        public LoanBreakCostNode createLoanBreakCostNode() {
            LoanBreakCostNode node = newLoanBreakCostNode(parent, "loanBreakCostNode");
            loanBreakCostNodeInjector.injectMembers(node);
            configureLoanBreakCostNode(node);
            return node;
        }

    }
}
