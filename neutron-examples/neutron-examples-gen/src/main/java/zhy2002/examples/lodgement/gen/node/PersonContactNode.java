package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.PersonContactNodeComponent;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class PersonContactNode extends ObjectUiNode<PersonNode> {

    @Inject
    public PersonContactNode(@Owner PersonNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return PersonContactNode.class;
    }

    protected final PersonContactNodeComponent getComponent() {
        return component;
    }


    private PersonContactNodeComponent component;

    @Inject
    void createComponent(PersonContactNodeComponent.Builder builder) {
        this.component = builder.setPersonContactNodeModule(new PersonContactNodeModule(this)).build();
    }

    private RuleProvider<PersonContactNode> getRuleProvider() {
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

    //region children getters

    @JsMethod
    public PersonTelephoneNode getHomePhoneNode() {
        return (PersonTelephoneNode)getChildByName("homePhoneNode");
    }

    @JsMethod
    public PersonTelephoneNode getWorkPhoneNode() {
        return (PersonTelephoneNode)getChildByName("workPhoneNode");
    }

    @JsMethod
    public PersonTelephoneNode getFaxNumberNode() {
        return (PersonTelephoneNode)getChildByName("faxNumberNode");
    }

    @JsMethod
    public PersonMobileNumberNode getPersonMobileNumberNode() {
        return (PersonMobileNumberNode)getChildByName("personMobileNumberNode");
    }

    @JsMethod
    public PersonEmailNode getPersonEmailNode() {
        return (PersonEmailNode)getChildByName("personEmailNode");
    }

    @JsMethod
    public PersonAddressNode getCurrentAddressNode() {
        return (PersonAddressNode)getChildByName("currentAddressNode");
    }

    @JsMethod
    public MovedToCurrentAddressNode getMovedToCurrentAddressNode() {
        return (MovedToCurrentAddressNode)getChildByName("movedToCurrentAddressNode");
    }

    @JsMethod
    public PersonAddressNode getPostalAddressNode() {
        return (PersonAddressNode)getChildByName("postalAddressNode");
    }

    @JsMethod
    public PersonAddressNode getPreviousAddressNode() {
        return (PersonAddressNode)getChildByName("previousAddressNode");
    }

    @JsMethod
    public MovedToPreviousAddressNode getMovedToPreviousAddressNode() {
        return (MovedToPreviousAddressNode)getChildByName("movedToPreviousAddressNode");
    }

    @JsMethod
    public MovedFromPreviousAddressNode getMovedFromPreviousAddressNode() {
        return (MovedFromPreviousAddressNode)getChildByName("movedFromPreviousAddressNode");
    }

    //endregion
    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("homePhoneNode");
        children.add(getComponent().createPersonTelephoneNode());
        setChildNodeIdentity("workPhoneNode");
        children.add(getComponent().createPersonTelephoneNode());
        setChildNodeIdentity("faxNumberNode");
        children.add(getComponent().createPersonTelephoneNode());
        setChildNodeIdentity("personMobileNumberNode");
        children.add(getComponent().createPersonMobileNumberNode());
        setChildNodeIdentity("personEmailNode");
        children.add(getComponent().createPersonEmailNode());
        setChildNodeIdentity("currentAddressNode");
        children.add(getComponent().createPersonAddressNode());
        setChildNodeIdentity("movedToCurrentAddressNode");
        children.add(getComponent().createMovedToCurrentAddressNode());
        setChildNodeIdentity("postalAddressNode");
        children.add(getComponent().createPersonAddressNode());
        setChildNodeIdentity("previousAddressNode");
        children.add(getComponent().createPersonAddressNode());
        setChildNodeIdentity("movedToPreviousAddressNode");
        children.add(getComponent().createMovedToPreviousAddressNode());
        setChildNodeIdentity("movedFromPreviousAddressNode");
        children.add(getComponent().createMovedFromPreviousAddressNode());
        setChildNodeIdentity(null);
        return children;
    }

}
