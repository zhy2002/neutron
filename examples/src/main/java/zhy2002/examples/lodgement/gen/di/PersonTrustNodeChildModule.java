package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
})
@PersonTrustNodeChildScope
public class PersonTrustNodeChildModule {

    private final PersonTrustNode parent;

    public PersonTrustNodeChildModule(PersonTrustNode parent) {
        this.parent = parent;
    }


    @Provides
    @PersonTrustNodeChildScope
    @Named("personTrustTypeNode")
    PersonTrustTypeNode providePersonTrustTypeNode(
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
        MembersInjector<PersonTrustIndustryNode> injector
    ) {
        PersonTrustIndustryNode node = new PersonTrustIndustryNode(parent, "personTrustIndustryNode");

        injector.injectMembers(node);
        return node;
    }

}