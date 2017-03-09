package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;


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
    MembersInjector<OtherLiabilityListNode> otherLiabilityListNodeInjector;
    @Inject
    MembersInjector<LoanListNode> loanListNodeInjector;

    @Inject
    protected LiabilitiesNodeChildProvider () {}

    protected MembersInjector<CreditCardListNode> getCreditCardListNodeInjector() {
        return this.creditCardListNodeInjector;
    }

    protected MembersInjector<OtherLiabilityListNode> getOtherLiabilityListNodeInjector() {
        return this.otherLiabilityListNodeInjector;
    }

    protected MembersInjector<LoanListNode> getLoanListNodeInjector() {
        return this.loanListNodeInjector;
    }

    protected CreditCardListNode newCreditCardListNode(
        LiabilitiesNode parent,
        String name
    ) {
        return new CreditCardListNode(parent, name);
    }

    protected void configureCreditCardListNode(CreditCardListNode node) {
    }

    @CreditCardListNodeScope
    public static class CreditCardListNodeRuleProvider implements RuleProvider<CreditCardListNode> {

        @Inject
        public CreditCardListNodeRuleProvider() {

        }

        @Override
        public void initializeState(CreditCardListNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected LoanListNode newLoanListNode(
        LiabilitiesNode parent,
        String name
    ) {
        return new LoanListNode(parent, name);
    }

    protected void configureLoanListNode(LoanListNode node) {
    }

    @LoanListNodeScope
    public static class LoanListNodeRuleProvider implements RuleProvider<LoanListNode> {

        @Inject
        public LoanListNodeRuleProvider() {

        }

        @Override
        public void initializeState(LoanListNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected OtherLiabilityListNode newOtherLiabilityListNode(
        LiabilitiesNode parent,
        String name
    ) {
        return new OtherLiabilityListNode(parent, name);
    }

    protected void configureOtherLiabilityListNode(OtherLiabilityListNode node) {
    }

    @OtherLiabilityListNodeScope
    public static class OtherLiabilityListNodeRuleProvider implements RuleProvider<OtherLiabilityListNode> {

        @Inject
        public OtherLiabilityListNodeRuleProvider() {

        }

        @Override
        public void initializeState(OtherLiabilityListNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
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
