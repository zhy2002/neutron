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

public class AddressRefUiNode extends ObjectUiNode<AddressListNode>
{
    @Override
    public final Class<?> getConcreteClass() {
        return AddressRefUiNode.class;
    }

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

}
