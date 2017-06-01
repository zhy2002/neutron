package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;

public abstract class AddressNode<P extends ParentUiNode<?>> extends ObjectUiNode<P> {

    private AddressNodeChildFactory childFactory;

    public AddressNode(P parent, String name) {
        super(parent, name);
    }

    @Inject
    void receiveNodeProvider(AddressNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @JsMethod
    public AddressLineNode getAddressLineNode() {
        return (AddressLineNode)getChildByName("addressLineNode");
    }

    @JsMethod
    public SuburbNode getSuburbNode() {
        return (SuburbNode)getChildByName("suburbNode");
    }

    @JsMethod
    public PostcodeNode getPostcodeNode() {
        return (PostcodeNode)getChildByName("postcodeNode");
    }

    @JsMethod
    public CountryNode getCountryNode() {
        return (CountryNode)getChildByName("countryNode");
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("addressLineNode");
        children.add(childFactory.createAddressLineNode());
        setChildNodeIdentity("suburbNode");
        children.add(childFactory.createSuburbNode());
        setChildNodeIdentity("postcodeNode");
        children.add(childFactory.createPostcodeNode());
        setChildNodeIdentity("countryNode");
        children.add(childFactory.createCountryNode());
        setChildNodeIdentity(null);
        return children;
    }

}
