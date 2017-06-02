package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.AddressNodeComponent;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;


public abstract class AddressNode<P extends ParentUiNode<?>> extends ObjectUiNode<P> {

    protected AddressNode(P parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    protected abstract AddressNodeComponent getComponent();


    //region children getters

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

    //endregion
    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("addressLineNode");
        children.add(getComponent().createAddressLineNode());
        setChildNodeIdentity("suburbNode");
        children.add(getComponent().createSuburbNode());
        setChildNodeIdentity("postcodeNode");
        children.add(getComponent().createPostcodeNode());
        setChildNodeIdentity("countryNode");
        children.add(getComponent().createCountryNode());
        setChildNodeIdentity(null);
        return children;
    }

}
