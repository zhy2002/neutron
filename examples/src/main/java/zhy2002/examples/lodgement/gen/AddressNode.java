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

public abstract class AddressNode<P extends ParentUiNode<?>> extends ObjectUiNode<P>
{
    private AddressLineNode addressLineNode;
    private SuburbNode suburbNode;
    private PostcodeNode postcodeNode;
    private CountryNode countryNode;

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
        UiNodeContext<?> context = getContext();
        addressLineNode = context.createChildNode(AddressLineNode.class, this, "addressLineNode");
        children.add(addressLineNode);
        suburbNode = context.createChildNode(SuburbNode.class, this, "suburbNode");
        children.add(suburbNode);
        postcodeNode = context.createChildNode(PostcodeNode.class, this, "postcodeNode");
        children.add(postcodeNode);
        countryNode = context.createChildNode(CountryNode.class, this, "countryNode");
        children.add(countryNode);
        return children;
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        UiNodeContext<?> context = getContext();
        createdRules.add(context.createUiNodeRule(UpdateAddressRefListRule.class, this));
    }



}
