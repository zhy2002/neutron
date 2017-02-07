package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@ExpensesNodeItemScope
@Subcomponent(modules = {ExpensesNodeItemModule.class})
public interface ExpensesNodeItemComponent {

    ExpenseNode provideExpenseNode();

}
