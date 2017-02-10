package zhy2002.examples.lodgement.gen;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface ExpensesNodeItemFactory {
    ExpenseNode createExpenseNode(String name);
}

@Singleton
public class ExpensesNodeItemProvider {
    @Inject
    MembersInjector<ExpenseNode> expenseNodeInjector;

    @Inject
    protected ExpensesNodeItemProvider () {}

    protected MembersInjector<ExpenseNode> getExpenseNodeInjector() {
        return this.expenseNodeInjector;
    }

    protected ExpenseNode newExpenseNode (
        ExpensesNode parent,
        String name
    ) {
        return new ExpenseNode(parent, name);
    }

    ExpensesNodeItemFactory createFactory(ExpensesNode parent) {
        return new ExpensesNodeItemFactoryImpl(parent);
    }

    private class ExpensesNodeItemFactoryImpl implements ExpensesNodeItemFactory {

        private final ExpensesNode parent;
        
        private ExpensesNodeItemFactoryImpl(ExpensesNode parent) {
            this.parent = parent;
        }

        @Override
        public ExpenseNode createExpenseNode(String name) {
            ExpenseNode node = newExpenseNode(parent, name);
            expenseNodeInjector.injectMembers(node);
            return node;
        }

    }
}
