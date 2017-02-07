package zhy2002.examples.register.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.register.gen.*;

@Module(subcomponents = {
})
@PhoneInfoNodeChildScope
public class PhoneInfoNodeChildModule {


    @Provides
    @PhoneInfoNodeChildScope
    @Named("countryCodeNode")
    CountryCodeNode provideCountryCodeNode(
        PhoneInfoNode parent,
        MembersInjector<CountryCodeNode> injector
    ) {
        CountryCodeNode node = new CountryCodeNode(parent, "countryCodeNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @PhoneInfoNodeChildScope
    @Named("areaCodeNode")
    AreaCodeNode provideAreaCodeNode(
        PhoneInfoNode parent,
        MembersInjector<AreaCodeNode> injector
    ) {
        AreaCodeNode node = new AreaCodeNode(parent, "areaCodeNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @PhoneInfoNodeChildScope
    @Named("phoneNumberNode")
    PhoneNumberNode providePhoneNumberNode(
        PhoneInfoNode parent,
        MembersInjector<PhoneNumberNode> injector
    ) {
        PhoneNumberNode node = new PhoneNumberNode(parent, "phoneNumberNode");

        injector.injectMembers(node);
        return node;
    }

}