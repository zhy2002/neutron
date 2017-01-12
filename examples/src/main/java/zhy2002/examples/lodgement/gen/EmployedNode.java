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

public  class EmployedNode extends ObjectUiNode<EmploymentNode<?>>
{
    private EmploymentStatusNode employmentStatusNode;
    private OccupationNode occupationNode;

    protected EmployedNode(EmploymentNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public EmploymentStatusNode getEmploymentStatusNode() {
        return employmentStatusNode;
    }

    @JsMethod
    public OccupationNode getOccupationNode() {
        return occupationNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        UiNodeContext<?> context = getContext();

        employmentStatusNode = context.createChildNode(EmploymentStatusNode.class, this, "employmentStatusNode");
        occupationNode = context.createChildNode(OccupationNode.class, this, "occupationNode");

        return Arrays.asList(
            employmentStatusNode,
            occupationNode
        );
    }




    @Override
    public Boolean getRequired() {
        boolean parentHasValue = getParent().hasValue();
        if(parentHasValue)
            return super.getRequired();

        return Boolean.FALSE;
    }

}
