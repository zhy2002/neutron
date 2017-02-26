package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface PersonPrivacyNodeChildFactory {
    CreditCheckFlagNode createCreditCheckFlagNode();
    ThirdPartyDisclosureFlagNode createThirdPartyDisclosureFlagNode();
    LegalActionNode createLegalActionNode();
}

@Singleton
public class PersonPrivacyNodeChildProvider {
    @Inject
    MembersInjector<ThirdPartyDisclosureFlagNode> thirdPartyDisclosureFlagNodeInjector;
    @Inject
    MembersInjector<LegalActionNode> legalActionNodeInjector;
    @Inject
    MembersInjector<CreditCheckFlagNode> creditCheckFlagNodeInjector;

    @Inject
    protected PersonPrivacyNodeChildProvider () {}

    protected MembersInjector<ThirdPartyDisclosureFlagNode> getThirdPartyDisclosureFlagNodeInjector() {
        return this.thirdPartyDisclosureFlagNodeInjector;
    }

    protected MembersInjector<LegalActionNode> getLegalActionNodeInjector() {
        return this.legalActionNodeInjector;
    }

    protected MembersInjector<CreditCheckFlagNode> getCreditCheckFlagNodeInjector() {
        return this.creditCheckFlagNodeInjector;
    }

    protected CreditCheckFlagNode newCreditCheckFlagNode(
        PersonPrivacyNode parent,
        String name
    ) {
        return new CreditCheckFlagNode(parent, name);
    }

    protected void configureCreditCheckFlagNode(CreditCheckFlagNode node) {
    }

    protected ThirdPartyDisclosureFlagNode newThirdPartyDisclosureFlagNode(
        PersonPrivacyNode parent,
        String name
    ) {
        return new ThirdPartyDisclosureFlagNode(parent, name);
    }

    protected void configureThirdPartyDisclosureFlagNode(ThirdPartyDisclosureFlagNode node) {
    }

    protected LegalActionNode newLegalActionNode(
        PersonPrivacyNode parent,
        String name
    ) {
        return new LegalActionNode(parent, name);
    }

    protected void configureLegalActionNode(LegalActionNode node) {
    }

    PersonPrivacyNodeChildFactory createFactory(PersonPrivacyNode parent) {
        return new PersonPrivacyNodeChildFactoryImpl(parent);
    }

    private class PersonPrivacyNodeChildFactoryImpl implements PersonPrivacyNodeChildFactory {

        private final PersonPrivacyNode parent;
        
        private PersonPrivacyNodeChildFactoryImpl(PersonPrivacyNode parent) {
            this.parent = parent;
        }

        @Override
        public CreditCheckFlagNode createCreditCheckFlagNode() {
            CreditCheckFlagNode node = newCreditCheckFlagNode(parent, "creditCheckFlagNode");
            creditCheckFlagNodeInjector.injectMembers(node);
            configureCreditCheckFlagNode(node);
            return node;
        }

        @Override
        public ThirdPartyDisclosureFlagNode createThirdPartyDisclosureFlagNode() {
            ThirdPartyDisclosureFlagNode node = newThirdPartyDisclosureFlagNode(parent, "thirdPartyDisclosureFlagNode");
            thirdPartyDisclosureFlagNodeInjector.injectMembers(node);
            configureThirdPartyDisclosureFlagNode(node);
            return node;
        }

        @Override
        public LegalActionNode createLegalActionNode() {
            LegalActionNode node = newLegalActionNode(parent, "legalActionNode");
            legalActionNodeInjector.injectMembers(node);
            configureLegalActionNode(node);
            return node;
        }

    }
}
