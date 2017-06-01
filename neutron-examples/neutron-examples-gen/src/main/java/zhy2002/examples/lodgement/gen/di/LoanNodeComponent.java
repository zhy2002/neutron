package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {LoanNodeModule.class})
public interface LoanNodeComponent {

    List<RuleProvider<LoanNode>> provideRuleProviders();

    LoanTypeNode createLoanTypeNode();
    LoanOwingAmountNode createLoanOwingAmountNode();
    LoanLimitAmountNode createLoanLimitAmountNode();
    LoanMonthlyRepaymentNode createLoanMonthlyRepaymentNode();
    LoanClearingFlagNode createLoanClearingFlagNode();
    LoanBreakCostNode createLoanBreakCostNode();
    LoanLenderNameNode createLoanLenderNameNode();
    LoanOwnershipListNode createLoanOwnershipListNode();

    @Subcomponent.Builder
    interface Builder {

        Builder setLoanNodeModule(LoanNodeModule module);

        LoanNodeComponent build();
    }

}
