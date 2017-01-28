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

public  class OtherAssetNode extends ObjectUiNode<OtherAssetListNode>
{
    private OtherAssetTypeNode otherAssetTypeNode;
    private OtherAssetDescriptionNode otherAssetDescriptionNode;
    private OtherAssetMarketValueNode otherAssetMarketValueNode;

    protected OtherAssetNode(OtherAssetListNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public OtherAssetTypeNode getOtherAssetTypeNode() {
        return otherAssetTypeNode;
    }

    @JsMethod
    public OtherAssetDescriptionNode getOtherAssetDescriptionNode() {
        return otherAssetDescriptionNode;
    }

    @JsMethod
    public OtherAssetMarketValueNode getOtherAssetMarketValueNode() {
        return otherAssetMarketValueNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        UiNodeContext<?> context = getContext();
        otherAssetTypeNode = context.createChildNode(OtherAssetTypeNode.class, this, "otherAssetTypeNode");
        children.add(otherAssetTypeNode);
        otherAssetDescriptionNode = context.createChildNode(OtherAssetDescriptionNode.class, this, "otherAssetDescriptionNode");
        children.add(otherAssetDescriptionNode);
        otherAssetMarketValueNode = context.createChildNode(OtherAssetMarketValueNode.class, this, "otherAssetMarketValueNode");
        children.add(otherAssetMarketValueNode);
        return children;
    }



}
