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

public  class PersonTrustNode extends ObjectUiNode<PersonNode>
{
    private PersonTrustTypeNode personTrustTypeNode;
    private PersonTrustNameNode personTrustNameNode;
    private PersonTrustRegistrationDateNode personTrustRegistrationDateNode;
    private PersonTrustCountryNode personTrustCountryNode;
    private PersonTrustAddressNode personTrustAddressNode;
    private PersonTrustSettlorNotRequiredReasonNode personTrustSettlorNotRequiredReasonNode;
    private PersonTrustIndustryNode personTrustIndustryNode;

    protected PersonTrustNode(PersonNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public PersonTrustTypeNode getPersonTrustTypeNode() {
        return personTrustTypeNode;
    }

    @JsMethod
    public PersonTrustNameNode getPersonTrustNameNode() {
        return personTrustNameNode;
    }

    @JsMethod
    public PersonTrustRegistrationDateNode getPersonTrustRegistrationDateNode() {
        return personTrustRegistrationDateNode;
    }

    @JsMethod
    public PersonTrustCountryNode getPersonTrustCountryNode() {
        return personTrustCountryNode;
    }

    @JsMethod
    public PersonTrustAddressNode getPersonTrustAddressNode() {
        return personTrustAddressNode;
    }

    @JsMethod
    public PersonTrustSettlorNotRequiredReasonNode getPersonTrustSettlorNotRequiredReasonNode() {
        return personTrustSettlorNotRequiredReasonNode;
    }

    @JsMethod
    public PersonTrustIndustryNode getPersonTrustIndustryNode() {
        return personTrustIndustryNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        UiNodeContext<?> context = getContext();
        personTrustTypeNode = context.createChildNode(PersonTrustTypeNode.class, this, "personTrustTypeNode");
        children.add(personTrustTypeNode);
        personTrustNameNode = context.createChildNode(PersonTrustNameNode.class, this, "personTrustNameNode");
        children.add(personTrustNameNode);
        personTrustRegistrationDateNode = context.createChildNode(PersonTrustRegistrationDateNode.class, this, "personTrustRegistrationDateNode");
        children.add(personTrustRegistrationDateNode);
        personTrustCountryNode = context.createChildNode(PersonTrustCountryNode.class, this, "personTrustCountryNode");
        children.add(personTrustCountryNode);
        personTrustAddressNode = context.createChildNode(PersonTrustAddressNode.class, this, "personTrustAddressNode");
        children.add(personTrustAddressNode);
        personTrustSettlorNotRequiredReasonNode = context.createChildNode(PersonTrustSettlorNotRequiredReasonNode.class, this, "personTrustSettlorNotRequiredReasonNode");
        children.add(personTrustSettlorNotRequiredReasonNode);
        personTrustIndustryNode = context.createChildNode(PersonTrustIndustryNode.class, this, "personTrustIndustryNode");
        children.add(personTrustIndustryNode);
        return children;
    }



}
