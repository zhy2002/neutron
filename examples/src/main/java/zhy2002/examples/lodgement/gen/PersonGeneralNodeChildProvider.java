package zhy2002.examples.lodgement.gen;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface PersonGeneralNodeChildFactory {
    TitleNode createTitleNode();
    FirstNameNode createFirstNameNode();
    LastNameNode createLastNameNode();
    GenderNode createGenderNode();
    DateOfBirthNode createDateOfBirthNode();
    PrimaryApplicantFlagNode createPrimaryApplicantFlagNode();
    DriversLicenseNode createDriversLicenseNode();
    ApplicantTypeNode createApplicantTypeNode();
    MaritalStatusNode createMaritalStatusNode();
    PermanentResidentFlagNode createPermanentResidentFlagNode();
    SpouseNode createSpouseNode();
    FirstHomeBuyerFlagNode createFirstHomeBuyerFlagNode();
    HousingStatusNode createHousingStatusNode();
    ApplicationTypeNode createApplicationTypeNode();
}

@Singleton
public class PersonGeneralNodeChildProvider {
    @Inject
    MembersInjector<TitleNode> titleNodeInjector;
    @Inject
    MembersInjector<FirstNameNode> firstNameNodeInjector;
    @Inject
    MembersInjector<LastNameNode> lastNameNodeInjector;
    @Inject
    MembersInjector<GenderNode> genderNodeInjector;
    @Inject
    MembersInjector<DateOfBirthNode> dateOfBirthNodeInjector;
    @Inject
    MembersInjector<PrimaryApplicantFlagNode> primaryApplicantFlagNodeInjector;
    @Inject
    MembersInjector<DriversLicenseNode> driversLicenseNodeInjector;
    @Inject
    MembersInjector<ApplicantTypeNode> applicantTypeNodeInjector;
    @Inject
    MembersInjector<ApplicationTypeNode> applicationTypeNodeInjector;
    @Inject
    MembersInjector<MaritalStatusNode> maritalStatusNodeInjector;
    @Inject
    MembersInjector<PermanentResidentFlagNode> permanentResidentFlagNodeInjector;
    @Inject
    MembersInjector<SpouseNode> spouseNodeInjector;
    @Inject
    MembersInjector<FirstHomeBuyerFlagNode> firstHomeBuyerFlagNodeInjector;
    @Inject
    MembersInjector<HousingStatusNode> housingStatusNodeInjector;

    @Inject
    protected PersonGeneralNodeChildProvider () {}

    protected MembersInjector<TitleNode> getTitleNodeInjector() {
        return this.titleNodeInjector;
    }

    protected MembersInjector<FirstNameNode> getFirstNameNodeInjector() {
        return this.firstNameNodeInjector;
    }

    protected MembersInjector<LastNameNode> getLastNameNodeInjector() {
        return this.lastNameNodeInjector;
    }

    protected MembersInjector<GenderNode> getGenderNodeInjector() {
        return this.genderNodeInjector;
    }

    protected MembersInjector<DateOfBirthNode> getDateOfBirthNodeInjector() {
        return this.dateOfBirthNodeInjector;
    }

    protected MembersInjector<PrimaryApplicantFlagNode> getPrimaryApplicantFlagNodeInjector() {
        return this.primaryApplicantFlagNodeInjector;
    }

    protected MembersInjector<DriversLicenseNode> getDriversLicenseNodeInjector() {
        return this.driversLicenseNodeInjector;
    }

    protected MembersInjector<ApplicantTypeNode> getApplicantTypeNodeInjector() {
        return this.applicantTypeNodeInjector;
    }

    protected MembersInjector<ApplicationTypeNode> getApplicationTypeNodeInjector() {
        return this.applicationTypeNodeInjector;
    }

    protected MembersInjector<MaritalStatusNode> getMaritalStatusNodeInjector() {
        return this.maritalStatusNodeInjector;
    }

    protected MembersInjector<PermanentResidentFlagNode> getPermanentResidentFlagNodeInjector() {
        return this.permanentResidentFlagNodeInjector;
    }

    protected MembersInjector<SpouseNode> getSpouseNodeInjector() {
        return this.spouseNodeInjector;
    }

    protected MembersInjector<FirstHomeBuyerFlagNode> getFirstHomeBuyerFlagNodeInjector() {
        return this.firstHomeBuyerFlagNodeInjector;
    }

    protected MembersInjector<HousingStatusNode> getHousingStatusNodeInjector() {
        return this.housingStatusNodeInjector;
    }

    protected TitleNode newTitleNode(
        PersonGeneralNode parent,
        String name
    ) {
        return new TitleNode(parent, name);
    }

    protected FirstNameNode newFirstNameNode(
        PersonGeneralNode parent,
        String name
    ) {
        return new FirstNameNode(parent, name);
    }

    protected LastNameNode newLastNameNode(
        PersonGeneralNode parent,
        String name
    ) {
        return new LastNameNode(parent, name);
    }

    protected GenderNode newGenderNode(
        PersonGeneralNode parent,
        String name
    ) {
        return new GenderNode(parent, name);
    }

    protected DateOfBirthNode newDateOfBirthNode(
        PersonGeneralNode parent,
        String name
    ) {
        return new DateOfBirthNode(parent, name);
    }

    protected PrimaryApplicantFlagNode newPrimaryApplicantFlagNode(
        PersonGeneralNode parent,
        String name
    ) {
        return new PrimaryApplicantFlagNode(parent, name);
    }

    protected DriversLicenseNode newDriversLicenseNode(
        PersonGeneralNode parent,
        String name
    ) {
        return new DriversLicenseNode(parent, name);
    }

    protected ApplicantTypeNode newApplicantTypeNode(
        PersonGeneralNode parent,
        String name
    ) {
        return new ApplicantTypeNode(parent, name);
    }

    protected MaritalStatusNode newMaritalStatusNode(
        PersonGeneralNode parent,
        String name
    ) {
        return new MaritalStatusNode(parent, name);
    }

    protected PermanentResidentFlagNode newPermanentResidentFlagNode(
        PersonGeneralNode parent,
        String name
    ) {
        return new PermanentResidentFlagNode(parent, name);
    }

    protected SpouseNode newSpouseNode(
        PersonGeneralNode parent,
        String name
    ) {
        return new SpouseNode(parent, name);
    }

    protected FirstHomeBuyerFlagNode newFirstHomeBuyerFlagNode(
        PersonGeneralNode parent,
        String name
    ) {
        return new FirstHomeBuyerFlagNode(parent, name);
    }

    protected HousingStatusNode newHousingStatusNode(
        PersonGeneralNode parent,
        String name
    ) {
        return new HousingStatusNode(parent, name);
    }

    protected ApplicationTypeNode newApplicationTypeNode(
        PersonGeneralNode parent,
        String name
    ) {
        return new ApplicationTypeNode(parent, name);
    }

    PersonGeneralNodeChildFactory createFactory(PersonGeneralNode parent) {
        return new PersonGeneralNodeChildFactoryImpl(parent);
    }

    private class PersonGeneralNodeChildFactoryImpl implements PersonGeneralNodeChildFactory {

        private final PersonGeneralNode parent;
        
        private PersonGeneralNodeChildFactoryImpl(PersonGeneralNode parent) {
            this.parent = parent;
        }

        @Override
        public TitleNode createTitleNode() {
            TitleNode node = newTitleNode(parent, "titleNode");
            titleNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public FirstNameNode createFirstNameNode() {
            FirstNameNode node = newFirstNameNode(parent, "firstNameNode");
            firstNameNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public LastNameNode createLastNameNode() {
            LastNameNode node = newLastNameNode(parent, "lastNameNode");
            lastNameNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public GenderNode createGenderNode() {
            GenderNode node = newGenderNode(parent, "genderNode");
            genderNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public DateOfBirthNode createDateOfBirthNode() {
            DateOfBirthNode node = newDateOfBirthNode(parent, "dateOfBirthNode");
            dateOfBirthNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public PrimaryApplicantFlagNode createPrimaryApplicantFlagNode() {
            PrimaryApplicantFlagNode node = newPrimaryApplicantFlagNode(parent, "primaryApplicantFlagNode");
            primaryApplicantFlagNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public DriversLicenseNode createDriversLicenseNode() {
            DriversLicenseNode node = newDriversLicenseNode(parent, "driversLicenseNode");
            driversLicenseNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public ApplicantTypeNode createApplicantTypeNode() {
            ApplicantTypeNode node = newApplicantTypeNode(parent, "applicantTypeNode");
            applicantTypeNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public MaritalStatusNode createMaritalStatusNode() {
            MaritalStatusNode node = newMaritalStatusNode(parent, "maritalStatusNode");
            maritalStatusNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public PermanentResidentFlagNode createPermanentResidentFlagNode() {
            PermanentResidentFlagNode node = newPermanentResidentFlagNode(parent, "permanentResidentFlagNode");
            permanentResidentFlagNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public SpouseNode createSpouseNode() {
            SpouseNode node = newSpouseNode(parent, "spouseNode");
            spouseNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public FirstHomeBuyerFlagNode createFirstHomeBuyerFlagNode() {
            FirstHomeBuyerFlagNode node = newFirstHomeBuyerFlagNode(parent, "firstHomeBuyerFlagNode");
            firstHomeBuyerFlagNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public HousingStatusNode createHousingStatusNode() {
            HousingStatusNode node = newHousingStatusNode(parent, "housingStatusNode");
            housingStatusNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public ApplicationTypeNode createApplicationTypeNode() {
            ApplicationTypeNode node = newApplicationTypeNode(parent, "applicationTypeNode");
            applicationTypeNodeInjector.injectMembers(node);
            return node;
        }

    }
}
