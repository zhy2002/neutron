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

public  class RealEstateNode extends ObjectUiNode<RealEstateListNode>
{
    private UsageNode usageNode;
    private PropertyNode propertyNode;
    private AccessNode accessNode;

    public RealEstateNode(RealEstateListNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public UsageNode getUsageNode() {
        return usageNode;
    }

    @JsMethod
    public PropertyNode getPropertyNode() {
        return propertyNode;
    }

    @JsMethod
    public AccessNode getAccessNode() {
        return accessNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        UiNodeContext<?> context = getContext();
        usageNode = context.createChildNode(UsageNode.class, this, "usageNode");
        children.add(usageNode);
        propertyNode = context.createChildNode(PropertyNode.class, this, "propertyNode");
        children.add(propertyNode);
        accessNode = context.createChildNode(AccessNode.class, this, "accessNode");
        children.add(accessNode);
        return children;
    }



}
