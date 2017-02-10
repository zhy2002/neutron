package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.lodgement.data.*;

public class PersonGeneralNode extends ObjectUiNode<PersonNode>
{
    private TitleNode titleNode;
    private FirstNameNode firstNameNode;
    private LastNameNode lastNameNode;
    private GenderNode genderNode;
    private DateOfBirthNode dateOfBirthNode;
    private PrimaryApplicantFlagNode primaryApplicantFlagNode;
    private DriversLicenseNode driversLicenseNode;
    private ApplicantTypeNode applicantTypeNode;
    private MaritalStatusNode maritalStatusNode;
    private PermanentResidentFlagNode permanentResidentFlagNode;
    private SpouseNode spouseNode;
    private FirstHomeBuyerFlagNode firstHomeBuyerFlagNode;
    private HousingStatusNode housingStatusNode;
    private ApplicationTypeNode applicationTypeNode;

    private PersonGeneralNodeChildFactory childFactory;

    @Inject
    void receiveProviders(PersonGeneralNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Inject
    void receiveClassRegistry(ClassRegistryImpl classRegistry) {
        UiNodeConfig<PersonGeneralNode> config = classRegistry.getUiNodeConfig(PersonGeneralNode.class, getName());
        if (config != null) {
            this.setStatusListener(new ConfigBindingNodeStatusListener<>(this, config));
        }
    }

    public PersonGeneralNode(PersonNode parent, String name) {
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
    public ApplicantTypeNode getApplicantTypeNode() {
        return applicantTypeNode;
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
        applicantTypeNode = childFactory.createApplicantTypeNode();
        children.add(applicantTypeNode);
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
