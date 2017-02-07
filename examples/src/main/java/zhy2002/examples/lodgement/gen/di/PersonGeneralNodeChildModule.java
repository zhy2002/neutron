package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
})
@PersonGeneralNodeChildScope
public class PersonGeneralNodeChildModule {

    private final PersonGeneralNode parent;

    public PersonGeneralNodeChildModule(PersonGeneralNode parent) {
        this.parent = parent;
    }


    @Provides
    @PersonGeneralNodeChildScope
    @Named("titleNode")
    TitleNode provideTitleNode(
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
        MembersInjector<ApplicationTypeNode> injector
    ) {
        ApplicationTypeNode node = new ApplicationTypeNode(parent, "applicationTypeNode");

        injector.injectMembers(node);
        return node;
    }

}