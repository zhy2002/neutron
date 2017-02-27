package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;


public abstract class BaseContactNode<P extends ParentUiNode<?>> extends ObjectUiNode<P> {

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

    private BaseContactNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(BaseContactNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Override
    protected abstract BaseContactNodeRuleProvider<?> getRuleProvider();

    public BaseContactNode(@NotNull P parent, String name) {
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
        homePhoneNode = childFactory.createHomePhoneNode();
        children.add(homePhoneNode);
        workPhoneNode = childFactory.createWorkPhoneNode();
        children.add(workPhoneNode);
        faxNumberNode = childFactory.createFaxNumberNode();
        children.add(faxNumberNode);
        mobileNumberNode = childFactory.createMobileNumberNode();
        children.add(mobileNumberNode);
        contactEmailNode = childFactory.createContactEmailNode();
        children.add(contactEmailNode);
        currentAddressNode = childFactory.createCurrentAddressNode();
        children.add(currentAddressNode);
        movedToCurrentAddressNode = childFactory.createMovedToCurrentAddressNode();
        children.add(movedToCurrentAddressNode);
        postalAddressNode = childFactory.createPostalAddressNode();
        children.add(postalAddressNode);
        previousAddressNode = childFactory.createPreviousAddressNode();
        children.add(previousAddressNode);
        movedToPreviousAddressNode = childFactory.createMovedToPreviousAddressNode();
        children.add(movedToPreviousAddressNode);
        movedFromPreviousAddressNode = childFactory.createMovedFromPreviousAddressNode();
        children.add(movedFromPreviousAddressNode);
        return children;
    }

}