package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
    ExpenseNodeChildComponent.class
})
@ExpensesNodeItemScope
public class ExpensesNodeItemModule {

    private final ExpensesNode parent;

    public ExpensesNodeItemModule(ExpensesNode parent) {
        this.parent = parent;
    }

    String getItemName() {
        return String.valueOf(parent.getChildSequenceNumber());
    }

    @Provides
    @ExpensesNodeItemScope
    ExpenseNode provideExpenseNode(
        MembersInjector<ExpenseNode> injector
    ) {
        ExpenseNode node = new ExpenseNode(parent, getItemName());

        injector.injectMembers(node);
        return node;
    }

}