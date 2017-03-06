package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class PersonGeneralNode extends ObjectUiNode<PersonNode> {

    private TitleNode titleNode;
    private FirstNameNode firstNameNode;
    private LastNameNode lastNameNode;
    private GenderNode genderNode;
    private DateOfBirthNode dateOfBirthNode;
    private PrimaryApplicantFlagNode primaryApplicantFlagNode;
    private DriversLicenseNode driversLicenseNode;
    private PersonApplicantTypeNode personApplicantTypeNode;
    private MaritalStatusNode maritalStatusNode;
    private PermanentResidentFlagNode permanentResidentFlagNode;
    private SpouseNode spouseNode;
    private FirstHomeBuyerFlagNode firstHomeBuyerFlagNode;
    private HousingStatusNode housingStatusNode;
    private ApplicationTypeNode applicationTypeNode;

    private PersonGeneralNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(PersonGeneralNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return PersonGeneralNode.class;
    }

    private PersonGeneralNodeComponent component;

    @Inject
    void createComponent(PersonGeneralNodeComponent.Builder builder) {
        this.component = builder.setPersonGeneralNodeModule(new PersonGeneralNodeModule(this)).build();
    }

    private PersonGeneralNodeRuleProvider getRuleProvider() {
        return component.getPersonGeneralNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public PersonGeneralNode(@NotNull PersonNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public TitleNode getTitleNode() {
        return titleNode;
    }

    @JsMethod
    public FirstNameNode getFirstNameNode() {
        return firstNameNode;
    }

    @JsMethod
    public LastNameNode getLastNameNode() {
        return lastNameNode;
    }

    @JsMethod
    public GenderNode getGenderNode() {
        return genderNode;
    }

    @JsMethod
    public DateOfBirthNode getDateOfBirthNode() {
        return dateOfBirthNode;
    }

    @JsMethod
    public PrimaryApplicantFlagNode getPrimaryApplicantFlagNode() {
        return primaryApplicantFlagNode;
    }

    @JsMethod
    public DriversLicenseNode getDriversLicenseNode() {
        return driversLicenseNode;
    }

    @JsMethod
    public PersonApplicantTypeNode getPersonApplicantTypeNode() {
        return personApplicantTypeNode;
    }

    @JsMethod
    public MaritalStatusNode getMaritalStatusNode() {
        return maritalStatusNode;
    }

    @JsMethod
    public PermanentResidentFlagNode getPermanentResidentFlagNode() {
        return permanentResidentFlagNode;
    }

    @JsMethod
    public SpouseNode getSpouseNode() {
        return spouseNode;
    }

    @JsMethod
    public FirstHomeBuyerFlagNode getFirstHomeBuyerFlagNode() {
        return firstHomeBuyerFlagNode;
    }

    @JsMethod
    public HousingStatusNode getHousingStatusNode() {
        return housingStatusNode;
    }

    @JsMethod
    public ApplicationTypeNode getApplicationTypeNode() {
        return applicationTypeNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        titleNode = childFactory.createTitleNode();
        children.add(titleNode);
        firstNameNode = childFactory.createFirstNameNode();
        children.add(firstNameNode);
        lastNameNode = childFactory.createLastNameNode();
        children.add(lastNameNode);
        genderNode = childFactory.createGenderNode();
        children.add(genderNode);
        dateOfBirthNode = childFactory.createDateOfBirthNode();
        children.add(dateOfBirthNode);
        primaryApplicantFlagNode = childFactory.createPrimaryApplicantFlagNode();
        children.add(primaryApplicantFlagNode);
        driversLicenseNode = childFactory.createDriversLicenseNode();
        children.add(driversLicenseNode);
        personApplicantTypeNode = childFactory.createPersonApplicantTypeNode();
        children.add(personApplicantTypeNode);
        maritalStatusNode = childFactory.createMaritalStatusNode();
        children.add(maritalStatusNode);
        permanentResidentFlagNode = childFactory.createPermanentResidentFlagNode();
        children.add(permanentResidentFlagNode);
        spouseNode = childFactory.createSpouseNode();
        children.add(spouseNode);
        firstHomeBuyerFlagNode = childFactory.createFirstHomeBuyerFlagNode();
        children.add(firstHomeBuyerFlagNode);
        housingStatusNode = childFactory.createHousingStatusNode();
        children.add(housingStatusNode);
        applicationTypeNode = childFactory.createApplicationTypeNode();
        children.add(applicationTypeNode);
        return children;
    }

}
