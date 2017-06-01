package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;

@ComponentScope
@Subcomponent(modules = {LoanNodeModule.class})
public interface LoanNodeComponent {

    LoanTypeNode createLoanTypeNode();
    LoanOwingAmountNode createLoanOwingAmountNode();
    LoanLimitAmountNode createLoanLimitAmountNode();
    LoanMonthlyRepaymentNode createLoanMonthlyRepaymentNode();
    LoanClearingFlagNode createLoanClearingFlagNode();
    LoanBreakCostNode createLoanBreakCostNode();
    LoanLenderNameNode createLoanLenderNameNode();
    LoanOwnershipListNode createLoanOwnershipListNode();

    RuleProvider<LoanNode> getLoanNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setLoanNodeModule(LoanNodeModule module);

        LoanNodeComponent build();
    }

}
