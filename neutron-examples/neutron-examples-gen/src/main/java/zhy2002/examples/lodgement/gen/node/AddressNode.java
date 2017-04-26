package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;

public abstract class AddressNode<P extends ParentUiNode<?>> extends ObjectUiNode<P> {

    private AddressLineNode addressLineNode;
    private SuburbNode suburbNode;
    private PostcodeNode postcodeNode;
    private CountryNode countryNode;

    private AddressNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(AddressNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }


    public AddressNode(@NotNull P parent, String name) {
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

}
