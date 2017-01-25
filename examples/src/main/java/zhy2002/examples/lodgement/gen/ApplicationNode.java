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
    private PersonListNode personListNode;
    private CompanyListNode companyListNode;
    private FinancialPositionNode financialPositionNode;
    private RealEstateListNode realEstateListNode;
    private ProductsNode productsNode;
    private AdditionalNode additionalNode;
    private SubmissionNode submissionNode;
    private ErrorListNode errorListNode;

    protected ApplicationNode(@NotNull AbstractUiNodeContext<?> context) {
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
        UiNodeContext<?> context = getContext();

        personListNode = context.createChildNode(PersonListNode.class, this, "personListNode");
        companyListNode = context.createChildNode(CompanyListNode.class, this, "companyListNode");
        financialPositionNode = context.createChildNode(FinancialPositionNode.class, this, "financialPositionNode");
        realEstateListNode = context.createChildNode(RealEstateListNode.class, this, "realEstateListNode");
        productsNode = context.createChildNode(ProductsNode.class, this, "productsNode");
        additionalNode = context.createChildNode(AdditionalNode.class, this, "additionalNode");
        submissionNode = context.createChildNode(SubmissionNode.class, this, "submissionNode");
        errorListNode = context.createChildNode(ErrorListNode.class, this, "errorListNode");

        return Arrays.asList(
            personListNode,
            companyListNode,
            financialPositionNode,
            realEstateListNode,
            productsNode,
            additionalNode,
            submissionNode,
            errorListNode
        );
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        UiNodeContext<?> context = getContext();
        createdRules.add(context.createUiNodeRule(CreateErrorNodeRule.class, this));
        createdRules.add(context.createUiNodeRule(ShowErrorListRule.class, this));
    }



}
