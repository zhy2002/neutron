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

public abstract class AddressNode<P extends ParentUiNode<?>> extends ObjectUiNode<P>
{
    private AddressLineNode addressLineNode;
    private SuburbNode suburbNode;
    private PostcodeNode postcodeNode;
    private CountryNode countryNode;

    private AddressNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(AddressNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    public AddressNode(P parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public AddressLineNode getAddressLineNode() {
        return addressLineNode;
    }

    @JsMethod
    public SuburbNode getSuburbNode() {
        return suburbNode;
    }

    @JsMethod
    public PostcodeNode getPostcodeNode() {
        return postcodeNode;
    }

    @JsMethod
    public CountryNode getCountryNode() {
        return countryNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        addressLineNode = childFactory.createAddressLineNode();
        children.add(addressLineNode);
        suburbNode = childFactory.createSuburbNode();
        children.add(suburbNode);
        postcodeNode = childFactory.createPostcodeNode();
        children.add(postcodeNode);
        countryNode = childFactory.createCountryNode();
        children.add(countryNode);
        return children;
    }

    @Inject
    AddressNodeRuleProvider ruleProvider;

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        createdRules.addAll(ruleProvider.createRules(this));
    }

}
