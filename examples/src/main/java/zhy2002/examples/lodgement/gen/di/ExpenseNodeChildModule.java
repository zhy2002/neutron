package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
})
@ExpenseNodeChildScope
public class ExpenseNodeChildModule {

    private final ExpenseNode parent;

    public ExpenseNodeChildModule(ExpenseNode parent) {
        this.parent = parent;
    }


    @Provides
    @ExpenseNodeChildScope
    @Named("expenseTypeNode")
    ExpenseTypeNode provideExpenseTypeNode(
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
        MembersInjector<ExpenseMonthlyRepaymentNode> injector
    ) {
        ExpenseMonthlyRepaymentNode node = new ExpenseMonthlyRepaymentNode(parent, "expenseMonthlyRepaymentNode");

        injector.injectMembers(node);
        return node;
    }

}