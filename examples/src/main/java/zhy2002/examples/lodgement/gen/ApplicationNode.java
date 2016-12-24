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


public  class ApplicationNode extends ObjectUiNode<VoidUiNode>
{
    private PersonListNode personListNode;
    private CompanyListNode companyListNode;
    private FinancialPositionNode financialPositionNode;
    private RealEstateListNode realEstateListNode;
    private ProductsNode productsNode;
    private AdditionalNode additionalNode;
    private SubmissionNode submissionNode;

    ApplicationNode(@NotNull AbstractUiNodeContext<?> context) {
        super(context);
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

        return Arrays.asList(
            personListNode,
            companyListNode,
            financialPositionNode,
            realEstateListNode,
            productsNode,
            additionalNode,
            submissionNode
        );
    }

}
