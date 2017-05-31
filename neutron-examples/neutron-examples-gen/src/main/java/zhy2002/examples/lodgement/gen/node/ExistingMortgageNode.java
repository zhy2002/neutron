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

public class ExistingMortgageNode extends ObjectUiNode<ExistingMortgageListNode> {
    private ExistingMortgageNodeChildFactory childFactory;
    private ExistingMortgageNodeComponent component;

    public ExistingMortgageNode(@NotNull ExistingMortgageListNode parent, String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return ExistingMortgageNode.class;
    }

    @Inject
    void receiveNodeProvider(ExistingMortgageNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Inject
    void createComponent(ExistingMortgageNodeComponent.Builder builder) {
        this.component = builder.setExistingMortgageNodeModule(new ExistingMortgageNodeModule(this)).build();
    }

    private RuleProvider<ExistingMortgageNode> getRuleProvider() {
        return component.getExistingMortgageNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }

    @JsMethod
    public MortgageLenderInstitutionNode getMortgageLenderInstitutionNode() {
        return (MortgageLenderInstitutionNode)getChildByName("mortgageLenderInstitutionNode");
    }

    @JsMethod
    public MortgqageUnpaidBalanceNode getMortgqageUnpaidBalanceNode() {
        return (MortgqageUnpaidBalanceNode)getChildByName("mortgqageUnpaidBalanceNode");
    }

    @JsMethod
    public MortgageLimitAmountNode getMortgageLimitAmountNode() {
        return (MortgageLimitAmountNode)getChildByName("mortgageLimitAmountNode");
    }

    @JsMethod
    public MortgageMonthlyRepaymentNode getMortgageMonthlyRepaymentNode() {
        return (MortgageMonthlyRepaymentNode)getChildByName("mortgageMonthlyRepaymentNode");
    }

    @JsMethod
    public MortgageBorrowerRateNode getMortgageBorrowerRateNode() {
        return (MortgageBorrowerRateNode)getChildByName("mortgageBorrowerRateNode");
    }

    @JsMethod
    public MortgageLoanTypeNode getMortgageLoanTypeNode() {
        return (MortgageLoanTypeNode)getChildByName("mortgageLoanTypeNode");
    }

    @JsMethod
    public MortgageLoanTermExpiryDateNode getMortgageLoanTermExpiryDateNode() {
        return (MortgageLoanTermExpiryDateNode)getChildByName("mortgageLoanTermExpiryDateNode");
    }

    @JsMethod
    public MortgageInterestOnlyExpiryDateNode getMortgageInterestOnlyExpiryDateNode() {
        return (MortgageInterestOnlyExpiryDateNode)getChildByName("mortgageInterestOnlyExpiryDateNode");
    }

    @JsMethod
    public MortgageClearingFlagNode getMortgageClearingFlagNode() {
        return (MortgageClearingFlagNode)getChildByName("mortgageClearingFlagNode");
    }

    @JsMethod
    public MortgageBreakFeeNode getMortgageBreakFeeNode() {
        return (MortgageBreakFeeNode)getChildByName("mortgageBreakFeeNode");
    }

    @JsMethod
    public MortgageChargePositionNode getMortgageChargePositionNode() {
        return (MortgageChargePositionNode)getChildByName("mortgageChargePositionNode");
    }

    @JsMethod
    public MortgageTermRemainingPeriodNode getMortgageTermRemainingPeriodNode() {
        return (MortgageTermRemainingPeriodNode)getChildByName("mortgageTermRemainingPeriodNode");
    }

    @JsMethod
    public MortgageInterestOnlyRemainingPeriodNode getMortgageInterestOnlyRemainingPeriodNode() {
        return (MortgageInterestOnlyRemainingPeriodNode)getChildByName("mortgageInterestOnlyRemainingPeriodNode");
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("mortgageLenderInstitutionNode");
        children.add(childFactory.createMortgageLenderInstitutionNode());
        setChildNodeIdentity("mortgqageUnpaidBalanceNode");
        children.add(childFactory.createMortgqageUnpaidBalanceNode());
        setChildNodeIdentity("mortgageLimitAmountNode");
        children.add(childFactory.createMortgageLimitAmountNode());
        setChildNodeIdentity("mortgageMonthlyRepaymentNode");
        children.add(childFactory.createMortgageMonthlyRepaymentNode());
        setChildNodeIdentity("mortgageBorrowerRateNode");
        children.add(childFactory.createMortgageBorrowerRateNode());
        setChildNodeIdentity("mortgageLoanTypeNode");
        children.add(childFactory.createMortgageLoanTypeNode());
        setChildNodeIdentity("mortgageLoanTermExpiryDateNode");
        children.add(childFactory.createMortgageLoanTermExpiryDateNode());
        setChildNodeIdentity("mortgageInterestOnlyExpiryDateNode");
        children.add(childFactory.createMortgageInterestOnlyExpiryDateNode());
        setChildNodeIdentity("mortgageClearingFlagNode");
        children.add(childFactory.createMortgageClearingFlagNode());
        setChildNodeIdentity("mortgageBreakFeeNode");
        children.add(childFactory.createMortgageBreakFeeNode());
        setChildNodeIdentity("mortgageChargePositionNode");
        children.add(childFactory.createMortgageChargePositionNode());
        setChildNodeIdentity("mortgageTermRemainingPeriodNode");
        children.add(childFactory.createMortgageTermRemainingPeriodNode());
        setChildNodeIdentity("mortgageInterestOnlyRemainingPeriodNode");
        children.add(childFactory.createMortgageInterestOnlyRemainingPeriodNode());
        setChildNodeIdentity(null);
        return children;
    }

}
