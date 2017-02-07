package zhy2002.examples.register.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.register.data.*;

public  class PropertyDetailsNode extends ObjectUiNode<RegisterNode>
{
    private PropertyAddressNode propertyAddressNode;
    private PropertyStateNode propertyStateNode;

    public PropertyDetailsNode(RegisterNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public String getTooltip() {
        return getStateValue(RegisterNodeConstants.TOOLTIP);
    }

    @JsMethod
    public void setTooltip(String value) {
        setStateValue(RegisterNodeConstants.TOOLTIP, String.class, value);
    }

    @JsMethod
    public PropertyAddressNode getPropertyAddressNode() {
        return propertyAddressNode;
    }

    @JsMethod
    public PropertyStateNode getPropertyStateNode() {
        return propertyStateNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        UiNodeContext<?> context = getContext();
        propertyAddressNode = context.createChildNode(PropertyAddressNode.class, this, "propertyAddressNode");
        children.add(propertyAddressNode);
        propertyStateNode = context.createChildNode(PropertyStateNode.class, this, "propertyStateNode");
        children.add(propertyStateNode);
        return children;
    }



}
