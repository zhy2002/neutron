package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.lodgement.data.*;

public  class PersonGeneralNode extends ObjectUiNode<PersonNode>
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
        UiNodeContext<?> context = getContext();
        titleNode = context.createChildNode(TitleNode.class, this, "titleNode");
        children.add(titleNode);
        firstNameNode = context.createChildNode(FirstNameNode.class, this, "firstNameNode");
        children.add(firstNameNode);
        lastNameNode = context.createChildNode(LastNameNode.class, this, "lastNameNode");
        children.add(lastNameNode);
        genderNode = context.createChildNode(GenderNode.class, this, "genderNode");
        children.add(genderNode);
        dateOfBirthNode = context.createChildNode(DateOfBirthNode.class, this, "dateOfBirthNode");
        children.add(dateOfBirthNode);
        primaryApplicantFlagNode = context.createChildNode(PrimaryApplicantFlagNode.class, this, "primaryApplicantFlagNode");
        children.add(primaryApplicantFlagNode);
        driversLicenseNode = context.createChildNode(DriversLicenseNode.class, this, "driversLicenseNode");
        children.add(driversLicenseNode);
        applicantTypeNode = context.createChildNode(ApplicantTypeNode.class, this, "applicantTypeNode");
        children.add(applicantTypeNode);
        maritalStatusNode = context.createChildNode(MaritalStatusNode.class, this, "maritalStatusNode");
        children.add(maritalStatusNode);
        permanentResidentFlagNode = context.createChildNode(PermanentResidentFlagNode.class, this, "permanentResidentFlagNode");
        children.add(permanentResidentFlagNode);
        spouseNode = context.createChildNode(SpouseNode.class, this, "spouseNode");
        children.add(spouseNode);
        firstHomeBuyerFlagNode = context.createChildNode(FirstHomeBuyerFlagNode.class, this, "firstHomeBuyerFlagNode");
        children.add(firstHomeBuyerFlagNode);
        housingStatusNode = context.createChildNode(HousingStatusNode.class, this, "housingStatusNode");
        children.add(housingStatusNode);
        applicationTypeNode = context.createChildNode(ApplicationTypeNode.class, this, "applicationTypeNode");
        children.add(applicationTypeNode);
        return children;
    }



}
