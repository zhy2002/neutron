package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@ExpenseMonthlyRepaymentNodeScope
@Subcomponent(modules = {ExpenseMonthlyRepaymentNodeModule.class})
public interface ExpenseMonthlyRepaymentNodeComponent {

    ExpenseMonthlyRepaymentNodeRuleProvider getExpenseMonthlyRepaymentNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setExpenseMonthlyRepaymentNodeModule(ExpenseMonthlyRepaymentNodeModule module);

        ExpenseMonthlyRepaymentNodeComponent build();
    }
}
