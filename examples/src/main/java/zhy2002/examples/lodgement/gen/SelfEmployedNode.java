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

public  class SelfEmployedNode extends EmployedNode
{
    private BusinessTypeNode businessTypeNode;
    private ProfitThisYearNode profitThisYearNode;
    private ProfitPreviousYearNode profitPreviousYearNode;

    protected SelfEmployedNode(EmploymentNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public BusinessTypeNode getBusinessTypeNode() {
        return businessTypeNode;
    }

    @JsMethod
    public ProfitThisYearNode getProfitThisYearNode() {
        return profitThisYearNode;
    }

    @JsMethod
    public ProfitPreviousYearNode getProfitPreviousYearNode() {
        return profitPreviousYearNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        UiNodeContext<?> context = getContext();
        businessTypeNode = context.createChildNode(BusinessTypeNode.class, this, "businessTypeNode");
        children.add(businessTypeNode);
        profitThisYearNode = context.createChildNode(ProfitThisYearNode.class, this, "profitThisYearNode");
        children.add(profitThisYearNode);
        profitPreviousYearNode = context.createChildNode(ProfitPreviousYearNode.class, this, "profitPreviousYearNode");
        children.add(profitPreviousYearNode);
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
