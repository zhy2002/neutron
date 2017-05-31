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
    private PersonContactNodeComponent component;

    public PersonContactNode(@NotNull PersonNode parent, String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return PersonContactNode.class;
    }

    @Inject
    void receiveNodeProvider(PersonContactNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

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
        setChildNodeIdentity("homePhoneNode");
        children.add(childFactory.createHomePhoneNode());
        setChildNodeIdentity("workPhoneNode");
        children.add(childFactory.createWorkPhoneNode());
        setChildNodeIdentity("faxNumberNode");
        children.add(childFactory.createFaxNumberNode());
        setChildNodeIdentity("personMobileNumberNode");
        children.add(childFactory.createPersonMobileNumberNode());
        setChildNodeIdentity("personEmailNode");
        children.add(childFactory.createPersonEmailNode());
        setChildNodeIdentity("currentAddressNode");
        children.add(childFactory.createCurrentAddressNode());
        setChildNodeIdentity("movedToCurrentAddressNode");
        children.add(childFactory.createMovedToCurrentAddressNode());
        setChildNodeIdentity("postalAddressNode");
        children.add(childFactory.createPostalAddressNode());
        setChildNodeIdentity("previousAddressNode");
        children.add(childFactory.createPreviousAddressNode());
        setChildNodeIdentity("movedToPreviousAddressNode");
        children.add(childFactory.createMovedToPreviousAddressNode());
        setChildNodeIdentity("movedFromPreviousAddressNode");
        children.add(childFactory.createMovedFromPreviousAddressNode());
        setChildNodeIdentity(null);
        return children;
    }

}
