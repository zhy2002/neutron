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

public  class UnemployedNode extends ObjectUiNode<EmploymentNode<?>>
{
    private UnemployedOnBenefitFlagNode unemployedOnBenefitFlagNode;
    private StudentFlagNode studentFlagNode;
    private StudentTypeNode studentTypeNode;
    private HouseDutiesFlagNode houseDutiesFlagNode;
    private UnemployedSinceNode unemployedSinceNode;

    public UnemployedNode(EmploymentNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public UnemployedOnBenefitFlagNode getUnemployedOnBenefitFlagNode() {
        return unemployedOnBenefitFlagNode;
    }

    @JsMethod
    public StudentFlagNode getStudentFlagNode() {
        return studentFlagNode;
    }

    @JsMethod
    public StudentTypeNode getStudentTypeNode() {
        return studentTypeNode;
    }

    @JsMethod
    public HouseDutiesFlagNode getHouseDutiesFlagNode() {
        return houseDutiesFlagNode;
    }

    @JsMethod
    public UnemployedSinceNode getUnemployedSinceNode() {
        return unemployedSinceNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        UiNodeContext<?> context = getContext();
        unemployedOnBenefitFlagNode = context.createChildNode(UnemployedOnBenefitFlagNode.class, this, "unemployedOnBenefitFlagNode");
        children.add(unemployedOnBenefitFlagNode);
        studentFlagNode = context.createChildNode(StudentFlagNode.class, this, "studentFlagNode");
        children.add(studentFlagNode);
        studentTypeNode = context.createChildNode(StudentTypeNode.class, this, "studentTypeNode");
        children.add(studentTypeNode);
        houseDutiesFlagNode = context.createChildNode(HouseDutiesFlagNode.class, this, "houseDutiesFlagNode");
        children.add(houseDutiesFlagNode);
        unemployedSinceNode = context.createChildNode(UnemployedSinceNode.class, this, "unemployedSinceNode");
        children.add(unemployedSinceNode);
        return children;
    }




    @Override
    public Boolean getRequired() {
        boolean parentHasValue = getParent().hasValue();
        if(parentHasValue)
            return super.getRequired();

        return Boolean.FALSE;
    }

}
