package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@LoanMonthlyRepaymentNodeScope
@Subcomponent(modules = {LoanMonthlyRepaymentNodeModule.class})
public interface LoanMonthlyRepaymentNodeComponent {

    LoanMonthlyRepaymentNodeRuleProvider getLoanMonthlyRepaymentNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setLoanMonthlyRepaymentNodeModule(LoanMonthlyRepaymentNodeModule module);

        LoanMonthlyRepaymentNodeComponent build();
    }
}
