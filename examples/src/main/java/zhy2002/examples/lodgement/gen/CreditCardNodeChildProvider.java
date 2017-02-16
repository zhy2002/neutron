package zhy2002.examples.lodgement.gen;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface CreditCardNodeChildFactory {
    CreditCardTypeNode createCreditCardTypeNode();
    CreditCardAmountOwingNode createCreditCardAmountOwingNode();
    CreditCardLimitAmountNode createCreditCardLimitAmountNode();
    CreditCardMonthlyRepaymentNode createCreditCardMonthlyRepaymentNode();
    CreditCardClearingFlagNode createCreditCardClearingFlagNode();
    CreditCardBreakCostNode createCreditCardBreakCostNode();
    CreditCardLenderNameNode createCreditCardLenderNameNode();
}

@Singleton
public class CreditCardNodeChildProvider {
    @Inject
    MembersInjector<CreditCardTypeNode> creditCardTypeNodeInjector;
    @Inject
    MembersInjector<CreditCardAmountOwingNode> creditCardAmountOwingNodeInjector;
    @Inject
    MembersInjector<CreditCardLimitAmountNode> creditCardLimitAmountNodeInjector;
    @Inject
    MembersInjector<CreditCardMonthlyRepaymentNode> creditCardMonthlyRepaymentNodeInjector;
    @Inject
    MembersInjector<CreditCardClearingFlagNode> creditCardClearingFlagNodeInjector;
    @Inject
    MembersInjector<CreditCardBreakCostNode> creditCardBreakCostNodeInjector;
    @Inject
    MembersInjector<CreditCardLenderNameNode> creditCardLenderNameNodeInjector;

    @Inject
    protected CreditCardNodeChildProvider () {}

    protected MembersInjector<CreditCardTypeNode> getCreditCardTypeNodeInjector() {
        return this.creditCardTypeNodeInjector;
    }

    protected MembersInjector<CreditCardAmountOwingNode> getCreditCardAmountOwingNodeInjector() {
        return this.creditCardAmountOwingNodeInjector;
    }

    protected MembersInjector<CreditCardLimitAmountNode> getCreditCardLimitAmountNodeInjector() {
        return this.creditCardLimitAmountNodeInjector;
    }

    protected MembersInjector<CreditCardMonthlyRepaymentNode> getCreditCardMonthlyRepaymentNodeInjector() {
        return this.creditCardMonthlyRepaymentNodeInjector;
    }

    protected MembersInjector<CreditCardClearingFlagNode> getCreditCardClearingFlagNodeInjector() {
        return this.creditCardClearingFlagNodeInjector;
    }

    protected MembersInjector<CreditCardBreakCostNode> getCreditCardBreakCostNodeInjector() {
        return this.creditCardBreakCostNodeInjector;
    }

    protected MembersInjector<CreditCardLenderNameNode> getCreditCardLenderNameNodeInjector() {
        return this.creditCardLenderNameNodeInjector;
    }

    protected CreditCardTypeNode newCreditCardTypeNode(
        CreditCardNode parent,
        String name
    ) {
        return new CreditCardTypeNode(parent, name);
    }

    protected void configureCreditCardTypeNode(CreditCardTypeNode node) {
    }

    protected CreditCardAmountOwingNode newCreditCardAmountOwingNode(
        CreditCardNode parent,
        String name
    ) {
        return new CreditCardAmountOwingNode(parent, name);
    }

    protected void configureCreditCardAmountOwingNode(CreditCardAmountOwingNode node) {
    }

    protected CreditCardLimitAmountNode newCreditCardLimitAmountNode(
        CreditCardNode parent,
        String name
    ) {
        return new CreditCardLimitAmountNode(parent, name);
    }

    protected void configureCreditCardLimitAmountNode(CreditCardLimitAmountNode node) {
    }

    protected CreditCardMonthlyRepaymentNode newCreditCardMonthlyRepaymentNode(
        CreditCardNode parent,
        String name
    ) {
        return new CreditCardMonthlyRepaymentNode(parent, name);
    }

    protected void configureCreditCardMonthlyRepaymentNode(CreditCardMonthlyRepaymentNode node) {
    }

    protected CreditCardClearingFlagNode newCreditCardClearingFlagNode(
        CreditCardNode parent,
        String name
    ) {
        return new CreditCardClearingFlagNode(parent, name);
    }

    protected void configureCreditCardClearingFlagNode(CreditCardClearingFlagNode node) {
    }

    protected CreditCardBreakCostNode newCreditCardBreakCostNode(
        CreditCardNode parent,
        String name
    ) {
        return new CreditCardBreakCostNode(parent, name);
    }

    protected void configureCreditCardBreakCostNode(CreditCardBreakCostNode node) {
    }

    protected CreditCardLenderNameNode newCreditCardLenderNameNode(
        CreditCardNode parent,
        String name
    ) {
        return new CreditCardLenderNameNode(parent, name);
    }

    protected void configureCreditCardLenderNameNode(CreditCardLenderNameNode node) {
    }

    CreditCardNodeChildFactory createFactory(CreditCardNode parent) {
        return new CreditCardNodeChildFactoryImpl(parent);
    }

    private class CreditCardNodeChildFactoryImpl implements CreditCardNodeChildFactory {

        private final CreditCardNode parent;
        
        private CreditCardNodeChildFactoryImpl(CreditCardNode parent) {
            this.parent = parent;
        }

        @Override
        public CreditCardTypeNode createCreditCardTypeNode() {
            CreditCardTypeNode node = newCreditCardTypeNode(parent, "creditCardTypeNode");
            creditCardTypeNodeInjector.injectMembers(node);
            configureCreditCardTypeNode(node);
            return node;
        }

        @Override
        public CreditCardAmountOwingNode createCreditCardAmountOwingNode() {
            CreditCardAmountOwingNode node = newCreditCardAmountOwingNode(parent, "creditCardAmountOwingNode");
            creditCardAmountOwingNodeInjector.injectMembers(node);
            configureCreditCardAmountOwingNode(node);
            return node;
        }

        @Override
        public CreditCardLimitAmountNode createCreditCardLimitAmountNode() {
            CreditCardLimitAmountNode node = newCreditCardLimitAmountNode(parent, "creditCardLimitAmountNode");
            creditCardLimitAmountNodeInjector.injectMembers(node);
            configureCreditCardLimitAmountNode(node);
            return node;
        }

        @Override
        public CreditCardMonthlyRepaymentNode createCreditCardMonthlyRepaymentNode() {
            CreditCardMonthlyRepaymentNode node = newCreditCardMonthlyRepaymentNode(parent, "creditCardMonthlyRepaymentNode");
            creditCardMonthlyRepaymentNodeInjector.injectMembers(node);
            configureCreditCardMonthlyRepaymentNode(node);
            return node;
        }

        @Override
        public CreditCardClearingFlagNode createCreditCardClearingFlagNode() {
            CreditCardClearingFlagNode node = newCreditCardClearingFlagNode(parent, "creditCardClearingFlagNode");
            creditCardClearingFlagNodeInjector.injectMembers(node);
            configureCreditCardClearingFlagNode(node);
            return node;
        }

        @Override
        public CreditCardBreakCostNode createCreditCardBreakCostNode() {
            CreditCardBreakCostNode node = newCreditCardBreakCostNode(parent, "creditCardBreakCostNode");
            creditCardBreakCostNodeInjector.injectMembers(node);
            configureCreditCardBreakCostNode(node);
            return node;
        }

        @Override
        public CreditCardLenderNameNode createCreditCardLenderNameNode() {
            CreditCardLenderNameNode node = newCreditCardLenderNameNode(parent, "creditCardLenderNameNode");
            creditCardLenderNameNodeInjector.injectMembers(node);
            configureCreditCardLenderNameNode(node);
            return node;
        }

    }
}
