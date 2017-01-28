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

public  class AccessNode extends ObjectUiNode<RealEstateNode>
{
    private AccessContactTypeNode accessContactTypeNode;
    private AccessContactTitleNode accessContactTitleNode;
    private AccessContactFirstNameNode accessContactFirstNameNode;
    private AccessContactLastNameNode accessContactLastNameNode;
    private AccessCompanyNameNode accessCompanyNameNode;
    private AccessTelephoneNode accessTelephoneNode;
    private AccessOtherDescriptionNode accessOtherDescriptionNode;

    protected AccessNode(RealEstateNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public AccessContactTypeNode getAccessContactTypeNode() {
        return accessContactTypeNode;
    }

    @JsMethod
    public AccessContactTitleNode getAccessContactTitleNode() {
        return accessContactTitleNode;
    }

    @JsMethod
    public AccessContactFirstNameNode getAccessContactFirstNameNode() {
        return accessContactFirstNameNode;
    }

    @JsMethod
    public AccessContactLastNameNode getAccessContactLastNameNode() {
        return accessContactLastNameNode;
    }

    @JsMethod
    public AccessCompanyNameNode getAccessCompanyNameNode() {
        return accessCompanyNameNode;
    }

    @JsMethod
    public AccessTelephoneNode getAccessTelephoneNode() {
        return accessTelephoneNode;
    }

    @JsMethod
    public AccessOtherDescriptionNode getAccessOtherDescriptionNode() {
        return accessOtherDescriptionNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        UiNodeContext<?> context = getContext();
        accessContactTypeNode = context.createChildNode(AccessContactTypeNode.class, this, "accessContactTypeNode");
        children.add(accessContactTypeNode);
        accessContactTitleNode = context.createChildNode(AccessContactTitleNode.class, this, "accessContactTitleNode");
        children.add(accessContactTitleNode);
        accessContactFirstNameNode = context.createChildNode(AccessContactFirstNameNode.class, this, "accessContactFirstNameNode");
        children.add(accessContactFirstNameNode);
        accessContactLastNameNode = context.createChildNode(AccessContactLastNameNode.class, this, "accessContactLastNameNode");
        children.add(accessContactLastNameNode);
        accessCompanyNameNode = context.createChildNode(AccessCompanyNameNode.class, this, "accessCompanyNameNode");
        children.add(accessCompanyNameNode);
        accessTelephoneNode = context.createChildNode(AccessTelephoneNode.class, this, "accessTelephoneNode");
        children.add(accessTelephoneNode);
        accessOtherDescriptionNode = context.createChildNode(AccessOtherDescriptionNode.class, this, "accessOtherDescriptionNode");
        children.add(accessOtherDescriptionNode);
        return children;
    }



}
