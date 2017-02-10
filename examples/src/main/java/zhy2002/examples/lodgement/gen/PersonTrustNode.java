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

public class PersonTrustNode extends ObjectUiNode<PersonNode>
{
    private PersonTrustTypeNode personTrustTypeNode;
    private PersonTrustNameNode personTrustNameNode;
    private PersonTrustRegistrationDateNode personTrustRegistrationDateNode;
    private PersonTrustCountryNode personTrustCountryNode;
    private PersonTrustAddressNode personTrustAddressNode;
    private PersonTrustSettlorNotRequiredReasonNode personTrustSettlorNotRequiredReasonNode;
    private PersonTrustIndustryNode personTrustIndustryNode;

    private PersonTrustNodeChildFactory childFactory;

    @Inject
    void receiveProviders(PersonTrustNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Inject
    void receiveClassRegistry(ClassRegistryImpl classRegistry) {
        UiNodeConfig<PersonTrustNode> config = classRegistry.getUiNodeConfig(PersonTrustNode.class, getName());
        if (config != null) {
            this.setStatusListener(new ConfigBindingNodeStatusListener<>(this, config));
        }
    }

    public PersonTrustNode(PersonNode parent, String name) {
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
        personTrustTypeNode = childFactory.createPersonTrustTypeNode();
        children.add(personTrustTypeNode);
        personTrustNameNode = childFactory.createPersonTrustNameNode();
        children.add(personTrustNameNode);
        personTrustRegistrationDateNode = childFactory.createPersonTrustRegistrationDateNode();
        children.add(personTrustRegistrationDateNode);
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
