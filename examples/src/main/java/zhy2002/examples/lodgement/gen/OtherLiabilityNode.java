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

public  class OtherLiabilityNode extends ObjectUiNode<OtherLiabilityListNode>
{
    private OtherLiabilityTypeNode otherLiabilityTypeNode;
    private OtherLiabilityDescriptionNode otherLiabilityDescriptionNode;
    private OtherLiabilityMarketValueNode otherLiabilityMarketValueNode;

    public OtherLiabilityNode(OtherLiabilityListNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public OtherLiabilityTypeNode getOtherLiabilityTypeNode() {
        return otherLiabilityTypeNode;
    }

    @JsMethod
    public OtherLiabilityDescriptionNode getOtherLiabilityDescriptionNode() {
        return otherLiabilityDescriptionNode;
    }

    @JsMethod
    public OtherLiabilityMarketValueNode getOtherLiabilityMarketValueNode() {
        return otherLiabilityMarketValueNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        UiNodeContext<?> context = getContext();
        otherLiabilityTypeNode = context.createChildNode(OtherLiabilityTypeNode.class, this, "otherLiabilityTypeNode");
        children.add(otherLiabilityTypeNode);
        otherLiabilityDescriptionNode = context.createChildNode(OtherLiabilityDescriptionNode.class, this, "otherLiabilityDescriptionNode");
        children.add(otherLiabilityDescriptionNode);
        otherLiabilityMarketValueNode = context.createChildNode(OtherLiabilityMarketValueNode.class, this, "otherLiabilityMarketValueNode");
        children.add(otherLiabilityMarketValueNode);
        return children;
    }



}
