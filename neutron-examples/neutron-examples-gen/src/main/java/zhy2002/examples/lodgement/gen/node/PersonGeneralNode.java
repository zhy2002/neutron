package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class PersonGeneralNode extends ObjectUiNode<PersonNode> {

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


    public PersonGeneralNode(@NotNull PersonNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public TitleNode getTitleNode() {
        return (TitleNode)getChildByName("titleNode");
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
        children.add(childFactory.createTitleNode());
        children.add(childFactory.createFirstNameNode());
        children.add(childFactory.createLastNameNode());
        children.add(childFactory.createGenderNode());
        children.add(childFactory.createDateOfBirthNode());
        children.add(childFactory.createPrimaryApplicantFlagNode());
        children.add(childFactory.createDriversLicenseNode());
        children.add(childFactory.createPersonApplicantTypeNode());
        children.add(childFactory.createMaritalStatusNode());
        children.add(childFactory.createPermanentResidentFlagNode());
        children.add(childFactory.createSpouseNode());
        children.add(childFactory.createFirstHomeBuyerFlagNode());
        children.add(childFactory.createHousingStatusNode());
        children.add(childFactory.createApplicationTypeNode());
        return children;
    }

}
