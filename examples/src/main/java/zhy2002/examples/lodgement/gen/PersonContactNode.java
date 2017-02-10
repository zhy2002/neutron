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
import zhy2002.examples.lodgement.gen.rule.*;

public class PersonContactNode extends ObjectUiNode<PersonNode>
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

    private PersonContactNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(PersonContactNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Inject
    void receiveClassRegistry(ClassRegistryImpl classRegistry) {
        UiNodeConfig<PersonContactNode> config = classRegistry.getUiNodeConfig(PersonContactNode.class, getName());
        if (config != null) {
            this.setStatusListener(new ConfigBindingNodeStatusListener<>(this, config));
        }
    }

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

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        UiNodeContext<?> context = getContext();
        createdRules.add(context.createUiNodeRule(HomeOrWorkPhoneRequiredRule.class, this));
    }



}
