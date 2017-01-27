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

public  class PayeEmployedNode extends EmployedNode
{
    private GrossYearlySalaryNode grossYearlySalaryNode;

    protected PayeEmployedNode(EmploymentNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public GrossYearlySalaryNode getGrossYearlySalaryNode() {
        return grossYearlySalaryNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        UiNodeContext<?> context = getContext();
        grossYearlySalaryNode = context.createChildNode(GrossYearlySalaryNode.class, this, "grossYearlySalaryNode");
        children.add(grossYearlySalaryNode);
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
