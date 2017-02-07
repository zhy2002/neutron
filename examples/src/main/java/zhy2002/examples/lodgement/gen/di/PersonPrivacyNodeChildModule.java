package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
})
@PersonPrivacyNodeChildScope
public class PersonPrivacyNodeChildModule {


    @Provides
    @PersonPrivacyNodeChildScope
    @Named("creditCheckFlagNode")
    CreditCheckFlagNode provideCreditCheckFlagNode(
        PersonPrivacyNode parent,
        MembersInjector<CreditCheckFlagNode> injector
    ) {
        CreditCheckFlagNode node = new CreditCheckFlagNode(parent, "creditCheckFlagNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @PersonPrivacyNodeChildScope
    @Named("thirdPartyDisclosureFlagNode")
    ThirdPartyDisclosureFlagNode provideThirdPartyDisclosureFlagNode(
        PersonPrivacyNode parent,
        MembersInjector<ThirdPartyDisclosureFlagNode> injector
    ) {
        ThirdPartyDisclosureFlagNode node = new ThirdPartyDisclosureFlagNode(parent, "thirdPartyDisclosureFlagNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @PersonPrivacyNodeChildScope
    @Named("legalActionNode")
    LegalActionNode provideLegalActionNode(
        PersonPrivacyNode parent,
        MembersInjector<LegalActionNode> injector
    ) {
        LegalActionNode node = new LegalActionNode(parent, "legalActionNode");

        injector.injectMembers(node);
        return node;
    }

}