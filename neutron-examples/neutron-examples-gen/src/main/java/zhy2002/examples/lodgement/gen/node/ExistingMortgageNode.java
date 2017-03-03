package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class ExistingMortgageNode extends ObjectUiNode<ExistingMortgageListNode> {

    private MortgageLenderInstitutionNode mortgageLenderInstitutionNode;
    private MortgqageUnpaidBalanceNode mortgqageUnpaidBalanceNode;
    private MortgageLimitAmountNode mortgageLimitAmountNode;
    private MortgageMonthlyRepaymentNode mortgageMonthlyRepaymentNode;
    private MortgageBorrowerRateNode mortgageBorrowerRateNode;
    private MortgageLoanTypeNode mortgageLoanTypeNode;
    private MortgageLoanTermExpiryDateNode mortgageLoanTermExpiryDateNode;
    private MortgageInterestOnlyExpiryDateNode mortgageInterestOnlyExpiryDateNode;
    private MortgageClearingFlagNode mortgageClearingFlagNode;
    private MortgageBreakFeeNode mortgageBreakFeeNode;
    private MortgageChargePositionNode mortgageChargePositionNode;
    private MortgageTermRemainingPeriodNode mortgageTermRemainingPeriodNode;
    private MortgageInterestOnlyRemainingPeriodNode mortgageInterestOnlyRemainingPeriodNode;

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

    @Override
    protected ExistingMortgageNodeRuleProvider getRuleProvider() {
        return component.getExistingMortgageNodeRuleProvider();
    }

    public ExistingMortgageNode(@NotNull ExistingMortgageListNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public MortgageLenderInstitutionNode getMortgageLenderInstitutionNode() {
        return mortgageLenderInstitutionNode;
    }

    @JsMethod
    public MortgqageUnpaidBalanceNode getMortgqageUnpaidBalanceNode() {
        return mortgqageUnpaidBalanceNode;
    }

    @JsMethod
    public MortgageLimitAmountNode getMortgageLimitAmountNode() {
        return mortgageLimitAmountNode;
    }

    @JsMethod
    public MortgageMonthlyRepaymentNode getMortgageMonthlyRepaymentNode() {
        return mortgageMonthlyRepaymentNode;
    }

    @JsMethod
    public MortgageBorrowerRateNode getMortgageBorrowerRateNode() {
        return mortgageBorrowerRateNode;
    }

    @JsMethod
    public MortgageLoanTypeNode getMortgageLoanTypeNode() {
        return mortgageLoanTypeNode;
    }

    @JsMethod
    public MortgageLoanTermExpiryDateNode getMortgageLoanTermExpiryDateNode() {
        return mortgageLoanTermExpiryDateNode;
    }

    @JsMethod
    public MortgageInterestOnlyExpiryDateNode getMortgageInterestOnlyExpiryDateNode() {
        return mortgageInterestOnlyExpiryDateNode;
    }

    @JsMethod
    public MortgageClearingFlagNode getMortgageClearingFlagNode() {
        return mortgageClearingFlagNode;
    }

    @JsMethod
    public MortgageBreakFeeNode getMortgageBreakFeeNode() {
        return mortgageBreakFeeNode;
    }

    @JsMethod
    public MortgageChargePositionNode getMortgageChargePositionNode() {
        return mortgageChargePositionNode;
    }

    @JsMethod
    public MortgageTermRemainingPeriodNode getMortgageTermRemainingPeriodNode() {
        return mortgageTermRemainingPeriodNode;
    }

    @JsMethod
    public MortgageInterestOnlyRemainingPeriodNode getMortgageInterestOnlyRemainingPeriodNode() {
        return mortgageInterestOnlyRemainingPeriodNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        mortgageLenderInstitutionNode = childFactory.createMortgageLenderInstitutionNode();
        children.add(mortgageLenderInstitutionNode);
        mortgqageUnpaidBalanceNode = childFactory.createMortgqageUnpaidBalanceNode();
        children.add(mortgqageUnpaidBalanceNode);
        mortgageLimitAmountNode = childFactory.createMortgageLimitAmountNode();
        children.add(mortgageLimitAmountNode);
        mortgageMonthlyRepaymentNode = childFactory.createMortgageMonthlyRepaymentNode();
        children.add(mortgageMonthlyRepaymentNode);
        mortgageBorrowerRateNode = childFactory.createMortgageBorrowerRateNode();
        children.add(mortgageBorrowerRateNode);
        mortgageLoanTypeNode = childFactory.createMortgageLoanTypeNode();
        children.add(mortgageLoanTypeNode);
        mortgageLoanTermExpiryDateNode = childFactory.createMortgageLoanTermExpiryDateNode();
        children.add(mortgageLoanTermExpiryDateNode);
        mortgageInterestOnlyExpiryDateNode = childFactory.createMortgageInterestOnlyExpiryDateNode();
        children.add(mortgageInterestOnlyExpiryDateNode);
        mortgageClearingFlagNode = childFactory.createMortgageClearingFlagNode();
        children.add(mortgageClearingFlagNode);
        mortgageBreakFeeNode = childFactory.createMortgageBreakFeeNode();
        children.add(mortgageBreakFeeNode);
        mortgageChargePositionNode = childFactory.createMortgageChargePositionNode();
        children.add(mortgageChargePositionNode);
        mortgageTermRemainingPeriodNode = childFactory.createMortgageTermRemainingPeriodNode();
        children.add(mortgageTermRemainingPeriodNode);
        mortgageInterestOnlyRemainingPeriodNode = childFactory.createMortgageInterestOnlyRemainingPeriodNode();
        children.add(mortgageInterestOnlyRemainingPeriodNode);
        return children;
    }

}
