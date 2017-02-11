package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.lodgement.data.*;

public class FinancialPositionNode extends ObjectUiNode<ApplicationNode>
{
    private AssetsNode assetsNode;
    private LiabilitiesNode liabilitiesNode;
    private ExpensesNode expensesNode;

    private FinancialPositionNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(FinancialPositionNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    public FinancialPositionNode(ApplicationNode parent, String name) {
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
        assetsNode = childFactory.createAssetsNode();
        children.add(assetsNode);
        liabilitiesNode = childFactory.createLiabilitiesNode();
        children.add(liabilitiesNode);
        expensesNode = childFactory.createExpensesNode();
        children.add(expensesNode);
        return children;
    }

}
