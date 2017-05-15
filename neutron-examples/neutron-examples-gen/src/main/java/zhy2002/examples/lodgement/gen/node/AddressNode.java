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
        children.add(childFactory.createAddressLineNode());
        children.add(childFactory.createSuburbNode());
        children.add(childFactory.createPostcodeNode());
        children.add(childFactory.createCountryNode());
        return children;
    }

}
