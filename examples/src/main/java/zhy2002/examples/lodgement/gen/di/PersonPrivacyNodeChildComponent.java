package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@PersonPrivacyNodeChildScope
@Subcomponent(modules = {PersonPrivacyNodeChildModule.class})
public interface PersonPrivacyNodeChildComponent {

    CreditCheckFlagNode provideCreditCheckFlagNode(@Named("creditCheckFlagNode") CreditCheckFlagNode impl);
    ThirdPartyDisclosureFlagNode provideThirdPartyDisclosureFlagNode(@Named("thirdPartyDisclosureFlagNode") ThirdPartyDisclosureFlagNode impl);
    LegalActionNode provideLegalActionNode(@Named("legalActionNode") LegalActionNode impl);

}
