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


    public FinancialPositionNode(@NotNull ApplicationNode parent, String name) {
        super(parent, name);
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
        children.add(childFactory.createAssetsNode());
        children.add(childFactory.createLiabilitiesNode());
        children.add(childFactory.createExpenseListNode());
        children.add(childFactory.createTotalAssetNode());
        children.add(childFactory.createTotalLiabilityNode());
        children.add(childFactory.createTotalExpenseNode());
        return children;
    }

}
