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

    private FinancialPositionNodeRuleProvider getRuleProvider() {
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
