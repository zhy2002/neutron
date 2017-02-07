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

public  class PersonContactNode extends ObjectUiNode<PersonNode>
{
    private ContactTelephoneNode homePhoneNode;
    private ContactTelephoneNode workPhoneNode;
    private ContactTelephoneNode faxNumberNode;
    private MobileNumberNode mobileNumberNode;
    private ContactEmailNode contactEmailNode;
    private ContactAddressNode currentAddressNode;
    private MovedToCurrentAddressNode movedToCurrentAddressNode;
    private ContactAddressNode postalAddressNode;
    private ContactAddressNode previousAddressNode;
    private MovedToPreviousAddressNode movedToPreviousAddressNode;
    private MovedFromPreviousAddressNode movedFromPreviousAddressNode;

    public PersonContactNode(PersonNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public ContactTelephoneNode getHomePhoneNode() {
        return homePhoneNode;
    }

    @JsMethod
    public ContactTelephoneNode getWorkPhoneNode() {
        return workPhoneNode;
    }

    @JsMethod
    public ContactTelephoneNode getFaxNumberNode() {
        return faxNumberNode;
    }

    @JsMethod
    public MobileNumberNode getMobileNumberNode() {
        return mobileNumberNode;
    }

    @JsMethod
    public ContactEmailNode getContactEmailNode() {
        return contactEmailNode;
    }

    @JsMethod
    public ContactAddressNode getCurrentAddressNode() {
        return currentAddressNode;
    }

    @JsMethod
    public MovedToCurrentAddressNode getMovedToCurrentAddressNode() {
        return movedToCurrentAddressNode;
    }

    @JsMethod
    public ContactAddressNode getPostalAddressNode() {
        return postalAddressNode;
    }

    @JsMethod
    public ContactAddressNode getPreviousAddressNode() {
        return previousAddressNode;
    }

    @JsMethod
    public MovedToPreviousAddressNode getMovedToPreviousAddressNode() {
        return movedToPreviousAddressNode;
    }

    @JsMethod
    public MovedFromPreviousAddressNode getMovedFromPreviousAddressNode() {
        return movedFromPreviousAddressNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        UiNodeContext<?> context = getContext();
        homePhoneNode = context.createChildNode(ContactTelephoneNode.class, this, "homePhoneNode");
        children.add(homePhoneNode);
        workPhoneNode = context.createChildNode(ContactTelephoneNode.class, this, "workPhoneNode");
        children.add(workPhoneNode);
        faxNumberNode = context.createChildNode(ContactTelephoneNode.class, this, "faxNumberNode");
        children.add(faxNumberNode);
        mobileNumberNode = context.createChildNode(MobileNumberNode.class, this, "mobileNumberNode");
        children.add(mobileNumberNode);
        contactEmailNode = context.createChildNode(ContactEmailNode.class, this, "contactEmailNode");
        children.add(contactEmailNode);
        currentAddressNode = context.createChildNode(ContactAddressNode.class, this, "currentAddressNode");
        children.add(currentAddressNode);
        movedToCurrentAddressNode = context.createChildNode(MovedToCurrentAddressNode.class, this, "movedToCurrentAddressNode");
        children.add(movedToCurrentAddressNode);
        postalAddressNode = context.createChildNode(ContactAddressNode.class, this, "postalAddressNode");
        children.add(postalAddressNode);
        previousAddressNode = context.createChildNode(ContactAddressNode.class, this, "previousAddressNode");
        children.add(previousAddressNode);
        movedToPreviousAddressNode = context.createChildNode(MovedToPreviousAddressNode.class, this, "movedToPreviousAddressNode");
        children.add(movedToPreviousAddressNode);
        movedFromPreviousAddressNode = context.createChildNode(MovedFromPreviousAddressNode.class, this, "movedFromPreviousAddressNode");
        children.add(movedFromPreviousAddressNode);
        return children;
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        UiNodeContext<?> context = getContext();
        createdRules.add(context.createUiNodeRule(HomeOrWorkPhoneRequiredRule.class, this));
    }



}
