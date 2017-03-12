package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class PersonContactNode extends ObjectUiNode<PersonNode> {

    private PersonTelephoneNode homePhoneNode;
    private PersonTelephoneNode workPhoneNode;
    private PersonTelephoneNode faxNumberNode;
    private PersonMobileNumberNode personMobileNumberNode;
    private PersonEmailNode personEmailNode;
    private PersonAddressNode currentAddressNode;
    private MovedToCurrentAddressNode movedToCurrentAddressNode;
    private PersonAddressNode postalAddressNode;
    private PersonAddressNode previousAddressNode;
    private MovedToPreviousAddressNode movedToPreviousAddressNode;
    private MovedFromPreviousAddressNode movedFromPreviousAddressNode;

    private PersonContactNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(PersonContactNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return PersonContactNode.class;
    }

    private PersonContactNodeComponent component;

    @Inject
    void createComponent(PersonContactNodeComponent.Builder builder) {
        this.component = builder.setPersonContactNodeModule(new PersonContactNodeModule(this)).build();
    }

    private PersonContactNodeRuleProvider getRuleProvider() {
        return component.getPersonContactNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
        getInstanceRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
        getInstanceRuleProvider().createRules(createdRules);
    }

    private RuleProvider<PersonContactNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    public PersonContactNode(@NotNull PersonNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public PersonTelephoneNode getHomePhoneNode() {
        return homePhoneNode;
    }

    @JsMethod
    public PersonTelephoneNode getWorkPhoneNode() {
        return workPhoneNode;
    }

    @JsMethod
    public PersonTelephoneNode getFaxNumberNode() {
        return faxNumberNode;
    }

    @JsMethod
    public PersonMobileNumberNode getPersonMobileNumberNode() {
        return personMobileNumberNode;
    }

    @JsMethod
    public PersonEmailNode getPersonEmailNode() {
        return personEmailNode;
    }

    @JsMethod
    public PersonAddressNode getCurrentAddressNode() {
        return currentAddressNode;
    }

    @JsMethod
    public MovedToCurrentAddressNode getMovedToCurrentAddressNode() {
        return movedToCurrentAddressNode;
    }

    @JsMethod
    public PersonAddressNode getPostalAddressNode() {
        return postalAddressNode;
    }

    @JsMethod
    public PersonAddressNode getPreviousAddressNode() {
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
        personMobileNumberNode = childFactory.createPersonMobileNumberNode();
        children.add(personMobileNumberNode);
        personEmailNode = childFactory.createPersonEmailNode();
        children.add(personEmailNode);
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
