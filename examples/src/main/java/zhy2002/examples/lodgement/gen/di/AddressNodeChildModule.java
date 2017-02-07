package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
})
@AddressNodeChildScope
public class AddressNodeChildModule {


    @Provides
    @AddressNodeChildScope
    @Named("addressLineNode")
    AddressLineNode provideAddressLineNode(
        AddressNode parent,
        MembersInjector<AddressLineNode> injector
    ) {
        AddressLineNode node = new AddressLineNode(parent, "addressLineNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @AddressNodeChildScope
    @Named("suburbNode")
    SuburbNode provideSuburbNode(
        AddressNode parent,
        MembersInjector<SuburbNode> injector
    ) {
        SuburbNode node = new SuburbNode(parent, "suburbNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @AddressNodeChildScope
    @Named("postcodeNode")
    PostcodeNode providePostcodeNode(
        AddressNode parent,
        MembersInjector<PostcodeNode> injector
    ) {
        PostcodeNode node = new PostcodeNode(parent, "postcodeNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @AddressNodeChildScope
    @Named("countryNode")
    CountryNode provideCountryNode(
        AddressNode parent,
        MembersInjector<CountryNode> injector
    ) {
        CountryNode node = new CountryNode(parent, "countryNode");

        injector.injectMembers(node);
        return node;
    }

}