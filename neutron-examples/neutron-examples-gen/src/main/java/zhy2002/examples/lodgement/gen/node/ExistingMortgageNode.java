package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ExistingMortgageNodeComponent;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class ExistingMortgageNode extends ObjectUiNode<ExistingMortgageListNode> {

    @Inject
    public ExistingMortgageNode(@Owner ExistingMortgageListNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ExistingMortgageNode.class;
    }

    protected final ExistingMortgageNodeComponent getComponent() {
        return component;
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

    //region children getters

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

    //endregion
    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("mortgageLenderInstitutionNode");
        children.add(getComponent().createMortgageLenderInstitutionNode());
        setChildNodeIdentity("mortgqageUnpaidBalanceNode");
        children.add(getComponent().createMortgqageUnpaidBalanceNode());
        setChildNodeIdentity("mortgageLimitAmountNode");
        children.add(getComponent().createMortgageLimitAmountNode());
        setChildNodeIdentity("mortgageMonthlyRepaymentNode");
        children.add(getComponent().createMortgageMonthlyRepaymentNode());
        setChildNodeIdentity("mortgageBorrowerRateNode");
        children.add(getComponent().createMortgageBorrowerRateNode());
        setChildNodeIdentity("mortgageLoanTypeNode");
        children.add(getComponent().createMortgageLoanTypeNode());
        setChildNodeIdentity("mortgageLoanTermExpiryDateNode");
        children.add(getComponent().createMortgageLoanTermExpiryDateNode());
        setChildNodeIdentity("mortgageInterestOnlyExpiryDateNode");
        children.add(getComponent().createMortgageInterestOnlyExpiryDateNode());
        setChildNodeIdentity("mortgageClearingFlagNode");
        children.add(getComponent().createMortgageClearingFlagNode());
        setChildNodeIdentity("mortgageBreakFeeNode");
        children.add(getComponent().createMortgageBreakFeeNode());
        setChildNodeIdentity("mortgageChargePositionNode");
        children.add(getComponent().createMortgageChargePositionNode());
        setChildNodeIdentity("mortgageTermRemainingPeriodNode");
        children.add(getComponent().createMortgageTermRemainingPeriodNode());
        setChildNodeIdentity("mortgageInterestOnlyRemainingPeriodNode");
        children.add(getComponent().createMortgageInterestOnlyRemainingPeriodNode());
        setChildNodeIdentity(null);
        return children;
    }

}
