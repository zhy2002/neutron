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
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;

public class FinancialPositionNode extends ObjectUiNode<ApplicationNode>
{
    private AssetsNode assetsNode;
    private LiabilitiesNode liabilitiesNode;
    private ExpenseListNode expenseListNode;
    private TotalAssetNode totalAssetNode;
    private TotalLiabilityNode totalLiabilityNode;
    private TotalExpenseNode totalExpenseNode;

    private FinancialPositionNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(FinancialPositionNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return FinancialPositionNode.class;
    }

    private FinancialPositionNodeComponent component;

    @Inject
    void createComponent(FinancialPositionNodeComponent.Builder builder) {
        this.component = builder.setFinancialPositionNodeModule(new FinancialPositionNodeModule(this)).build();
    }

    @Override
    protected FinancialPositionNodeRuleProvider getRuleProvider() {
        return component.getFinancialPositionNodeRuleProvider();
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
    public ExpenseListNode getExpenseListNode() {
        return expenseListNode;
    }

    @JsMethod
    public TotalAssetNode getTotalAssetNode() {
        return totalAssetNode;
    }

    @JsMethod
    public TotalLiabilityNode getTotalLiabilityNode() {
        return totalLiabilityNode;
    }

    @JsMethod
    public TotalExpenseNode getTotalExpenseNode() {
        return totalExpenseNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        assetsNode = childFactory.createAssetsNode();
        children.add(assetsNode);
        liabilitiesNode = childFactory.createLiabilitiesNode();
        children.add(liabilitiesNode);
        expenseListNode = childFactory.createExpenseListNode();
        children.add(expenseListNode);
        totalAssetNode = childFactory.createTotalAssetNode();
        children.add(totalAssetNode);
        totalLiabilityNode = childFactory.createTotalLiabilityNode();
        children.add(totalLiabilityNode);
        totalExpenseNode = childFactory.createTotalExpenseNode();
        children.add(totalExpenseNode);
        return children;
    }

}
