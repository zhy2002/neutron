package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
})
@ExpensesNodeItemScope
public class ExpensesNodeItemModule {

    String getItemName() {
        return "";
    }

    @Provides
    @ExpensesNodeItemScope
    ExpenseNode provideExpenseNode(
        ExpensesNode parent,
        MembersInjector<ExpenseNode> injector
    ) {
        ExpenseNode node = new ExpenseNode(parent, getItemName());

        injector.injectMembers(node);
        return node;
    }

}