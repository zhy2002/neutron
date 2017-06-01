package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;

public interface BasePrivacyNodeComponent {

    CreditCheckFlagNode createCreditCheckFlagNode();
    ThirdPartyDisclosureFlagNode createThirdPartyDisclosureFlagNode();
    LegalActionNode createLegalActionNode();
    CreditHistoryListNode createCreditHistoryListNode();

}
