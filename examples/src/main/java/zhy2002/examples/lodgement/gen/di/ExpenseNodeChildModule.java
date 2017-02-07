package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
})
@ExpenseNodeChildScope
public class ExpenseNodeChildModule {


    @Provides
    @ExpenseNodeChildScope
    @Named("expenseTypeNode")
    ExpenseTypeNode provideExpenseTypeNode(
        ExpenseNode parent,
        MembersInjector<ExpenseTypeNode> injector
    ) {
        ExpenseTypeNode node = new ExpenseTypeNode(parent, "expenseTypeNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @ExpenseNodeChildScope
    @Named("expenseDescriptionNode")
    ExpenseDescriptionNode provideExpenseDescriptionNode(
        ExpenseNode parent,
        MembersInjector<ExpenseDescriptionNode> injector
    ) {
        ExpenseDescriptionNode node = new ExpenseDescriptionNode(parent, "expenseDescriptionNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @ExpenseNodeChildScope
    @Named("expenseMonthlyRepaymentNode")
    ExpenseMonthlyRepaymentNode provideExpenseMonthlyRepaymentNode(
        ExpenseNode parent,
        MembersInjector<ExpenseMonthlyRepaymentNode> injector
    ) {
        ExpenseMonthlyRepaymentNode node = new ExpenseMonthlyRepaymentNode(parent, "expenseMonthlyRepaymentNode");

        injector.injectMembers(node);
        return node;
    }

}