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


    public PersonContactNode(@NotNull PersonNode parent, String name) {
        super(parent, name);
    }

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

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        children.add(childFactory.createHomePhoneNode());
        children.add(childFactory.createWorkPhoneNode());
        children.add(childFactory.createFaxNumberNode());
        children.add(childFactory.createPersonMobileNumberNode());
        children.add(childFactory.createPersonEmailNode());
        children.add(childFactory.createCurrentAddressNode());
        children.add(childFactory.createMovedToCurrentAddressNode());
        children.add(childFactory.createPostalAddressNode());
        children.add(childFactory.createPreviousAddressNode());
        children.add(childFactory.createMovedToPreviousAddressNode());
        children.add(childFactory.createMovedFromPreviousAddressNode());
        return children;
    }

}
