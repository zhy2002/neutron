package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class FinancialPositionNode extends ObjectUiNode<ApplicationNode> {
    private FinancialPositionNodeChildFactory childFactory;
    private FinancialPositionNodeComponent component;

    public FinancialPositionNode(@NotNull ApplicationNode parent, String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return FinancialPositionNode.class;
    }

    @Inject
    void receiveNodeProvider(FinancialPositionNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Inject
    void createComponent(FinancialPositionNodeComponent.Builder builder) {
        this.component = builder.setFinancialPositionNodeModule(new FinancialPositionNodeModule(this)).build();
    }

    private RuleProvider<FinancialPositionNode> getRuleProvider() {
        return component.getFinancialPositionNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
        getInstanceRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
        getInstanceRuleProvider().createRules(createdRules);
    }

    private RuleProvider<FinancialPositionNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    @JsMethod
    public AssetsNode getAssetsNode() {
        return (AssetsNode)getChildByName("assetsNode");
    }

    @JsMethod
    public LiabilitiesNode getLiabilitiesNode() {
        return (LiabilitiesNode)getChildByName("liabilitiesNode");
    }

    @JsMethod
    public ExpenseListNode getExpenseListNode() {
        return (ExpenseListNode)getChildByName("expenseListNode");
    }

    @JsMethod
    public TotalAssetNode getTotalAssetNode() {
        return (TotalAssetNode)getChildByName("totalAssetNode");
    }

    @JsMethod
    public TotalLiabilityNode getTotalLiabilityNode() {
        return (TotalLiabilityNode)getChildByName("totalLiabilityNode");
    }

    @JsMethod
    public TotalExpenseNode getTotalExpenseNode() {
        return (TotalExpenseNode)getChildByName("totalExpenseNode");
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("assetsNode");
        children.add(childFactory.createAssetsNode());
        setChildNodeIdentity("liabilitiesNode");
        children.add(childFactory.createLiabilitiesNode());
        setChildNodeIdentity("expenseListNode");
        children.add(childFactory.createExpenseListNode());
        setChildNodeIdentity("totalAssetNode");
        children.add(childFactory.createTotalAssetNode());
        setChildNodeIdentity("totalLiabilityNode");
        children.add(childFactory.createTotalLiabilityNode());
        setChildNodeIdentity("totalExpenseNode");
        children.add(childFactory.createTotalExpenseNode());
        setChildNodeIdentity(null);
        return children;
    }

}
