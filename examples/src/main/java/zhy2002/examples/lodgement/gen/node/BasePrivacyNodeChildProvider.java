package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface BasePrivacyNodeChildFactory {
    CreditCheckFlagNode createCreditCheckFlagNode();
    ThirdPartyDisclosureFlagNode createThirdPartyDisclosureFlagNode();
    LegalActionNode createLegalActionNode();
    CreditHistoryListNode createCreditHistoryListNode();
}

@Singleton
public class BasePrivacyNodeChildProvider {
    @Inject
    MembersInjector<ThirdPartyDisclosureFlagNode> thirdPartyDisclosureFlagNodeInjector;
    @Inject
    MembersInjector<CreditHistoryListNode> creditHistoryListNodeInjector;
    @Inject
    MembersInjector<LegalActionNode> legalActionNodeInjector;
    @Inject
    MembersInjector<CreditCheckFlagNode> creditCheckFlagNodeInjector;

    @Inject
    protected BasePrivacyNodeChildProvider () {}

    protected MembersInjector<ThirdPartyDisclosureFlagNode> getThirdPartyDisclosureFlagNodeInjector() {
        return this.thirdPartyDisclosureFlagNodeInjector;
    }

    protected MembersInjector<CreditHistoryListNode> getCreditHistoryListNodeInjector() {
        return this.creditHistoryListNodeInjector;
    }

    protected MembersInjector<LegalActionNode> getLegalActionNodeInjector() {
        return this.legalActionNodeInjector;
    }

    protected MembersInjector<CreditCheckFlagNode> getCreditCheckFlagNodeInjector() {
        return this.creditCheckFlagNodeInjector;
    }

    protected CreditCheckFlagNode newCreditCheckFlagNode(
        BasePrivacyNode<?> parent,
        String name
    ) {
        return new CreditCheckFlagNode(parent, name);
    }

    protected void configureCreditCheckFlagNode(CreditCheckFlagNode node) {
    }

    protected ThirdPartyDisclosureFlagNode newThirdPartyDisclosureFlagNode(
        BasePrivacyNode<?> parent,
        String name
    ) {
        return new ThirdPartyDisclosureFlagNode(parent, name);
    }

    protected void configureThirdPartyDisclosureFlagNode(ThirdPartyDisclosureFlagNode node) {
    }

    protected LegalActionNode newLegalActionNode(
        BasePrivacyNode<?> parent,
        String name
    ) {
        return new LegalActionNode(parent, name);
    }

    protected void configureLegalActionNode(LegalActionNode node) {
    }

    protected CreditHistoryListNode newCreditHistoryListNode(
        BasePrivacyNode<?> parent,
        String name
    ) {
        return new CreditHistoryListNode(parent, name);
    }

    protected void configureCreditHistoryListNode(CreditHistoryListNode node) {
    }

    BasePrivacyNodeChildFactory createFactory(BasePrivacyNode<?> parent) {
        return new BasePrivacyNodeChildFactoryImpl(parent);
    }

    private class BasePrivacyNodeChildFactoryImpl implements BasePrivacyNodeChildFactory {

        private final BasePrivacyNode<?> parent;
        
        private BasePrivacyNodeChildFactoryImpl(BasePrivacyNode<?> parent) {
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

        @Override
        public CreditHistoryListNode createCreditHistoryListNode() {
            CreditHistoryListNode node = newCreditHistoryListNode(parent, "creditHistoryListNode");
            creditHistoryListNodeInjector.injectMembers(node);
            configureCreditHistoryListNode(node);
            return node;
        }

    }
}
