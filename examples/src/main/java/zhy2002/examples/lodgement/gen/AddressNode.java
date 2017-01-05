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

public abstract class AddressNode<P extends ParentUiNode<?>> extends ObjectUiNode<P>
{
    private AddressLineNode addressLineNode;
    private SuburbNode suburbNode;
    private PostcodeNode postcodeNode;
    private CountryNode countryNode;

    protected AddressNode(P parent, String name) {
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
        UiNodeContext<?> context = getContext();

        addressLineNode = context.createChildNode(AddressLineNode.class, this, "addressLineNode");
        suburbNode = context.createChildNode(SuburbNode.class, this, "suburbNode");
        postcodeNode = context.createChildNode(PostcodeNode.class, this, "postcodeNode");
        countryNode = context.createChildNode(CountryNode.class, this, "countryNode");

        return Arrays.asList(
            addressLineNode,
            suburbNode,
            postcodeNode,
            countryNode
        );
    }


}
