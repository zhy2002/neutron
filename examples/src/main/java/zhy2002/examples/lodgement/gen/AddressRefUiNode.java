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

public  class AddressRefUiNode extends ObjectUiNode<AddressListNode>
{

    public AddressRefUiNode(AddressListNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public AddressNode getRef() {
        return getStateValue(ApplicationNodeConstants.REF);
    }

    @JsMethod
    public void setRef(AddressNode value) {
        setStateValue(ApplicationNodeConstants.REF, AddressNode.class, value);
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        UiNodeContext<?> context = getContext();
        return children;
    }



}
