package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
})
@PersonTrustNodeChildScope
public class PersonTrustNodeChildModule {


    @Provides
    @PersonTrustNodeChildScope
    @Named("personTrustTypeNode")
    PersonTrustTypeNode providePersonTrustTypeNode(
        PersonTrustNode parent,
        MembersInjector<PersonTrustTypeNode> injector
    ) {
        PersonTrustTypeNode node = new PersonTrustTypeNode(parent, "personTrustTypeNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @PersonTrustNodeChildScope
    @Named("personTrustNameNode")
    PersonTrustNameNode providePersonTrustNameNode(
        PersonTrustNode parent,
        MembersInjector<PersonTrustNameNode> injector
    ) {
        PersonTrustNameNode node = new PersonTrustNameNode(parent, "personTrustNameNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @PersonTrustNodeChildScope
    @Named("personTrustRegistrationDateNode")
    PersonTrustRegistrationDateNode providePersonTrustRegistrationDateNode(
        PersonTrustNode parent,
        MembersInjector<PersonTrustRegistrationDateNode> injector
    ) {
        PersonTrustRegistrationDateNode node = new PersonTrustRegistrationDateNode(parent, "personTrustRegistrationDateNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @PersonTrustNodeChildScope
    @Named("personTrustCountryNode")
    PersonTrustCountryNode providePersonTrustCountryNode(
        PersonTrustNode parent,
        MembersInjector<PersonTrustCountryNode> injector
    ) {
        PersonTrustCountryNode node = new PersonTrustCountryNode(parent, "personTrustCountryNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @PersonTrustNodeChildScope
    @Named("personTrustAddressNode")
    PersonTrustAddressNode providePersonTrustAddressNode(
        PersonTrustNode parent,
        MembersInjector<PersonTrustAddressNode> injector
    ) {
        PersonTrustAddressNode node = new PersonTrustAddressNode(parent, "personTrustAddressNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @PersonTrustNodeChildScope
    @Named("personTrustSettlorNotRequiredReasonNode")
    PersonTrustSettlorNotRequiredReasonNode providePersonTrustSettlorNotRequiredReasonNode(
        PersonTrustNode parent,
        MembersInjector<PersonTrustSettlorNotRequiredReasonNode> injector
    ) {
        PersonTrustSettlorNotRequiredReasonNode node = new PersonTrustSettlorNotRequiredReasonNode(parent, "personTrustSettlorNotRequiredReasonNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @PersonTrustNodeChildScope
    @Named("personTrustIndustryNode")
    PersonTrustIndustryNode providePersonTrustIndustryNode(
        PersonTrustNode parent,
        MembersInjector<PersonTrustIndustryNode> injector
    ) {
        PersonTrustIndustryNode node = new PersonTrustIndustryNode(parent, "personTrustIndustryNode");

        injector.injectMembers(node);
        return node;
    }

}