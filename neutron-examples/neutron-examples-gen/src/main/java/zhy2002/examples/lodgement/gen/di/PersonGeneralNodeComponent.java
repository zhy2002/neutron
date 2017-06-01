package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {PersonGeneralNodeModule.class})
public interface PersonGeneralNodeComponent {

    List<RuleProvider<PersonGeneralNode>> provideRuleProviders();

    TitleNode createTitleNode();
    OtherTitleNode createOtherTitleNode();
    FirstNameNode createFirstNameNode();
    LastNameNode createLastNameNode();
    GenderNode createGenderNode();
    DateOfBirthNode createDateOfBirthNode();
    PrimaryApplicantFlagNode createPrimaryApplicantFlagNode();
    DriversLicenseNode createDriversLicenseNode();
    PersonApplicantTypeNode createPersonApplicantTypeNode();
    ApplicationTypeNode createApplicationTypeNode();
    MaritalStatusNode createMaritalStatusNode();
    PermanentResidentFlagNode createPermanentResidentFlagNode();
    SpouseNode createSpouseNode();
    NextOfKinNode createNextOfKinNode();
    AgeOfDependantsNode createAgeOfDependantsNode();
    FirstHomeBuyerFlagNode createFirstHomeBuyerFlagNode();
    HousingStatusNode createHousingStatusNode();

    @Subcomponent.Builder
    interface Builder {

        Builder setPersonGeneralNodeModule(PersonGeneralNodeModule module);

        PersonGeneralNodeComponent build();
    }

}
