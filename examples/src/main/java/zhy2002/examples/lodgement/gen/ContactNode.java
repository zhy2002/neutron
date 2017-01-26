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

public  class ContactNode extends ObjectUiNode<PersonNode>
{
    private ContactTelephoneNode homePhoneNode;
    private ContactTelephoneNode workPhoneNode;
    private ContactTelephoneNode faxNumberNode;
    private MobileNumberNode mobileNumberNode;
    private ContactEmailNode contactEmailNode;
    private ContactAddressNode currentAddressNode;
    private ContactMonthYearNode movedToCurrentAddressNode;
    private ContactAddressNode postalAddressNode;
    private ContactAddressNode previousAddressNode;
    private ContactMonthYearNode movedToPreviousAddressNode;
    private ContactMonthYearNode movedFromPreviousAddressNode;

    protected ContactNode(PersonNode parent, String name) {
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
    public ContactMonthYearNode getMovedToCurrentAddressNode() {
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
    public ContactMonthYearNode getMovedToPreviousAddressNode() {
        return movedToPreviousAddressNode;
    }

    @JsMethod
    public ContactMonthYearNode getMovedFromPreviousAddressNode() {
        return movedFromPreviousAddressNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        UiNodeContext<?> context = getContext();

        homePhoneNode = context.createChildNode(ContactTelephoneNode.class, this, "homePhoneNode");
        workPhoneNode = context.createChildNode(ContactTelephoneNode.class, this, "workPhoneNode");
        faxNumberNode = context.createChildNode(ContactTelephoneNode.class, this, "faxNumberNode");
        mobileNumberNode = context.createChildNode(MobileNumberNode.class, this, "mobileNumberNode");
        contactEmailNode = context.createChildNode(ContactEmailNode.class, this, "contactEmailNode");
        currentAddressNode = context.createChildNode(ContactAddressNode.class, this, "currentAddressNode");
        movedToCurrentAddressNode = context.createChildNode(ContactMonthYearNode.class, this, "movedToCurrentAddressNode");
        postalAddressNode = context.createChildNode(ContactAddressNode.class, this, "postalAddressNode");
        previousAddressNode = context.createChildNode(ContactAddressNode.class, this, "previousAddressNode");
        movedToPreviousAddressNode = context.createChildNode(ContactMonthYearNode.class, this, "movedToPreviousAddressNode");
        movedFromPreviousAddressNode = context.createChildNode(ContactMonthYearNode.class, this, "movedFromPreviousAddressNode");

        return Arrays.asList(
            homePhoneNode,
            workPhoneNode,
            faxNumberNode,
            mobileNumberNode,
            contactEmailNode,
            currentAddressNode,
            movedToCurrentAddressNode,
            postalAddressNode,
            previousAddressNode,
            movedToPreviousAddressNode,
            movedFromPreviousAddressNode
        );
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        UiNodeContext<?> context = getContext();
        createdRules.add(context.createUiNodeRule(HomeOrWorkPhoneRequiredRule.class, this));
    }



}
