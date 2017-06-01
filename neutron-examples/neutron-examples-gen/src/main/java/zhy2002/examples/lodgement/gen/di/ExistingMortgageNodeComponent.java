package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {ExistingMortgageNodeModule.class})
public interface ExistingMortgageNodeComponent {

    List<RuleProvider<ExistingMortgageNode>> provideRuleProviders();

    MortgageLenderInstitutionNode createMortgageLenderInstitutionNode();
    MortgqageUnpaidBalanceNode createMortgqageUnpaidBalanceNode();
    MortgageLimitAmountNode createMortgageLimitAmountNode();
    MortgageMonthlyRepaymentNode createMortgageMonthlyRepaymentNode();
    MortgageBorrowerRateNode createMortgageBorrowerRateNode();
    MortgageLoanTypeNode createMortgageLoanTypeNode();
    MortgageLoanTermExpiryDateNode createMortgageLoanTermExpiryDateNode();
    MortgageInterestOnlyExpiryDateNode createMortgageInterestOnlyExpiryDateNode();
    MortgageClearingFlagNode createMortgageClearingFlagNode();
    MortgageBreakFeeNode createMortgageBreakFeeNode();
    MortgageChargePositionNode createMortgageChargePositionNode();
    MortgageTermRemainingPeriodNode createMortgageTermRemainingPeriodNode();
    MortgageInterestOnlyRemainingPeriodNode createMortgageInterestOnlyRemainingPeriodNode();

    @Subcomponent.Builder
    interface Builder {

        Builder setExistingMortgageNodeModule(ExistingMortgageNodeModule module);

        ExistingMortgageNodeComponent build();
    }

}
