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
    private UnemployedSinceNode unemployedSinceNode;

    protected UnemployedNode(EmploymentNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public UnemployedSinceNode getUnemployedSinceNode() {
        return unemployedSinceNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        UiNodeContext<?> context = getContext();

        unemployedSinceNode = context.createChildNode(UnemployedSinceNode.class, this, "unemployedSinceNode");

        return Arrays.asList(
            unemployedSinceNode
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
