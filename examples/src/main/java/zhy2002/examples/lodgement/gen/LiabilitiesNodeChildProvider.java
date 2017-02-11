package zhy2002.examples.lodgement.gen;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface LiabilitiesNodeChildFactory {
    CreditCardListNode createCreditCardListNode();
    LoanListNode createLoanListNode();
    OtherLiabilityListNode createOtherLiabilityListNode();
}

@Singleton
public class LiabilitiesNodeChildProvider {
    @Inject
    MembersInjector<CreditCardListNode> creditCardListNodeInjector;
    @Inject
    MembersInjector<LoanListNode> loanListNodeInjector;
    @Inject
    MembersInjector<OtherLiabilityListNode> otherLiabilityListNodeInjector;

    @Inject
    protected LiabilitiesNodeChildProvider () {}

    protected MembersInjector<CreditCardListNode> getCreditCardListNodeInjector() {
        return this.creditCardListNodeInjector;
    }

    protected MembersInjector<LoanListNode> getLoanListNodeInjector() {
        return this.loanListNodeInjector;
    }

    protected MembersInjector<OtherLiabilityListNode> getOtherLiabilityListNodeInjector() {
        return this.otherLiabilityListNodeInjector;
    }

    protected CreditCardListNode newCreditCardListNode(
        LiabilitiesNode parent,
        String name
    ) {
        return new CreditCardListNode(parent, name);
    }

    protected void configureCreditCardListNode(CreditCardListNode node) {
    }

    protected LoanListNode newLoanListNode(
        LiabilitiesNode parent,
        String name
    ) {
        return new LoanListNode(parent, name);
    }

    protected void configureLoanListNode(LoanListNode node) {
    }

    protected OtherLiabilityListNode newOtherLiabilityListNode(
        LiabilitiesNode parent,
        String name
    ) {
        return new OtherLiabilityListNode(parent, name);
    }

    protected void configureOtherLiabilityListNode(OtherLiabilityListNode node) {
    }

    LiabilitiesNodeChildFactory createFactory(LiabilitiesNode parent) {
        return new LiabilitiesNodeChildFactoryImpl(parent);
    }

    private class LiabilitiesNodeChildFactoryImpl implements LiabilitiesNodeChildFactory {

        private final LiabilitiesNode parent;
        
        private LiabilitiesNodeChildFactoryImpl(LiabilitiesNode parent) {
            this.parent = parent;
        }

        @Override
        public CreditCardListNode createCreditCardListNode() {
            CreditCardListNode node = newCreditCardListNode(parent, "creditCardListNode");
            creditCardListNodeInjector.injectMembers(node);
            configureCreditCardListNode(node);
            return node;
        }

        @Override
        public LoanListNode createLoanListNode() {
            LoanListNode node = newLoanListNode(parent, "loanListNode");
            loanListNodeInjector.injectMembers(node);
            configureLoanListNode(node);
            return node;
        }

        @Override
        public OtherLiabilityListNode createOtherLiabilityListNode() {
            OtherLiabilityListNode node = newOtherLiabilityListNode(parent, "otherLiabilityListNode");
            otherLiabilityListNodeInjector.injectMembers(node);
            configureOtherLiabilityListNode(node);
            return node;
        }

    }
}
