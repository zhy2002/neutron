package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.PersonGeneralNodeComponent;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class PersonGeneralNode extends ObjectUiNode<PersonNode> {

    @Inject
    protected PersonGeneralNode(@Owner PersonNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return PersonGeneralNode.class;
    }

    protected final PersonGeneralNodeComponent getComponent() {
        return component;
    }


    private PersonGeneralNodeComponent component;

    @Inject
    void createComponent(PersonGeneralNodeComponent.Builder builder) {
        this.component = builder.setPersonGeneralNodeModule(new PersonGeneralNodeModule(this)).build();
    }

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

    //region children getters

    @JsMethod
    public TitleNode getTitleNode() {
        return (TitleNode)getChildByName("titleNode");
    }

    @JsMethod
    public OtherTitleNode getOtherTitleNode() {
        return (OtherTitleNode)getChildByName("otherTitleNode");
    }

    @JsMethod
    public FirstNameNode getFirstNameNode() {
        return (FirstNameNode)getChildByName("firstNameNode");
    }

    @JsMethod
    public LastNameNode getLastNameNode() {
        return (LastNameNode)getChildByName("lastNameNode");
    }

    @JsMethod
    public GenderNode getGenderNode() {
        return (GenderNode)getChildByName("genderNode");
    }

    @JsMethod
    public DateOfBirthNode getDateOfBirthNode() {
        return (DateOfBirthNode)getChildByName("dateOfBirthNode");
    }

    @JsMethod
    public PrimaryApplicantFlagNode getPrimaryApplicantFlagNode() {
        return (PrimaryApplicantFlagNode)getChildByName("primaryApplicantFlagNode");
    }

    @JsMethod
    public DriversLicenseNode getDriversLicenseNode() {
        return (DriversLicenseNode)getChildByName("driversLicenseNode");
    }

    @JsMethod
    public PersonApplicantTypeNode getPersonApplicantTypeNode() {
        return (PersonApplicantTypeNode)getChildByName("personApplicantTypeNode");
    }

    @JsMethod
    public MaritalStatusNode getMaritalStatusNode() {
        return (MaritalStatusNode)getChildByName("maritalStatusNode");
    }

    @JsMethod
    public PermanentResidentFlagNode getPermanentResidentFlagNode() {
        return (PermanentResidentFlagNode)getChildByName("permanentResidentFlagNode");
    }

    @JsMethod
    public SpouseNode getSpouseNode() {
        return (SpouseNode)getChildByName("spouseNode");
    }

    @JsMethod
    public NextOfKinNode getNextOfKinNode() {
        return (NextOfKinNode)getChildByName("nextOfKinNode");
    }

    @JsMethod
    public AgeOfDependantsNode getAgeOfDependantsNode() {
        return (AgeOfDependantsNode)getChildByName("ageOfDependantsNode");
    }

    @JsMethod
    public FirstHomeBuyerFlagNode getFirstHomeBuyerFlagNode() {
        return (FirstHomeBuyerFlagNode)getChildByName("firstHomeBuyerFlagNode");
    }

    @JsMethod
    public HousingStatusNode getHousingStatusNode() {
        return (HousingStatusNode)getChildByName("housingStatusNode");
    }

    @JsMethod
    public ApplicationTypeNode getApplicationTypeNode() {
        return (ApplicationTypeNode)getChildByName("applicationTypeNode");
    }

    //endregion
    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("titleNode");
        children.add(getComponent().createTitleNode());
        setChildNodeIdentity("otherTitleNode");
        children.add(getComponent().createOtherTitleNode());
        setChildNodeIdentity("firstNameNode");
        children.add(getComponent().createFirstNameNode());
        setChildNodeIdentity("lastNameNode");
        children.add(getComponent().createLastNameNode());
        setChildNodeIdentity("genderNode");
        children.add(getComponent().createGenderNode());
        setChildNodeIdentity("dateOfBirthNode");
        children.add(getComponent().createDateOfBirthNode());
        setChildNodeIdentity("primaryApplicantFlagNode");
        children.add(getComponent().createPrimaryApplicantFlagNode());
        setChildNodeIdentity("driversLicenseNode");
        children.add(getComponent().createDriversLicenseNode());
        setChildNodeIdentity("personApplicantTypeNode");
        children.add(getComponent().createPersonApplicantTypeNode());
        setChildNodeIdentity("maritalStatusNode");
        children.add(getComponent().createMaritalStatusNode());
        setChildNodeIdentity("permanentResidentFlagNode");
        children.add(getComponent().createPermanentResidentFlagNode());
        setChildNodeIdentity("spouseNode");
        children.add(getComponent().createSpouseNode());
        setChildNodeIdentity("nextOfKinNode");
        children.add(getComponent().createNextOfKinNode());
        setChildNodeIdentity("ageOfDependantsNode");
        children.add(getComponent().createAgeOfDependantsNode());
        setChildNodeIdentity("firstHomeBuyerFlagNode");
        children.add(getComponent().createFirstHomeBuyerFlagNode());
        setChildNodeIdentity("housingStatusNode");
        children.add(getComponent().createHousingStatusNode());
        setChildNodeIdentity("applicationTypeNode");
        children.add(getComponent().createApplicationTypeNode());
        setChildNodeIdentity(null);
        return children;
    }

}
