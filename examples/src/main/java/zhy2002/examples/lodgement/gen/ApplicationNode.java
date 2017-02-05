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
import zhy2002.examples.lodgement.gen.rule.*;

public  class ApplicationNode extends ObjectUiNode<VoidUiNode>
{
    private AddressListNode addressListNode;
    private PersonListNode personListNode;
    private CompanyListNode companyListNode;
    private FinancialPositionNode financialPositionNode;
    private RealEstateListNode realEstateListNode;
    private ProductsNode productsNode;
    private AdditionalNode additionalNode;
    private SubmissionNode submissionNode;
    private ErrorListNode errorListNode;

    protected ApplicationNode(@NotNull UiNodeContext<?> context) {
        super(context);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setSelectedName("personListNode");
        setChangeTrackingMode(ApplicationNodeConstants.CONTENT_LEVEL, ChangeTrackingModeEnum.Value);
    }

    @JsMethod
    public Boolean getShowErrorList() {
        return getStateValue(ApplicationNodeConstants.SHOW_ERROR_LIST, Boolean.FALSE);
    }

    @JsMethod
    public void setShowErrorList(Boolean value) {
        setStateValue(ApplicationNodeConstants.SHOW_ERROR_LIST, Boolean.class, value);
    }

    @JsMethod
    public int getContentLevel() {
        return getStateValue(ApplicationNodeConstants.CONTENT_LEVEL, 1);
    }

    @JsMethod
    public void setContentLevel(int value) {
        setStateValue(ApplicationNodeConstants.CONTENT_LEVEL, Integer.class, value);
    }

    @JsMethod
    public AddressListNode getAddressListNode() {
        return addressListNode;
    }

    @JsMethod
    public PersonListNode getPersonListNode() {
        return personListNode;
    }

    @JsMethod
    public CompanyListNode getCompanyListNode() {
        return companyListNode;
    }

    @JsMethod
    public FinancialPositionNode getFinancialPositionNode() {
        return financialPositionNode;
    }

    @JsMethod
    public RealEstateListNode getRealEstateListNode() {
        return realEstateListNode;
    }

    @JsMethod
    public ProductsNode getProductsNode() {
        return productsNode;
    }

    @JsMethod
    public AdditionalNode getAdditionalNode() {
        return additionalNode;
    }

    @JsMethod
    public SubmissionNode getSubmissionNode() {
        return submissionNode;
    }

    @JsMethod
    public ErrorListNode getErrorListNode() {
        return errorListNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        UiNodeContext<?> context = getContext();
        addressListNode = context.createChildNode(AddressListNode.class, this, "addressListNode");
        children.add(addressListNode);
        personListNode = context.createChildNode(PersonListNode.class, this, "personListNode");
        children.add(personListNode);
        companyListNode = context.createChildNode(CompanyListNode.class, this, "companyListNode");
        children.add(companyListNode);
        financialPositionNode = context.createChildNode(FinancialPositionNode.class, this, "financialPositionNode");
        children.add(financialPositionNode);
        realEstateListNode = context.createChildNode(RealEstateListNode.class, this, "realEstateListNode");
        children.add(realEstateListNode);
        productsNode = context.createChildNode(ProductsNode.class, this, "productsNode");
        children.add(productsNode);
        additionalNode = context.createChildNode(AdditionalNode.class, this, "additionalNode");
        children.add(additionalNode);
        submissionNode = context.createChildNode(SubmissionNode.class, this, "submissionNode");
        children.add(submissionNode);
        errorListNode = context.createChildNode(ErrorListNode.class, this, "errorListNode");
        children.add(errorListNode);
        return children;
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        UiNodeContext<?> context = getContext();
        createdRules.add(context.createUiNodeRule(CreateErrorNodeRule.class, this));
        createdRules.add(context.createUiNodeRule(ShowErrorListRule.class, this));
    }



}
