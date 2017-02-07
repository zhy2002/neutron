package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@PersonGeneralNodeChildScope
@Subcomponent(modules = {PersonGeneralNodeChildModule.class})
public interface PersonGeneralNodeChildComponent {

    TitleNode provideTitleNode(@Named("titleNode") TitleNode impl);
    FirstNameNode provideFirstNameNode(@Named("firstNameNode") FirstNameNode impl);
    LastNameNode provideLastNameNode(@Named("lastNameNode") LastNameNode impl);
    GenderNode provideGenderNode(@Named("genderNode") GenderNode impl);
    DateOfBirthNode provideDateOfBirthNode(@Named("dateOfBirthNode") DateOfBirthNode impl);
    PrimaryApplicantFlagNode providePrimaryApplicantFlagNode(@Named("primaryApplicantFlagNode") PrimaryApplicantFlagNode impl);
    DriversLicenseNode provideDriversLicenseNode(@Named("driversLicenseNode") DriversLicenseNode impl);
    ApplicantTypeNode provideApplicantTypeNode(@Named("applicantTypeNode") ApplicantTypeNode impl);
    MaritalStatusNode provideMaritalStatusNode(@Named("maritalStatusNode") MaritalStatusNode impl);
    PermanentResidentFlagNode providePermanentResidentFlagNode(@Named("permanentResidentFlagNode") PermanentResidentFlagNode impl);
    SpouseNode provideSpouseNode(@Named("spouseNode") SpouseNode impl);
    FirstHomeBuyerFlagNode provideFirstHomeBuyerFlagNode(@Named("firstHomeBuyerFlagNode") FirstHomeBuyerFlagNode impl);
    HousingStatusNode provideHousingStatusNode(@Named("housingStatusNode") HousingStatusNode impl);
    ApplicationTypeNode provideApplicationTypeNode(@Named("applicationTypeNode") ApplicationTypeNode impl);

    @Subcomponent.Builder
    interface Builder {

        Builder setPersonGeneralNodeChildModule(PersonGeneralNodeChildModule module);

        PersonGeneralNodeChildComponent build();
    }
}
