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

public  class RetiredEmploymentNode extends ObjectUiNode<EmploymentNode<?>>
{
    private RetiredSinceNode retiredSinceNode;

    protected RetiredEmploymentNode(EmploymentNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public RetiredSinceNode getRetiredSinceNode() {
        return retiredSinceNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        UiNodeContext<?> context = getContext();

        retiredSinceNode = context.createChildNode(RetiredSinceNode.class, this, "retiredSinceNode");

        return Arrays.asList(
            retiredSinceNode
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
