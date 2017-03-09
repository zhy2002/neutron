package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;


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
    MembersInjector<LoanLimitAmountNode> loanLimitAmountNodeInjector;
    @Inject
    MembersInjector<LoanOwingAmountNode> loanOwingAmountNodeInjector;
    @Inject
    MembersInjector<LoanTypeNode> loanTypeNodeInjector;
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

    protected MembersInjector<LoanLimitAmountNode> getLoanLimitAmountNodeInjector() {
        return this.loanLimitAmountNodeInjector;
    }

    protected MembersInjector<LoanOwingAmountNode> getLoanOwingAmountNodeInjector() {
        return this.loanOwingAmountNodeInjector;
    }

    protected MembersInjector<LoanTypeNode> getLoanTypeNodeInjector() {
        return this.loanTypeNodeInjector;
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

    @LoanTypeNodeScope
    public static class LoanTypeNodeRuleProvider implements RuleProvider<LoanTypeNode> {

        @Inject
        public LoanTypeNodeRuleProvider() {

        }

        @Override
        public void initializeState(LoanTypeNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected LoanLenderNameNode newLoanLenderNameNode(
        LoanNode parent,
        String name
    ) {
        return new LoanLenderNameNode(parent, name);
    }

    protected void configureLoanLenderNameNode(LoanLenderNameNode node) {
    }

    @LoanLenderNameNodeScope
    public static class LoanLenderNameNodeRuleProvider implements RuleProvider<LoanLenderNameNode> {

        @Inject
        public LoanLenderNameNodeRuleProvider() {

        }

        @Override
        public void initializeState(LoanLenderNameNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected LoanLimitAmountNode newLoanLimitAmountNode(
        LoanNode parent,
        String name
    ) {
        return new LoanLimitAmountNode(parent, name);
    }

    protected void configureLoanLimitAmountNode(LoanLimitAmountNode node) {
    }

    @LoanLimitAmountNodeScope
    public static class LoanLimitAmountNodeRuleProvider implements RuleProvider<LoanLimitAmountNode> {

        @Inject
        public LoanLimitAmountNodeRuleProvider() {

        }

        @Override
        public void initializeState(LoanLimitAmountNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected LoanOwingAmountNode newLoanOwingAmountNode(
        LoanNode parent,
        String name
    ) {
        return new LoanOwingAmountNode(parent, name);
    }

    protected void configureLoanOwingAmountNode(LoanOwingAmountNode node) {
    }

    @LoanOwingAmountNodeScope
    public static class LoanOwingAmountNodeRuleProvider implements RuleProvider<LoanOwingAmountNode> {

        @Inject
        public LoanOwingAmountNodeRuleProvider() {

        }

        @Override
        public void initializeState(LoanOwingAmountNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected LoanMonthlyRepaymentNode newLoanMonthlyRepaymentNode(
        LoanNode parent,
        String name
    ) {
        return new LoanMonthlyRepaymentNode(parent, name);
    }

    protected void configureLoanMonthlyRepaymentNode(LoanMonthlyRepaymentNode node) {
    }

    @LoanMonthlyRepaymentNodeScope
    public static class LoanMonthlyRepaymentNodeRuleProvider implements RuleProvider<LoanMonthlyRepaymentNode> {

        @Inject
        public LoanMonthlyRepaymentNodeRuleProvider() {

        }

        @Override
        public void initializeState(LoanMonthlyRepaymentNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected LoanClearingFlagNode newLoanClearingFlagNode(
        LoanNode parent,
        String name
    ) {
        return new LoanClearingFlagNode(parent, name);
    }

    protected void configureLoanClearingFlagNode(LoanClearingFlagNode node) {
    }

    @LoanClearingFlagNodeScope
    public static class LoanClearingFlagNodeRuleProvider implements RuleProvider<LoanClearingFlagNode> {

        @Inject
        public LoanClearingFlagNodeRuleProvider() {

        }

        @Override
        public void initializeState(LoanClearingFlagNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected LoanBreakCostNode newLoanBreakCostNode(
        LoanNode parent,
        String name
    ) {
        return new LoanBreakCostNode(parent, name);
    }

    protected void configureLoanBreakCostNode(LoanBreakCostNode node) {
    }

    @LoanBreakCostNodeScope
    public static class LoanBreakCostNodeRuleProvider implements RuleProvider<LoanBreakCostNode> {

        @Inject
        public LoanBreakCostNodeRuleProvider() {

        }

        @Override
        public void initializeState(LoanBreakCostNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
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
