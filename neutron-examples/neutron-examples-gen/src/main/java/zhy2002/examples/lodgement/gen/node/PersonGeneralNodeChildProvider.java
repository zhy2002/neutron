package zhy2002.examples.lodgement.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;
import zhy2002.neutron.di.ComponentScope;


interface PersonGeneralNodeChildFactory {
    TitleNode createTitleNode();
    OtherTitleNode createOtherTitleNode();
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
    NextOfKinNode createNextOfKinNode();
    AgeOfDependantsNode createAgeOfDependantsNode();
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
    MembersInjector<OtherTitleNode> otherTitleNodeInjector;
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
    MembersInjector<NextOfKinNode> nextOfKinNodeInjector;
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
    MembersInjector<AgeOfDependantsNode> ageOfDependantsNodeInjector;

    @Inject
    protected PersonGeneralNodeChildProvider () {}

    protected MembersInjector<ApplicationTypeNode> getApplicationTypeNodeInjector() {
        return this.applicationTypeNodeInjector;
    }

    protected MembersInjector<MaritalStatusNode> getMaritalStatusNodeInjector() {
        return this.maritalStatusNodeInjector;
    }

    protected MembersInjector<OtherTitleNode> getOtherTitleNodeInjector() {
        return this.otherTitleNodeInjector;
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

    protected MembersInjector<NextOfKinNode> getNextOfKinNodeInjector() {
        return this.nextOfKinNodeInjector;
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

    protected MembersInjector<AgeOfDependantsNode> getAgeOfDependantsNodeInjector() {
        return this.ageOfDependantsNodeInjector;
    }

    protected TitleNode newTitleNode(
        PersonGeneralNode parent,
        String name
    ) {
        return new TitleNode(parent, name);
    }

    protected void configureTitleNode(TitleNode node) {
    }

    @ComponentScope
    public static class TitleNodeRuleProvider implements RuleProvider<TitleNode> {

        @Inject
        public TitleNodeRuleProvider() {

        }

        @Override
        public void initializeState(TitleNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected OtherTitleNode newOtherTitleNode(
        PersonGeneralNode parent,
        String name
    ) {
        return new OtherTitleNode(parent, name);
    }

    protected void configureOtherTitleNode(OtherTitleNode node) {
    }

    @ComponentScope
    public static class OtherTitleNodeRuleProvider implements RuleProvider<OtherTitleNode> {

        @Inject
        public OtherTitleNodeRuleProvider() {

        }

        @Override
        public void initializeState(OtherTitleNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected FirstNameNode newFirstNameNode(
        PersonGeneralNode parent,
        String name
    ) {
        return new FirstNameNode(parent, name);
    }

    protected void configureFirstNameNode(FirstNameNode node) {
    }

    @ComponentScope
    public static class FirstNameNodeRuleProvider implements RuleProvider<FirstNameNode> {

        @Inject
        public FirstNameNodeRuleProvider() {

        }

        @Override
        public void initializeState(FirstNameNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected LastNameNode newLastNameNode(
        PersonGeneralNode parent,
        String name
    ) {
        return new LastNameNode(parent, name);
    }

    protected void configureLastNameNode(LastNameNode node) {
    }

    @ComponentScope
    public static class LastNameNodeRuleProvider implements RuleProvider<LastNameNode> {

        @Inject
        public LastNameNodeRuleProvider() {

        }

        @Override
        public void initializeState(LastNameNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected GenderNode newGenderNode(
        PersonGeneralNode parent,
        String name
    ) {
        return new GenderNode(parent, name);
    }

    protected void configureGenderNode(GenderNode node) {
    }

    @ComponentScope
    public static class GenderNodeRuleProvider implements RuleProvider<GenderNode> {

        @Inject
        public GenderNodeRuleProvider() {

        }

        @Override
        public void initializeState(GenderNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected DateOfBirthNode newDateOfBirthNode(
        PersonGeneralNode parent,
        String name
    ) {
        return new DateOfBirthNode(parent, name);
    }

    protected void configureDateOfBirthNode(DateOfBirthNode node) {
    }

    @ComponentScope
    public static class DateOfBirthNodeRuleProvider implements RuleProvider<DateOfBirthNode> {

        @Inject
        public DateOfBirthNodeRuleProvider() {

        }

        @Override
        public void initializeState(DateOfBirthNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected PrimaryApplicantFlagNode newPrimaryApplicantFlagNode(
        PersonGeneralNode parent,
        String name
    ) {
        return new PrimaryApplicantFlagNode(parent, name);
    }

    protected void configurePrimaryApplicantFlagNode(PrimaryApplicantFlagNode node) {
    }

    @ComponentScope
    public static class PrimaryApplicantFlagNodeRuleProvider implements RuleProvider<PrimaryApplicantFlagNode> {

        @Inject
        public PrimaryApplicantFlagNodeRuleProvider() {

        }

        @Override
        public void initializeState(PrimaryApplicantFlagNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected DriversLicenseNode newDriversLicenseNode(
        PersonGeneralNode parent,
        String name
    ) {
        return new DriversLicenseNode(parent, name);
    }

    protected void configureDriversLicenseNode(DriversLicenseNode node) {
    }

    @ComponentScope
    public static class DriversLicenseNodeRuleProvider implements RuleProvider<DriversLicenseNode> {

        @Inject
        public DriversLicenseNodeRuleProvider() {

        }

        @Override
        public void initializeState(DriversLicenseNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected PersonApplicantTypeNode newPersonApplicantTypeNode(
        PersonGeneralNode parent,
        String name
    ) {
        return new PersonApplicantTypeNode(parent, name);
    }

    protected void configurePersonApplicantTypeNode(PersonApplicantTypeNode node) {
    }

    @ComponentScope
    public static class PersonApplicantTypeNodeRuleProvider implements RuleProvider<PersonApplicantTypeNode> {

        @Inject
        public PersonApplicantTypeNodeRuleProvider() {

        }

        @Override
        public void initializeState(PersonApplicantTypeNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected MaritalStatusNode newMaritalStatusNode(
        PersonGeneralNode parent,
        String name
    ) {
        return new MaritalStatusNode(parent, name);
    }

    protected void configureMaritalStatusNode(MaritalStatusNode node) {
    }

    @ComponentScope
    public static class MaritalStatusNodeRuleProvider implements RuleProvider<MaritalStatusNode> {

        @Inject
        public MaritalStatusNodeRuleProvider() {

        }

        @Override
        public void initializeState(MaritalStatusNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected PermanentResidentFlagNode newPermanentResidentFlagNode(
        PersonGeneralNode parent,
        String name
    ) {
        return new PermanentResidentFlagNode(parent, name);
    }

    protected void configurePermanentResidentFlagNode(PermanentResidentFlagNode node) {
    }

    @ComponentScope
    public static class PermanentResidentFlagNodeRuleProvider implements RuleProvider<PermanentResidentFlagNode> {

        @Inject
        public PermanentResidentFlagNodeRuleProvider() {

        }

        @Override
        public void initializeState(PermanentResidentFlagNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected SpouseNode newSpouseNode(
        PersonGeneralNode parent,
        String name
    ) {
        return new SpouseNode(parent, name);
    }

    protected void configureSpouseNode(SpouseNode node) {
    }

    @ComponentScope
    public static class SpouseNodeRuleProvider implements RuleProvider<SpouseNode> {

        @Inject
        public SpouseNodeRuleProvider() {

        }

        @Override
        public void initializeState(SpouseNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected NextOfKinNode newNextOfKinNode(
        PersonGeneralNode parent,
        String name
    ) {
        return new NextOfKinNode(parent, name);
    }

    protected void configureNextOfKinNode(NextOfKinNode node) {
    }

    @ComponentScope
    public static class NextOfKinNodeRuleProvider implements RuleProvider<NextOfKinNode> {

        @Inject
        public NextOfKinNodeRuleProvider() {

        }

        @Override
        public void initializeState(NextOfKinNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected AgeOfDependantsNode newAgeOfDependantsNode(
        PersonGeneralNode parent,
        String name
    ) {
        return new AgeOfDependantsNode(parent, name);
    }

    protected void configureAgeOfDependantsNode(AgeOfDependantsNode node) {
    }

    @ComponentScope
    public static class AgeOfDependantsNodeRuleProvider implements RuleProvider<AgeOfDependantsNode> {

        @Inject
        public AgeOfDependantsNodeRuleProvider() {

        }

        @Override
        public void initializeState(AgeOfDependantsNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected FirstHomeBuyerFlagNode newFirstHomeBuyerFlagNode(
        PersonGeneralNode parent,
        String name
    ) {
        return new FirstHomeBuyerFlagNode(parent, name);
    }

    protected void configureFirstHomeBuyerFlagNode(FirstHomeBuyerFlagNode node) {
    }

    @ComponentScope
    public static class FirstHomeBuyerFlagNodeRuleProvider implements RuleProvider<FirstHomeBuyerFlagNode> {

        @Inject
        public FirstHomeBuyerFlagNodeRuleProvider() {

        }

        @Override
        public void initializeState(FirstHomeBuyerFlagNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected HousingStatusNode newHousingStatusNode(
        PersonGeneralNode parent,
        String name
    ) {
        return new HousingStatusNode(parent, name);
    }

    protected void configureHousingStatusNode(HousingStatusNode node) {
    }

    @ComponentScope
    public static class HousingStatusNodeRuleProvider implements RuleProvider<HousingStatusNode> {

        @Inject
        public HousingStatusNodeRuleProvider() {

        }

        @Override
        public void initializeState(HousingStatusNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected ApplicationTypeNode newApplicationTypeNode(
        PersonGeneralNode parent,
        String name
    ) {
        return new ApplicationTypeNode(parent, name);
    }

    protected void configureApplicationTypeNode(ApplicationTypeNode node) {
    }

    @ComponentScope
    public static class ApplicationTypeNodeRuleProvider implements RuleProvider<ApplicationTypeNode> {

        @Inject
        public ApplicationTypeNodeRuleProvider() {

        }

        @Override
        public void initializeState(ApplicationTypeNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
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
        public OtherTitleNode createOtherTitleNode() {
            OtherTitleNode node = newOtherTitleNode(parent, "otherTitleNode");
            otherTitleNodeInjector.injectMembers(node);
            configureOtherTitleNode(node);
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
        public NextOfKinNode createNextOfKinNode() {
            NextOfKinNode node = newNextOfKinNode(parent, "nextOfKinNode");
            nextOfKinNodeInjector.injectMembers(node);
            configureNextOfKinNode(node);
            return node;
        }

        @Override
        public AgeOfDependantsNode createAgeOfDependantsNode() {
            AgeOfDependantsNode node = newAgeOfDependantsNode(parent, "ageOfDependantsNode");
            ageOfDependantsNodeInjector.injectMembers(node);
            configureAgeOfDependantsNode(node);
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
