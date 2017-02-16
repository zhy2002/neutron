package zhy2002.examples.lodgement.gen;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface ExpenseListNodeItemFactory {
    ExpenseNode createExpenseNode(String name);
}

@Singleton
public class ExpenseListNodeItemProvider {
    @Inject
    MembersInjector<ExpenseNode> expenseNodeInjector;

    @Inject
    protected ExpenseListNodeItemProvider () {}

    protected MembersInjector<ExpenseNode> getExpenseNodeInjector() {
        return this.expenseNodeInjector;
    }

    protected ExpenseNode newExpenseNode (
        ExpenseListNode parent,
        String name
    ) {
        return new ExpenseNode(parent, name);
    }

    protected void configureExpenseNode(ExpenseNode node) {
    }

    ExpenseListNodeItemFactory createFactory(ExpenseListNode parent) {
        return new ExpenseListNodeItemFactoryImpl(parent);
    }

    private class ExpenseListNodeItemFactoryImpl implements ExpenseListNodeItemFactory {

        private final ExpenseListNode parent;
        
        private ExpenseListNodeItemFactoryImpl(ExpenseListNode parent) {
            this.parent = parent;
        }

        @Override
        public ExpenseNode createExpenseNode(String name) {
            ExpenseNode node = newExpenseNode(parent, name);
            expenseNodeInjector.injectMembers(node);
            configureExpenseNode(node);
            return node;
        }

    }
}
