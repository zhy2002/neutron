package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
})
@PersonGeneralNodeChildScope
public class PersonGeneralNodeChildModule {


    @Provides
    @PersonGeneralNodeChildScope
    @Named("titleNode")
    TitleNode provideTitleNode(
        PersonGeneralNode parent,
        MembersInjector<TitleNode> injector
    ) {
        TitleNode node = new TitleNode(parent, "titleNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @PersonGeneralNodeChildScope
    @Named("firstNameNode")
    FirstNameNode provideFirstNameNode(
        PersonGeneralNode parent,
        MembersInjector<FirstNameNode> injector
    ) {
        FirstNameNode node = new FirstNameNode(parent, "firstNameNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @PersonGeneralNodeChildScope
    @Named("lastNameNode")
    LastNameNode provideLastNameNode(
        PersonGeneralNode parent,
        MembersInjector<LastNameNode> injector
    ) {
        LastNameNode node = new LastNameNode(parent, "lastNameNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @PersonGeneralNodeChildScope
    @Named("genderNode")
    GenderNode provideGenderNode(
        PersonGeneralNode parent,
        MembersInjector<GenderNode> injector
    ) {
        GenderNode node = new GenderNode(parent, "genderNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @PersonGeneralNodeChildScope
    @Named("dateOfBirthNode")
    DateOfBirthNode provideDateOfBirthNode(
        PersonGeneralNode parent,
        MembersInjector<DateOfBirthNode> injector
    ) {
        DateOfBirthNode node = new DateOfBirthNode(parent, "dateOfBirthNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @PersonGeneralNodeChildScope
    @Named("primaryApplicantFlagNode")
    PrimaryApplicantFlagNode providePrimaryApplicantFlagNode(
        PersonGeneralNode parent,
        MembersInjector<PrimaryApplicantFlagNode> injector
    ) {
        PrimaryApplicantFlagNode node = new PrimaryApplicantFlagNode(parent, "primaryApplicantFlagNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @PersonGeneralNodeChildScope
    @Named("driversLicenseNode")
    DriversLicenseNode provideDriversLicenseNode(
        PersonGeneralNode parent,
        MembersInjector<DriversLicenseNode> injector
    ) {
        DriversLicenseNode node = new DriversLicenseNode(parent, "driversLicenseNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @PersonGeneralNodeChildScope
    @Named("applicantTypeNode")
    ApplicantTypeNode provideApplicantTypeNode(
        PersonGeneralNode parent,
        MembersInjector<ApplicantTypeNode> injector
    ) {
        ApplicantTypeNode node = new ApplicantTypeNode(parent, "applicantTypeNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @PersonGeneralNodeChildScope
    @Named("maritalStatusNode")
    MaritalStatusNode provideMaritalStatusNode(
        PersonGeneralNode parent,
        MembersInjector<MaritalStatusNode> injector
    ) {
        MaritalStatusNode node = new MaritalStatusNode(parent, "maritalStatusNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @PersonGeneralNodeChildScope
    @Named("permanentResidentFlagNode")
    PermanentResidentFlagNode providePermanentResidentFlagNode(
        PersonGeneralNode parent,
        MembersInjector<PermanentResidentFlagNode> injector
    ) {
        PermanentResidentFlagNode node = new PermanentResidentFlagNode(parent, "permanentResidentFlagNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @PersonGeneralNodeChildScope
    @Named("spouseNode")
    SpouseNode provideSpouseNode(
        PersonGeneralNode parent,
        MembersInjector<SpouseNode> injector
    ) {
        SpouseNode node = new SpouseNode(parent, "spouseNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @PersonGeneralNodeChildScope
    @Named("firstHomeBuyerFlagNode")
    FirstHomeBuyerFlagNode provideFirstHomeBuyerFlagNode(
        PersonGeneralNode parent,
        MembersInjector<FirstHomeBuyerFlagNode> injector
    ) {
        FirstHomeBuyerFlagNode node = new FirstHomeBuyerFlagNode(parent, "firstHomeBuyerFlagNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @PersonGeneralNodeChildScope
    @Named("housingStatusNode")
    HousingStatusNode provideHousingStatusNode(
        PersonGeneralNode parent,
        MembersInjector<HousingStatusNode> injector
    ) {
        HousingStatusNode node = new HousingStatusNode(parent, "housingStatusNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @PersonGeneralNodeChildScope
    @Named("applicationTypeNode")
    ApplicationTypeNode provideApplicationTypeNode(
        PersonGeneralNode parent,
        MembersInjector<ApplicationTypeNode> injector
    ) {
        ApplicationTypeNode node = new ApplicationTypeNode(parent, "applicationTypeNode");

        injector.injectMembers(node);
        return node;
    }

}