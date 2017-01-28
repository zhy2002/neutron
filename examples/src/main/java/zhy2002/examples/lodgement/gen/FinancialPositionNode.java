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

public  class FinancialPositionNode extends ObjectUiNode<ApplicationNode>
{
    private AssetsNode assetsNode;
    private LiabilitiesNode liabilitiesNode;
    private ExpensesNode expensesNode;

    protected FinancialPositionNode(ApplicationNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public AssetsNode getAssetsNode() {
        return assetsNode;
    }

    @JsMethod
    public LiabilitiesNode getLiabilitiesNode() {
        return liabilitiesNode;
    }

    @JsMethod
    public ExpensesNode getExpensesNode() {
        return expensesNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        UiNodeContext<?> context = getContext();
        assetsNode = context.createChildNode(AssetsNode.class, this, "assetsNode");
        children.add(assetsNode);
        liabilitiesNode = context.createChildNode(LiabilitiesNode.class, this, "liabilitiesNode");
        children.add(liabilitiesNode);
        expensesNode = context.createChildNode(ExpensesNode.class, this, "expensesNode");
        children.add(expensesNode);
        return children;
    }



}
