package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@LoanNodeChildScope
@Subcomponent(modules = {LoanNodeChildModule.class})
public interface LoanNodeChildComponent {

    LoanTypeNode provideLoanTypeNode(@Named("loanTypeNode") LoanTypeNode impl);
    LoanLenderNameNode provideLoanLenderNameNode(@Named("loanLenderNameNode") LoanLenderNameNode impl);
    LoanLimitAmountNode provideLoanLimitAmountNode(@Named("loanLimitAmountNode") LoanLimitAmountNode impl);
    LoanOwingAmountNode provideLoanOwingAmountNode(@Named("loanOwingAmountNode") LoanOwingAmountNode impl);
    LoanMonthlyRepaymentNode provideLoanMonthlyRepaymentNode(@Named("loanMonthlyRepaymentNode") LoanMonthlyRepaymentNode impl);
    LoanClearingFlagNode provideLoanClearingFlagNode(@Named("loanClearingFlagNode") LoanClearingFlagNode impl);
    LoanBreakCostNode provideLoanBreakCostNode(@Named("loanBreakCostNode") LoanBreakCostNode impl);

    @Subcomponent.Builder
    interface Builder {

        Builder setLoanNodeChildModule(LoanNodeChildModule module);

        LoanNodeChildComponent build();
    }
}
