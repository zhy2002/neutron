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

public abstract class EmploymentNode<P extends ParentUiNode<?>> extends ObjectUiNode<P>
{
    private EmploymentTypeNode employmentTypeNode;
    private PayeEmployedNode payeEmployedNode;
    private SelfEmployedNode selfEmployedNode;
    private UnemployedNode unemployedNode;
    private RetiredEmploymentNode retiredEmploymentNode;

    protected EmploymentNode(P parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public EmploymentTypeNode getEmploymentTypeNode() {
        return employmentTypeNode;
    }

    @JsMethod
    public PayeEmployedNode getPayeEmployedNode() {
        return payeEmployedNode;
    }

    @JsMethod
    public SelfEmployedNode getSelfEmployedNode() {
        return selfEmployedNode;
    }

    @JsMethod
    public UnemployedNode getUnemployedNode() {
        return unemployedNode;
    }

    @JsMethod
    public RetiredEmploymentNode getRetiredEmploymentNode() {
        return retiredEmploymentNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        UiNodeContext<?> context = getContext();
        employmentTypeNode = context.createChildNode(EmploymentTypeNode.class, this, "employmentTypeNode");
        children.add(employmentTypeNode);
        payeEmployedNode = context.createChildNode(PayeEmployedNode.class, this, "payeEmployedNode");
        children.add(payeEmployedNode);
        selfEmployedNode = context.createChildNode(SelfEmployedNode.class, this, "selfEmployedNode");
        children.add(selfEmployedNode);
        unemployedNode = context.createChildNode(UnemployedNode.class, this, "unemployedNode");
        children.add(unemployedNode);
        retiredEmploymentNode = context.createChildNode(RetiredEmploymentNode.class, this, "retiredEmploymentNode");
        children.add(retiredEmploymentNode);
        return children;
    }



}
