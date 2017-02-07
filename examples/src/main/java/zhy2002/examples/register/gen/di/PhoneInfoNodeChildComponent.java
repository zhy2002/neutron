package zhy2002.examples.register.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.register.gen.*;

@PhoneInfoNodeChildScope
@Subcomponent(modules = {PhoneInfoNodeChildModule.class})
public interface PhoneInfoNodeChildComponent {

    CountryCodeNode provideCountryCodeNode(@Named("countryCodeNode") CountryCodeNode impl);
    AreaCodeNode provideAreaCodeNode(@Named("areaCodeNode") AreaCodeNode impl);
    PhoneNumberNode providePhoneNumberNode(@Named("phoneNumberNode") PhoneNumberNode impl);

    @Subcomponent.Builder
    interface Builder {

        Builder setPhoneInfoNodeChildModule(PhoneInfoNodeChildModule module);

        PhoneInfoNodeChildComponent build();
    }
}
