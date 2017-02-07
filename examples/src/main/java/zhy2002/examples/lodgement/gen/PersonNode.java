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

public  class PersonNode extends ObjectUiNode<PersonListNode>
{
    private PersonGeneralNode personGeneralNode;
    private PersonContactNode personContactNode;
    private CurrentEmploymentListNode currentEmploymentListNode;
    private PreviousEmploymentListNode previousEmploymentListNode;
    private PersonTrustNode personTrustNode;
    private PersonPrivacyNode personPrivacyNode;
    private PersonOtherIncomeListNode personOtherIncomeListNode;
    private PersonResponsibleLendNode personResponsibleLendNode;

    public PersonNode(PersonListNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setSelectedName("personGeneralNode");
    }

    @JsMethod
    public PersonGeneralNode getPersonGeneralNode() {
        return personGeneralNode;
    }

    @JsMethod
    public PersonContactNode getPersonContactNode() {
        return personContactNode;
    }

    @JsMethod
    public CurrentEmploymentListNode getCurrentEmploymentListNode() {
        return currentEmploymentListNode;
    }

    @JsMethod
    public PreviousEmploymentListNode getPreviousEmploymentListNode() {
        return previousEmploymentListNode;
    }

    @JsMethod
    public PersonTrustNode getPersonTrustNode() {
        return personTrustNode;
    }

    @JsMethod
    public PersonPrivacyNode getPersonPrivacyNode() {
        return personPrivacyNode;
    }

    @JsMethod
    public PersonOtherIncomeListNode getPersonOtherIncomeListNode() {
        return personOtherIncomeListNode;
    }

    @JsMethod
    public PersonResponsibleLendNode getPersonResponsibleLendNode() {
        return personResponsibleLendNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        UiNodeContext<?> context = getContext();
        personGeneralNode = context.createChildNode(PersonGeneralNode.class, this, "personGeneralNode");
        children.add(personGeneralNode);
        personContactNode = context.createChildNode(PersonContactNode.class, this, "personContactNode");
        children.add(personContactNode);
        currentEmploymentListNode = context.createChildNode(CurrentEmploymentListNode.class, this, "currentEmploymentListNode");
        children.add(currentEmploymentListNode);
        previousEmploymentListNode = context.createChildNode(PreviousEmploymentListNode.class, this, "previousEmploymentListNode");
        children.add(previousEmploymentListNode);
        personTrustNode = context.createChildNode(PersonTrustNode.class, this, "personTrustNode");
        children.add(personTrustNode);
        personPrivacyNode = context.createChildNode(PersonPrivacyNode.class, this, "personPrivacyNode");
        children.add(personPrivacyNode);
        personOtherIncomeListNode = context.createChildNode(PersonOtherIncomeListNode.class, this, "personOtherIncomeListNode");
        children.add(personOtherIncomeListNode);
        personResponsibleLendNode = context.createChildNode(PersonResponsibleLendNode.class, this, "personResponsibleLendNode");
        children.add(personResponsibleLendNode);
        return children;
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        UiNodeContext<?> context = getContext();
        createdRules.add(context.createUiNodeRule(UpdatePersonNodeLabelRule.class, this));
    }



}
