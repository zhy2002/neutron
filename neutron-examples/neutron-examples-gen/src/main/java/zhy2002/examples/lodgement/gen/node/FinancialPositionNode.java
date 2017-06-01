package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.FinancialPositionNodeComponent;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class FinancialPositionNode extends ObjectUiNode<ApplicationNode> {

    @Inject
    public FinancialPositionNode(@Owner ApplicationNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return FinancialPositionNode.class;
    }

    protected final FinancialPositionNodeComponent getComponent() {
        return component;
    }


    private FinancialPositionNodeComponent component;

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

    //region children getters

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

    //endregion
    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("assetsNode");
        children.add(getComponent().createAssetsNode());
        setChildNodeIdentity("liabilitiesNode");
        children.add(getComponent().createLiabilitiesNode());
        setChildNodeIdentity("expenseListNode");
        children.add(getComponent().createExpenseListNode());
        setChildNodeIdentity("totalAssetNode");
        children.add(getComponent().createTotalAssetNode());
        setChildNodeIdentity("totalLiabilityNode");
        children.add(getComponent().createTotalLiabilityNode());
        setChildNodeIdentity("totalExpenseNode");
        children.add(getComponent().createTotalExpenseNode());
        setChildNodeIdentity(null);
        return children;
    }

}
