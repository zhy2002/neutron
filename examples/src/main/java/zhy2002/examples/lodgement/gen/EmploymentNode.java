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
    private EmployedNode payeEmployedNode;
    private EmployedNode selfEmployedNode;
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
    public EmployedNode getPayeEmployedNode() {
        return payeEmployedNode;
    }

    @JsMethod
    public EmployedNode getSelfEmployedNode() {
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
        UiNodeContext<?> context = getContext();

        employmentTypeNode = context.createChildNode(EmploymentTypeNode.class, this, "employmentTypeNode");
        payeEmployedNode = context.createChildNode(EmployedNode.class, this, "payeEmployedNode");
        selfEmployedNode = context.createChildNode(EmployedNode.class, this, "selfEmployedNode");
        unemployedNode = context.createChildNode(UnemployedNode.class, this, "unemployedNode");
        retiredEmploymentNode = context.createChildNode(RetiredEmploymentNode.class, this, "retiredEmploymentNode");

        return Arrays.asList(
            employmentTypeNode,
            payeEmployedNode,
            selfEmployedNode,
            unemployedNode,
            retiredEmploymentNode
        );
    }



}
