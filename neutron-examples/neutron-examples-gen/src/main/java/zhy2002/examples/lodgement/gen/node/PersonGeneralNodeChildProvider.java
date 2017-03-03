package zhy2002.examples.lodgement.gen.node;

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
    PersonApplicantTypeNode createPersonApplicantTypeNode();
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
    MembersInjector<ApplicationTypeNode> applicationTypeNodeInjector;
    @Inject
    MembersInjector<MaritalStatusNode> maritalStatusNodeInjector;
    @Inject
    MembersInjector<FirstNameNode> firstNameNodeInjector;
    @Inject
    MembersInjector<DateOfBirthNode> dateOfBirthNodeInjector;
    @Inject
    MembersInjector<PrimaryApplicantFlagNode> primaryApplicantFlagNodeInjector;
    @Inject
    MembersInjector<DriversLicenseNode> driversLicenseNodeInjector;
    @Inject
    MembersInjector<HousingStatusNode> housingStatusNodeInjector;
    @Inject
    MembersInjector<GenderNode> genderNodeInjector;
    @Inject
    MembersInjector<FirstHomeBuyerFlagNode> firstHomeBuyerFlagNodeInjector;
    @Inject
    MembersInjector<LastNameNode> lastNameNodeInjector;
    @Inject
    MembersInjector<PermanentResidentFlagNode> permanentResidentFlagNodeInjector;
    @Inject
    MembersInjector<TitleNode> titleNodeInjector;
    @Inject
    MembersInjector<SpouseNode> spouseNodeInjector;
    @Inject
    MembersInjector<PersonApplicantTypeNode> personApplicantTypeNodeInjector;

    @Inject
    protected PersonGeneralNodeChildProvider () {}

    protected MembersInjector<ApplicationTypeNode> getApplicationTypeNodeInjector() {
        return this.applicationTypeNodeInjector;
    }

    protected MembersInjector<MaritalStatusNode> getMaritalStatusNodeInjector() {
        return this.maritalStatusNodeInjector;
    }

    protected MembersInjector<FirstNameNode> getFirstNameNodeInjector() {
        return this.firstNameNodeInjector;
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

    protected MembersInjector<HousingStatusNode> getHousingStatusNodeInjector() {
        return this.housingStatusNodeInjector;
    }

    protected MembersInjector<GenderNode> getGenderNodeInjector() {
        return this.genderNodeInjector;
    }

    protected MembersInjector<FirstHomeBuyerFlagNode> getFirstHomeBuyerFlagNodeInjector() {
        return this.firstHomeBuyerFlagNodeInjector;
    }

    protected MembersInjector<LastNameNode> getLastNameNodeInjector() {
        return this.lastNameNodeInjector;
    }

    protected MembersInjector<PermanentResidentFlagNode> getPermanentResidentFlagNodeInjector() {
        return this.permanentResidentFlagNodeInjector;
    }

    protected MembersInjector<TitleNode> getTitleNodeInjector() {
        return this.titleNodeInjector;
    }

    protected MembersInjector<SpouseNode> getSpouseNodeInjector() {
        return this.spouseNodeInjector;
    }

    protected MembersInjector<PersonApplicantTypeNode> getPersonApplicantTypeNodeInjector() {
        return this.personApplicantTypeNodeInjector;
    }

    protected TitleNode newTitleNode(
        PersonGeneralNode parent,
        String name
    ) {
        return new TitleNode(parent, name);
    }

    protected void configureTitleNode(TitleNode node) {
    }

    protected FirstNameNode newFirstNameNode(
        PersonGeneralNode parent,
        String name
    ) {
        return new FirstNameNode(parent, name);
    }

    protected void configureFirstNameNode(FirstNameNode node) {
    }

    protected LastNameNode newLastNameNode(
        PersonGeneralNode parent,
        String name
    ) {
        return new LastNameNode(parent, name);
    }

    protected void configureLastNameNode(LastNameNode node) {
    }

    protected GenderNode newGenderNode(
        PersonGeneralNode parent,
        String name
    ) {
        return new GenderNode(parent, name);
    }

    protected void configureGenderNode(GenderNode node) {
    }

    protected DateOfBirthNode newDateOfBirthNode(
        PersonGeneralNode parent,
        String name
    ) {
        return new DateOfBirthNode(parent, name);
    }

    protected void configureDateOfBirthNode(DateOfBirthNode node) {
    }

    protected PrimaryApplicantFlagNode newPrimaryApplicantFlagNode(
        PersonGeneralNode parent,
        String name
    ) {
        return new PrimaryApplicantFlagNode(parent, name);
    }

    protected void configurePrimaryApplicantFlagNode(PrimaryApplicantFlagNode node) {
    }

    protected DriversLicenseNode newDriversLicenseNode(
        PersonGeneralNode parent,
        String name
    ) {
        return new DriversLicenseNode(parent, name);
    }

    protected void configureDriversLicenseNode(DriversLicenseNode node) {
    }

    protected PersonApplicantTypeNode newPersonApplicantTypeNode(
        PersonGeneralNode parent,
        String name
    ) {
        return new PersonApplicantTypeNode(parent, name);
    }

    protected void configurePersonApplicantTypeNode(PersonApplicantTypeNode node) {
    }

    protected MaritalStatusNode newMaritalStatusNode(
        PersonGeneralNode parent,
        String name
    ) {
        return new MaritalStatusNode(parent, name);
    }

    protected void configureMaritalStatusNode(MaritalStatusNode node) {
    }

    protected PermanentResidentFlagNode newPermanentResidentFlagNode(
        PersonGeneralNode parent,
        String name
    ) {
        return new PermanentResidentFlagNode(parent, name);
    }

    protected void configurePermanentResidentFlagNode(PermanentResidentFlagNode node) {
    }

    protected SpouseNode newSpouseNode(
        PersonGeneralNode parent,
        String name
    ) {
        return new SpouseNode(parent, name);
    }

    protected void configureSpouseNode(SpouseNode node) {
    }

    protected FirstHomeBuyerFlagNode newFirstHomeBuyerFlagNode(
        PersonGeneralNode parent,
        String name
    ) {
        return new FirstHomeBuyerFlagNode(parent, name);
    }

    protected void configureFirstHomeBuyerFlagNode(FirstHomeBuyerFlagNode node) {
    }

    protected HousingStatusNode newHousingStatusNode(
        PersonGeneralNode parent,
        String name
    ) {
        return new HousingStatusNode(parent, name);
    }

    protected void configureHousingStatusNode(HousingStatusNode node) {
    }

    protected ApplicationTypeNode newApplicationTypeNode(
        PersonGeneralNode parent,
        String name
    ) {
        return new ApplicationTypeNode(parent, name);
    }

    protected void configureApplicationTypeNode(ApplicationTypeNode node) {
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
            configureTitleNode(node);
            return node;
        }

        @Override
        public FirstNameNode createFirstNameNode() {
            FirstNameNode node = newFirstNameNode(parent, "firstNameNode");
            firstNameNodeInjector.injectMembers(node);
            configureFirstNameNode(node);
            return node;
        }

        @Override
        public LastNameNode createLastNameNode() {
            LastNameNode node = newLastNameNode(parent, "lastNameNode");
            lastNameNodeInjector.injectMembers(node);
            configureLastNameNode(node);
            return node;
        }

        @Override
        public GenderNode createGenderNode() {
            GenderNode node = newGenderNode(parent, "genderNode");
            genderNodeInjector.injectMembers(node);
            configureGenderNode(node);
            return node;
        }

        @Override
        public DateOfBirthNode createDateOfBirthNode() {
            DateOfBirthNode node = newDateOfBirthNode(parent, "dateOfBirthNode");
            dateOfBirthNodeInjector.injectMembers(node);
            configureDateOfBirthNode(node);
            return node;
        }

        @Override
        public PrimaryApplicantFlagNode createPrimaryApplicantFlagNode() {
            PrimaryApplicantFlagNode node = newPrimaryApplicantFlagNode(parent, "primaryApplicantFlagNode");
            primaryApplicantFlagNodeInjector.injectMembers(node);
            configurePrimaryApplicantFlagNode(node);
            return node;
        }

        @Override
        public DriversLicenseNode createDriversLicenseNode() {
            DriversLicenseNode node = newDriversLicenseNode(parent, "driversLicenseNode");
            driversLicenseNodeInjector.injectMembers(node);
            configureDriversLicenseNode(node);
            return node;
        }

        @Override
        public PersonApplicantTypeNode createPersonApplicantTypeNode() {
            PersonApplicantTypeNode node = newPersonApplicantTypeNode(parent, "personApplicantTypeNode");
            personApplicantTypeNodeInjector.injectMembers(node);
            configurePersonApplicantTypeNode(node);
            return node;
        }

        @Override
        public MaritalStatusNode createMaritalStatusNode() {
            MaritalStatusNode node = newMaritalStatusNode(parent, "maritalStatusNode");
            maritalStatusNodeInjector.injectMembers(node);
            configureMaritalStatusNode(node);
            return node;
        }

        @Override
        public PermanentResidentFlagNode createPermanentResidentFlagNode() {
            PermanentResidentFlagNode node = newPermanentResidentFlagNode(parent, "permanentResidentFlagNode");
            permanentResidentFlagNodeInjector.injectMembers(node);
            configurePermanentResidentFlagNode(node);
            return node;
        }

        @Override
        public SpouseNode createSpouseNode() {
            SpouseNode node = newSpouseNode(parent, "spouseNode");
            spouseNodeInjector.injectMembers(node);
            configureSpouseNode(node);
            return node;
        }

        @Override
        public FirstHomeBuyerFlagNode createFirstHomeBuyerFlagNode() {
            FirstHomeBuyerFlagNode node = newFirstHomeBuyerFlagNode(parent, "firstHomeBuyerFlagNode");
            firstHomeBuyerFlagNodeInjector.injectMembers(node);
            configureFirstHomeBuyerFlagNode(node);
            return node;
        }

        @Override
        public HousingStatusNode createHousingStatusNode() {
            HousingStatusNode node = newHousingStatusNode(parent, "housingStatusNode");
            housingStatusNodeInjector.injectMembers(node);
            configureHousingStatusNode(node);
            return node;
        }

        @Override
        public ApplicationTypeNode createApplicationTypeNode() {
            ApplicationTypeNode node = newApplicationTypeNode(parent, "applicationTypeNode");
            applicationTypeNodeInjector.injectMembers(node);
            configureApplicationTypeNode(node);
            return node;
        }

    }
}
