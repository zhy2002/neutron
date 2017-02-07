package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@ExpenseNodeChildScope
@Subcomponent(modules = {ExpenseNodeChildModule.class})
public interface ExpenseNodeChildComponent {

    ExpenseTypeNode provideExpenseTypeNode(@Named("expenseTypeNode") ExpenseTypeNode impl);
    ExpenseDescriptionNode provideExpenseDescriptionNode(@Named("expenseDescriptionNode") ExpenseDescriptionNode impl);
    ExpenseMonthlyRepaymentNode provideExpenseMonthlyRepaymentNode(@Named("expenseMonthlyRepaymentNode") ExpenseMonthlyRepaymentNode impl);

    @Subcomponent.Builder
    interface Builder {

        Builder setExpenseNodeChildModule(ExpenseNodeChildModule module);

        ExpenseNodeChildComponent build();
    }
}
