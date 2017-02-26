package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class PersonTrustNode extends ObjectUiNode<PersonNode> {

    private PersonTrustNameNode personTrustNameNode;
    private PersonTrustRegistrationDateNode personTrustRegistrationDateNode;
    private PersonTrustTypeNode personTrustTypeNode;
    private PersonTrustCountryNode personTrustCountryNode;
    private PersonTrustAddressNode personTrustAddressNode;
    private PersonTrustSettlorNotRequiredReasonNode personTrustSettlorNotRequiredReasonNode;
    private PersonTrustIndustryNode personTrustIndustryNode;

    private PersonTrustNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(PersonTrustNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return PersonTrustNode.class;
    }

    private PersonTrustNodeComponent component;

    @Inject
    void createComponent(PersonTrustNodeComponent.Builder builder) {
        this.component = builder.setPersonTrustNodeModule(new PersonTrustNodeModule(this)).build();
    }

    @Override
    protected PersonTrustNodeRuleProvider getRuleProvider() {
        return component.getPersonTrustNodeRuleProvider();
    }

    public PersonTrustNode(@NotNull PersonNode parent, String name) {
        super(parent, name);
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
    public PersonTrustTypeNode getPersonTrustTypeNode() {
        return personTrustTypeNode;
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
        personTrustNameNode = childFactory.createPersonTrustNameNode();
        children.add(personTrustNameNode);
        personTrustRegistrationDateNode = childFactory.createPersonTrustRegistrationDateNode();
        children.add(personTrustRegistrationDateNode);
        personTrustTypeNode = childFactory.createPersonTrustTypeNode();
        children.add(personTrustTypeNode);
        personTrustCountryNode = childFactory.createPersonTrustCountryNode();
        children.add(personTrustCountryNode);
        personTrustAddressNode = childFactory.createPersonTrustAddressNode();
        children.add(personTrustAddressNode);
        personTrustSettlorNotRequiredReasonNode = childFactory.createPersonTrustSettlorNotRequiredReasonNode();
        children.add(personTrustSettlorNotRequiredReasonNode);
        personTrustIndustryNode = childFactory.createPersonTrustIndustryNode();
        children.add(personTrustIndustryNode);
        return children;
    }

}
