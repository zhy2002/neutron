package zhy2002.examples.lodgement.gen;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface CreditCardNodeChildFactory {
    CreditCardTypeNode createCreditCardTypeNode();
    CreditCardAmountOwingNode createCreditCardAmountOwingNode();
    CreditCardLimitAmount createCreditCardLimitAmount();
    CreditCardMonthlyRepayment createCreditCardMonthlyRepayment();
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
    MembersInjector<CreditCardLimitAmount> creditCardLimitAmountInjector;
    @Inject
    MembersInjector<CreditCardMonthlyRepayment> creditCardMonthlyRepaymentInjector;
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

    protected MembersInjector<CreditCardLimitAmount> getCreditCardLimitAmountInjector() {
        return this.creditCardLimitAmountInjector;
    }

    protected MembersInjector<CreditCardMonthlyRepayment> getCreditCardMonthlyRepaymentInjector() {
        return this.creditCardMonthlyRepaymentInjector;
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

    protected CreditCardAmountOwingNode newCreditCardAmountOwingNode(
        CreditCardNode parent,
        String name
    ) {
        return new CreditCardAmountOwingNode(parent, name);
    }

    protected CreditCardLimitAmount newCreditCardLimitAmount(
        CreditCardNode parent,
        String name
    ) {
        return new CreditCardLimitAmount(parent, name);
    }

    protected CreditCardMonthlyRepayment newCreditCardMonthlyRepayment(
        CreditCardNode parent,
        String name
    ) {
        return new CreditCardMonthlyRepayment(parent, name);
    }

    protected CreditCardClearingFlagNode newCreditCardClearingFlagNode(
        CreditCardNode parent,
        String name
    ) {
        return new CreditCardClearingFlagNode(parent, name);
    }

    protected CreditCardBreakCostNode newCreditCardBreakCostNode(
        CreditCardNode parent,
        String name
    ) {
        return new CreditCardBreakCostNode(parent, name);
    }

    protected CreditCardLenderNameNode newCreditCardLenderNameNode(
        CreditCardNode parent,
        String name
    ) {
        return new CreditCardLenderNameNode(parent, name);
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
            return node;
        }

        @Override
        public CreditCardAmountOwingNode createCreditCardAmountOwingNode() {
            CreditCardAmountOwingNode node = newCreditCardAmountOwingNode(parent, "creditCardAmountOwingNode");
            creditCardAmountOwingNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public CreditCardLimitAmount createCreditCardLimitAmount() {
            CreditCardLimitAmount node = newCreditCardLimitAmount(parent, "creditCardLimitAmount");
            creditCardLimitAmountInjector.injectMembers(node);
            return node;
        }

        @Override
        public CreditCardMonthlyRepayment createCreditCardMonthlyRepayment() {
            CreditCardMonthlyRepayment node = newCreditCardMonthlyRepayment(parent, "creditCardMonthlyRepayment");
            creditCardMonthlyRepaymentInjector.injectMembers(node);
            return node;
        }

        @Override
        public CreditCardClearingFlagNode createCreditCardClearingFlagNode() {
            CreditCardClearingFlagNode node = newCreditCardClearingFlagNode(parent, "creditCardClearingFlagNode");
            creditCardClearingFlagNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public CreditCardBreakCostNode createCreditCardBreakCostNode() {
            CreditCardBreakCostNode node = newCreditCardBreakCostNode(parent, "creditCardBreakCostNode");
            creditCardBreakCostNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public CreditCardLenderNameNode createCreditCardLenderNameNode() {
            CreditCardLenderNameNode node = newCreditCardLenderNameNode(parent, "creditCardLenderNameNode");
            creditCardLenderNameNodeInjector.injectMembers(node);
            return node;
        }

    }
}
