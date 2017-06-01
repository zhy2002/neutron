package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class PersonGeneralNode extends ObjectUiNode<PersonNode> {

    private PersonGeneralNodeChildFactory childFactory;
    private PersonGeneralNodeComponent component;

    @Inject
    public PersonGeneralNode(@Owner PersonNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return PersonGeneralNode.class;
    }

    @Inject
    void receiveNodeProvider(PersonGeneralNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Inject
    void createComponent(PersonGeneralNodeComponent.Builder builder) {
        this.component = builder.setPersonGeneralNodeModule(new PersonGeneralNodeModule(this)).build();
    }

    private RuleProvider<PersonGeneralNode> getRuleProvider() {
        return component.getPersonGeneralNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
        getInstanceRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
        getInstanceRuleProvider().createRules(createdRules);
    }

    private RuleProvider<PersonGeneralNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

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

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("titleNode");
        children.add(childFactory.createTitleNode());
        setChildNodeIdentity("otherTitleNode");
        children.add(childFactory.createOtherTitleNode());
        setChildNodeIdentity("firstNameNode");
        children.add(childFactory.createFirstNameNode());
        setChildNodeIdentity("lastNameNode");
        children.add(childFactory.createLastNameNode());
        setChildNodeIdentity("genderNode");
        children.add(childFactory.createGenderNode());
        setChildNodeIdentity("dateOfBirthNode");
        children.add(childFactory.createDateOfBirthNode());
        setChildNodeIdentity("primaryApplicantFlagNode");
        children.add(childFactory.createPrimaryApplicantFlagNode());
        setChildNodeIdentity("driversLicenseNode");
        children.add(childFactory.createDriversLicenseNode());
        setChildNodeIdentity("personApplicantTypeNode");
        children.add(childFactory.createPersonApplicantTypeNode());
        setChildNodeIdentity("maritalStatusNode");
        children.add(childFactory.createMaritalStatusNode());
        setChildNodeIdentity("permanentResidentFlagNode");
        children.add(childFactory.createPermanentResidentFlagNode());
        setChildNodeIdentity("spouseNode");
        children.add(childFactory.createSpouseNode());
        setChildNodeIdentity("nextOfKinNode");
        children.add(childFactory.createNextOfKinNode());
        setChildNodeIdentity("ageOfDependantsNode");
        children.add(childFactory.createAgeOfDependantsNode());
        setChildNodeIdentity("firstHomeBuyerFlagNode");
        children.add(childFactory.createFirstHomeBuyerFlagNode());
        setChildNodeIdentity("housingStatusNode");
        children.add(childFactory.createHousingStatusNode());
        setChildNodeIdentity("applicationTypeNode");
        children.add(childFactory.createApplicationTypeNode());
        setChildNodeIdentity(null);
        return children;
    }

}
