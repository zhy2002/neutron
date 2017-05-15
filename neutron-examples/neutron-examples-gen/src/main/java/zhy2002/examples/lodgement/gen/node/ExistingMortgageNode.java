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

    @Inject
    void receiveNodeProvider(ExistingMortgageNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return ExistingMortgageNode.class;
    }

    private ExistingMortgageNodeComponent component;

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


    public ExistingMortgageNode(@NotNull ExistingMortgageListNode parent, String name) {
        super(parent, name);
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
        children.add(childFactory.createMortgageLenderInstitutionNode());
        children.add(childFactory.createMortgqageUnpaidBalanceNode());
        children.add(childFactory.createMortgageLimitAmountNode());
        children.add(childFactory.createMortgageMonthlyRepaymentNode());
        children.add(childFactory.createMortgageBorrowerRateNode());
        children.add(childFactory.createMortgageLoanTypeNode());
        children.add(childFactory.createMortgageLoanTermExpiryDateNode());
        children.add(childFactory.createMortgageInterestOnlyExpiryDateNode());
        children.add(childFactory.createMortgageClearingFlagNode());
        children.add(childFactory.createMortgageBreakFeeNode());
        children.add(childFactory.createMortgageChargePositionNode());
        children.add(childFactory.createMortgageTermRemainingPeriodNode());
        children.add(childFactory.createMortgageInterestOnlyRemainingPeriodNode());
        return children;
    }

}
