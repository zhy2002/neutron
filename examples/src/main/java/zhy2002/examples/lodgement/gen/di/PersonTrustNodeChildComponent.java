package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@PersonTrustNodeChildScope
@Subcomponent(modules = {PersonTrustNodeChildModule.class})
public interface PersonTrustNodeChildComponent {

    PersonTrustTypeNode providePersonTrustTypeNode(@Named("personTrustTypeNode") PersonTrustTypeNode impl);
    PersonTrustNameNode providePersonTrustNameNode(@Named("personTrustNameNode") PersonTrustNameNode impl);
    PersonTrustRegistrationDateNode providePersonTrustRegistrationDateNode(@Named("personTrustRegistrationDateNode") PersonTrustRegistrationDateNode impl);
    PersonTrustCountryNode providePersonTrustCountryNode(@Named("personTrustCountryNode") PersonTrustCountryNode impl);
    PersonTrustAddressNode providePersonTrustAddressNode(@Named("personTrustAddressNode") PersonTrustAddressNode impl);
    PersonTrustSettlorNotRequiredReasonNode providePersonTrustSettlorNotRequiredReasonNode(@Named("personTrustSettlorNotRequiredReasonNode") PersonTrustSettlorNotRequiredReasonNode impl);
    PersonTrustIndustryNode providePersonTrustIndustryNode(@Named("personTrustIndustryNode") PersonTrustIndustryNode impl);

    @Subcomponent.Builder
    interface Builder {

        Builder setPersonTrustNodeChildModule(PersonTrustNodeChildModule module);

        PersonTrustNodeChildComponent build();
    }
}
