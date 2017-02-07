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
    private RetiredOnBenefitFlagNode retiredOnBenefitFlagNode;
    private RetiredSinceNode retiredSinceNode;

    public RetiredEmploymentNode(EmploymentNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public RetiredOnBenefitFlagNode getRetiredOnBenefitFlagNode() {
        return retiredOnBenefitFlagNode;
    }

    @JsMethod
    public RetiredSinceNode getRetiredSinceNode() {
        return retiredSinceNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        UiNodeContext<?> context = getContext();
        retiredOnBenefitFlagNode = context.createChildNode(RetiredOnBenefitFlagNode.class, this, "retiredOnBenefitFlagNode");
        children.add(retiredOnBenefitFlagNode);
        retiredSinceNode = context.createChildNode(RetiredSinceNode.class, this, "retiredSinceNode");
        children.add(retiredSinceNode);
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
