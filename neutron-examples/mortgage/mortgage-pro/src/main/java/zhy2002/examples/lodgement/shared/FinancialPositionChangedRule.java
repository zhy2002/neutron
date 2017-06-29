package zhy2002.examples.lodgement.shared;

import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.RefreshEventBinding;
import zhy2002.neutron.UiNodeEvent;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.config.NeutronConstants;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.AnyNodeRemoveEventBinding;
import zhy2002.neutron.event.BigDecimalStateChangeEventBinding;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;

public class FinancialPositionChangedRule extends UiNodeRule<FinancialPositionNode> {

    @Inject
    public FinancialPositionChangedRule(@Owner FinancialPositionNode owner) {
        super(owner);
    }

    protected FinancialPositionNode getFinancialPositionNode() {
        return getOwner();
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Arrays.asList(
                new BigDecimalStateChangeEventBinding(this::updateValues),
                new RefreshEventBinding(
                        this::updateValues,
                        NeutronConstants.NODE_LOADED_REFRESH_REASON
                ),
                new AnyNodeRemoveEventBinding(
                        this::updateValues
                )
        );
    }

    private void updateValues(UiNodeEvent event) {
        if (event.getOrigin() == getFinancialPositionNode().getTotalAssetNode()
                || event.getOrigin() == getFinancialPositionNode().getTotalExpenseNode()
                || event.getOrigin() == getFinancialPositionNode().getTotalLiabilityNode())
            return;

        BigDecimal totalAssets = getTotalAssets();
        TotalAssetNode totalAssetNode = getFinancialPositionNode().getTotalAssetNode();
        if (!totalAssets.equals(totalAssetNode.getValue())) {
            totalAssetNode.setValue(totalAssets);
        }
        BigDecimal totalLiabilities = getTotalLiabilities();
        TotalLiabilityNode totalLiabilityNode = getFinancialPositionNode().getTotalLiabilityNode();
        if (!totalLiabilities.equals(totalLiabilityNode.getValue())) {
            totalLiabilityNode.setValue(totalLiabilities);
        }
        BigDecimal totalExpenses = getTotalExpenses();
        TotalExpenseNode totalExpenseNode = getFinancialPositionNode().getTotalExpenseNode();
        if (!totalExpenses.equals(totalExpenseNode.getValue())) {
            totalExpenseNode.setValue(totalExpenses);
        }
    }

    private BigDecimal getTotalAssets() {
        BigDecimal bigDecimal = new BigDecimal("0");
        AssetsNode assetsNode = getFinancialPositionNode().getAssetsNode();
        SavingsAccountListNode savingsAccountListNode = assetsNode.getSavingsAccountListNode();
        for (int i = 0; i < savingsAccountListNode.getItemCount(); i++) {
            SavingsBalanceNode savingsBalanceNode = savingsAccountListNode.getItem(i).getSavingsBalanceNode();
            if (savingsBalanceNode.hasValue()) {
                bigDecimal = bigDecimal.add(savingsBalanceNode.getValue());
            }
        }
        MotorVehicleListNode motorVehicleListNode = assetsNode.getMotorVehicleListNode();
        for (int i = 0; i < motorVehicleListNode.getItemCount(); i++) {
            VehicleMarketValueNode vehicleMarketValueNode = motorVehicleListNode.getItem(i).getVehicleMarketValueNode();
            if (vehicleMarketValueNode.hasValue()) {
                bigDecimal = bigDecimal.add(vehicleMarketValueNode.getValue());
            }
        }
        OtherAssetListNode otherAssetListNode = assetsNode.getOtherAssetListNode();
        for (int i = 0; i < otherAssetListNode.getItemCount(); i++) {
            OtherAssetMarketValueNode otherLiabilityMonthlyRepaymentNode = otherAssetListNode.getItem(i).getOtherAssetMarketValueNode();
            if (otherLiabilityMonthlyRepaymentNode.hasValue()) {
                bigDecimal = bigDecimal.add(otherLiabilityMonthlyRepaymentNode.getValue());
            }
        }
        return bigDecimal;
    }

    private BigDecimal getTotalLiabilities() {
        BigDecimal bigDecimal = new BigDecimal("0");
        LiabilitiesNode liabilitiesNode = getFinancialPositionNode().getLiabilitiesNode();
        CreditCardListNode creditCardListNode = liabilitiesNode.getCreditCardListNode();
        for (int i = 0; i < creditCardListNode.getItemCount(); i++) {
            CreditCardMonthlyRepaymentNode creditCardMonthlyRepayment = creditCardListNode.getItem(i).getCreditCardMonthlyRepaymentNode();
            if (creditCardMonthlyRepayment.hasValue()) {
                bigDecimal = bigDecimal.add(creditCardMonthlyRepayment.getValue());
            }
        }
        LoanListNode loanListNode = liabilitiesNode.getLoanListNode();
        for (int i = 0; i < loanListNode.getItemCount(); i++) {
            LoanMonthlyRepaymentNode loanMonthlyRepaymentNode = loanListNode.getItem(i).getLoanMonthlyRepaymentNode();
            if (loanMonthlyRepaymentNode.hasValue()) {
                bigDecimal = bigDecimal.add(loanMonthlyRepaymentNode.getValue());
            }
        }
        OtherLiabilityListNode otherLiabilityListNode = liabilitiesNode.getOtherLiabilityListNode();
        for (int i = 0; i < otherLiabilityListNode.getItemCount(); i++) {
            OtherLiabilityMonthlyRepaymentNode otherLiabilityMonthlyRepaymentNode = otherLiabilityListNode.getItem(i).getOtherLiabilityMonthlyRepaymentNode();
            if (otherLiabilityMonthlyRepaymentNode.hasValue()) {
                bigDecimal = bigDecimal.add(otherLiabilityMonthlyRepaymentNode.getValue());
            }
        }
        return bigDecimal;
    }

    private BigDecimal getTotalExpenses() {
        BigDecimal bigDecimal = new BigDecimal("0");
        ExpenseListNode expenseListNode = getFinancialPositionNode().getExpenseListNode();
        for (int i = 0; i < expenseListNode.getItemCount(); i++) {
            ExpenseMonthlyRepaymentNode expenseMonthlyRepaymentNode = expenseListNode.getItem(i).getExpenseMonthlyRepaymentNode();
            if (expenseMonthlyRepaymentNode.hasValue()) {
                bigDecimal = bigDecimal.add(expenseMonthlyRepaymentNode.getValue());
            }
        }
        return bigDecimal;
    }
}
