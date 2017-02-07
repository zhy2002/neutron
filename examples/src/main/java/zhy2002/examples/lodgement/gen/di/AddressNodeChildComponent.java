package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@AddressNodeChildScope
@Subcomponent(modules = {AddressNodeChildModule.class})
public interface AddressNodeChildComponent {

    AddressLineNode provideAddressLineNode(@Named("addressLineNode") AddressLineNode impl);
    SuburbNode provideSuburbNode(@Named("suburbNode") SuburbNode impl);
    PostcodeNode providePostcodeNode(@Named("postcodeNode") PostcodeNode impl);
    CountryNode provideCountryNode(@Named("countryNode") CountryNode impl);

}
