package zhy2002.examples.register.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.register.gen.*;

@RegisterNodeChildScope
@Subcomponent(modules = {RegisterNodeChildModule.class})
public interface RegisterNodeChildComponent {

    UsernameNode provideUsernameNode(@Named("usernameNode") UsernameNode impl);
    EmailNode provideEmailNode(@Named("emailNode") EmailNode impl);
    PasswordNode providePasswordNode(@Named("passwordNode") PasswordNode impl);
    RepeatPasswordNode provideRepeatPasswordNode(@Named("repeatPasswordNode") RepeatPasswordNode impl);
    AgeNode provideAgeNode(@Named("ageNode") AgeNode impl);
    PlanNode providePlanNode(@Named("planNode") PlanNode impl);
    ReceiveOffersNode provideReceiveOffersNode(@Named("receiveOffersNode") ReceiveOffersNode impl);
    OwnInvestmentPropertyNode provideOwnInvestmentPropertyNode(@Named("ownInvestmentPropertyNode") OwnInvestmentPropertyNode impl);
    PropertyDetailsNode provideResidentialPropertyNode(@Named("residentialPropertyNode") PropertyDetailsNode impl);
    PropertyDetailsNode provideInvestmentPropertyNode(@Named("investmentPropertyNode") PropertyDetailsNode impl);
    PhoneInfoNode provideHomePhoneNode(@Named("homePhoneNode") PhoneInfoNode impl);
    ErrorListNode provideErrorListNode(@Named("errorListNode") ErrorListNode impl);

    @Subcomponent.Builder
    interface Builder {

        Builder setRegisterNodeChildModule(RegisterNodeChildModule module);

        RegisterNodeChildComponent build();
    }
}
